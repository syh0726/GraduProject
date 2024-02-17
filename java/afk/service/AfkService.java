package afk.service;

import java.util.HashMap;
import java.util.List;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afk.entity.Afk;
import afk.entity.AfkMap;
import afk.entity.AfkValue;
import afk.repository.AfkRepository;

@Service
public class AfkService {
	@Autowired
	AfkRepository afkrepository;
	
	public AfkValue calculator(AfkMap afk) {				//계산하여 페이지의 좌측 값들을 반환 합니다.
		List<Afk> afkList=afkrepository.findAll();
		AfkValue afkvalue = new AfkValue();
		
		double totalExp=0;
		double totalGold=0;
		double totalEssence=0;
		double maxTotal=0;
		int option; //최대 시간을 구하기 위한 옵션값입니다. 옵션이 (1이라면 경험치 2라면 골드 3이라면 영웅의 가루)가 최대시간
		
		int weeks=0;  //레벨업까지 도달하는 주 입니다.
		int days=0;   //레벨업까지 도달하는 일수 입니다.
		int e_hour=0;	// 레벨업까지 도달하는 경험치 걸리는 시간
		int e_min=0;	//레벨업까지 도달하는 경험치 걸리는 분
		int e_sec=0;	//레벨업까지 도달하는 경험치 걸리는 초
		int g_hour=0;	// 레벨업까지 도달하는 골드 걸리는 시간
		int g_min=0;	//레벨업까지 도달하는 골드 걸리는 분
		int g_sec=0;	//레벨업까지 도달하는 골드 걸리는 초
		int ec_hour=0;	// 레벨업까지 도달하는 영웅의 가루 걸리는 시간
		int ec_min=0;	//레벨업까지 도달하는 영웅의 가루 걸리는 분
		int ec_sec=0;	//레벨업까지 도달하는 영웅의 가루 걸리는 초
		
		int s_lv=Integer.parseInt(afk.getStart())-1;
		int e_lv=Integer.parseInt(afk.getEnd())-1;
		int n_exp=Integer.parseInt(afk.getN_exp());			//현재 경험치
		int n_gold=Integer.parseInt(afk.getN_gold());		//현재 골드
		int n_essence=Integer.parseInt(afk.getN_essence());	//현재 영웅의 가루
		int m_exp=Integer.parseInt(afk.getM_exp());			//분당 경험치 획득량
		int m_gold=Integer.parseInt(afk.getM_gold());		//분당 골드 획득량
		int h_essence=Integer.parseInt(afk.getH_essence());	//시간당 영웅의 가루 획득량
		
		String t_exp;		//레벨업 까지 도달하는 경험치 시간
		String t_gold;		//레벨업까지 도달하는 골드 시간
		String t_essence;	//레벨업까지 도달하는 경험치 영웅의 가루
		String max_time = null;  //레벨업까지 도달하는 최대 시간
		
		while(s_lv<e_lv) {
			totalExp+=afkList.get(s_lv).getExp();
			totalGold+=afkList.get(s_lv).getGold();
			totalEssence+=afkList.get(s_lv).getEssence();
			s_lv++;
		}
		
		if(s_lv>=240) {
			totalExp=totalExp*10;
			totalGold=totalGold*10;
		}
		
		System.out.println(n_exp+" "+n_gold+" "+n_essence);
		totalExp=this.subtract_resource(totalExp, n_exp);
		totalGold=this.subtract_resource(totalGold, n_gold);
		totalEssence=this.subtract_resource(totalEssence, n_essence);
		
		if((totalExp/m_exp)>(totalGold/m_gold)) {
			if((totalExp/m_exp)>((totalEssence/h_essence)*60)) {
				maxTotal=totalExp;
				option=1;
			}else {
				maxTotal=totalEssence;
				option=3;
			}
		}else {
			if((totalGold/m_gold)>((totalEssence/h_essence)*60)) {
				maxTotal=totalGold;
				option=2;
			}else {
				maxTotal=totalEssence;
				option=3;
			}
		}
		
		System.out.println("totalExp : "+totalExp);
		System.out.println("totalGold:" +totalGold);
		System.out.println("totalEssence: "+totalEssence);
		
		//밑에 과정에서 분당 자원 획득량이 0일 경우 total값을 모두 0으로 만드므로 0이되기전에 미리 값을 저장해둡니다.
		afkvalue.setTotalExp((int)totalExp);
		afkvalue.setTotalGold((int)totalGold);
		afkvalue.setTotalEssence((int)totalEssence);
		
		try {
			if(totalExp!=0) {
				e_min=(int)(totalExp)/m_exp;
				e_sec=(int)(((totalExp/m_exp)-(int)(totalExp/m_exp))*60);
			}
		
			if(totalGold!=0) {
				g_min=(int)(totalGold)/m_gold;
				g_sec=(int)(((totalGold/m_gold)-(int)(totalGold/m_gold))*60);
			}
			
			if(totalEssence!=0) {
				ec_hour=(int)(totalEssence)/h_essence;
				ec_min=(int)(((totalEssence%h_essence)/h_essence)*60);
			}

		}catch(ArithmeticException are) {
			if(m_exp==0) {
				totalExp=0;
			}
			if(m_gold==0) {
				totalGold=0;
			}
			if(h_essence==0) {
				totalEssence=0;
			}
		}
		
		if(e_min>=60) {
			e_hour=e_min/60;
			e_min=e_min%60;
		}else {
			e_hour=0;
		}
		
		if(g_min>=60) {
			g_hour=g_min/60;
			g_min=g_min%60;
		}else {
			g_hour=0;
		}
			
		t_exp=e_hour+":"+e_min+":"+e_sec;
		t_gold=g_hour+":"+g_min+":"+g_sec;
		t_essence=ec_hour+":"+ec_min+":"+ec_sec;
		
		System.out.println(option);
		
		if(option==1) {
			max_time=this.get_max_time(afkvalue, e_hour, e_min, e_sec,this.size_total(totalExp, m_exp));
		}else if(option==2) {
			max_time=this.get_max_time(afkvalue, g_hour, g_min, g_sec,this.size_total(totalGold, m_gold));
		}else if(option==3) {
			max_time=this.get_max_time(afkvalue, ec_hour, ec_min, ec_sec,this.essence_size(totalEssence, h_essence));
		}
			
		System.out.println("t_exp:"+t_exp);
		System.out.println("t_gold:"+t_gold);
		System.out.println("t_essence:"+t_essence);
		System.out.println("max_time:"+max_time);
		
		
		//토탈 값들은 위에서 미리 저장하였습니다.
		afkvalue.setT_exp(t_exp);			//경험치 시간
		afkvalue.setT_gold(t_gold);			//골드 시간
		afkvalue.setT_essence(t_essence);	//에센스 시간
		afkvalue.setMax_time(max_time);		//최대 시간
		
		return afkvalue;
	}
	
	public AfkValue Get_MaxTime(AfkMap afkmap) {
		AfkValue afkvalue=new AfkValue();
		int hour=afkmap.getMax_hour();
		int min=afkmap.getMax_min();
		int sec=afkmap.getMax_sec();
		int total=sec+(min*60)+(hour*60*60);
		
		afkvalue.setMax_time(get_max_time(afkvalue,hour,min,sec,this.size_total(total, 60)));
		return afkvalue;
	}
	
	//최대 시간을 계산하는 함수 입니다.
	public String get_max_time(AfkValue afkvalue,int hour,int min,int sec,int option) {
		int days=0;
		int weeks=0;
				
		afkvalue.setMax_hour(hour);	//최대 시간
		afkvalue.setMax_min(min);	//최대 분
		afkvalue.setMax_sec(sec);	//최대 초 지정  나중에 뷰에서 js를 이용해서 합칠 것입니다.
		
		System.out.println(hour+" : "+" : "+min+" : "+sec);
		
		if(hour>=24) {
			days=hour/24;
			hour=hour%24;
			
			if(days>=7) {
				weeks=days/7;
				days=days%7;
			}
		}
		
		if(option==1) {
			return sec+"초";
		}else if(option==2) {
			return min+"분 "+sec+"초";
		}else if(option==3) {
			return hour+"시간 "+min+"분 "+sec+"초";
		}else if(option==4) {
			return days+"일 "+hour+"시간 "+min+"분 "+sec+"초";
		}else {
			return weeks+"주 "+days+"일 "+hour+"시간 "+min+"분 "+sec+"초";
		}
		
	}
	
	//최대시간의 사이즈 측정
	public int size_total(double total,int resource) {
		if(total<resource) {			//최대시간이 초 단위 일 경우 		
			return 1;
		}else if(total<resource*60) {	//최대시간이 분 단위 일 경우		
			return 2;
		}else if(total<resource*60*24){	//최대시간이 시간 단위 일 경우		
			return 3;
		}else if(total<resource*60*24*7){	//최대시간이 일 단위 일 경우	
			return 4;
		}else {								//최대시간이 주 단위 일 경우
			return 5;
		}
	}
	
	//가루는 최소시간이 분이기 때문에 최대시간을 측정할 때 따로 구현하였습니다.
	public int essence_size(double total,int resource) {
		if(total<resource) {			  //가루는 분단위 일 경우
			return 2;
		}else if(total<resource*24) {		//가루는 시간 단위 일 경우
			return 3;
		}else if(total<resource*24*7){		//가루는 일 단위일 경우
			return 4;
		}else {								//가루는 주 단위일 경우
			return 5;
		}
	}
	
	//필요한 자원에서 현재 있는 자원을 뺍니다.
	public double subtract_resource(double total,int resource) {
		if(total<resource) {
			total=0;
		}else {
			total-=resource;
		}
		
		return total;
	}
	
	public String trans_service(String src_text){
		String apikey="";
		 String translate=null;
		try {
			String text=URLEncoder.encode(src_text,"UTF-8");
			String postParams="src_lang=en&target_lang=kr&query="+text;
			String apiURL="https://dapi.kakao.com/v2/translation/translate?"+postParams;
			URL url=new URL(apiURL);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			String userCredentials=apikey;
			String basicAuth="KakaoAK "+userCredentials;
			con.setRequestProperty("Authorization", basicAuth);
			con.setRequestMethod("GET");
			//con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			con.setRequestProperty("Content-Type","application/json");
			con.setRequestProperty("charset", "UTF-8");
			con.setUseCaches(false);
			con.setDoInput(true);
			con.setDoOutput(true);
			int responseCode=con.getResponseCode();
			System.out.println("responseCode>>"+responseCode);
			BufferedReader br;
			if(responseCode==200) {
				br=new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				br=new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer res=new StringBuffer();
			while((inputLine=br.readLine())!=null){
				res.append(inputLine);
			}
			
			JSONParser parser=new JSONParser();
			Object obj=parser.parse(res.toString());
			JSONObject jsonObj = (JSONObject)obj;
			JSONArray jsonArr = (JSONArray) jsonObj.get("translated_text");
			translate=jsonArr.get(0).toString();

			br.close();
		}catch(Exception e) {
			System.out.println("오류 발생");
			System.out.println(e);
		}
		return translate;
	}
}
	
