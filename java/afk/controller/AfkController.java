package afk.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import afk.entity.AfkMap;
import afk.entity.AfkValue;
import afk.service.AfkService;

@Controller
public class AfkController {
	@Autowired
	AfkService afkservice;
	
	@RequestMapping(value= {"/","afk"})
	public String afk_table(Model model) {
		System.out.println("afk 아레나 사이트");
		return "afk/afk_arena";
	}

	@RequestMapping("calculator")
	public @ResponseBody AfkValue afk_calculator(Model model,AfkMap afk) {
		System.out.println("계산기 실행");
		AfkValue afkvalue=new AfkValue();
		afkvalue=afkservice.calculator(afk);
		return afkvalue;
	}
	
	@RequestMapping("get_MaxTime")
	public @ResponseBody AfkValue get_MaxTime(Model model,AfkMap afk) {
		System.out.println("최대시간에 전체 합 구하기");
		AfkValue afkvalue=new AfkValue();
		afkvalue=afkservice.Get_MaxTime(afk);
		return afkvalue;
	}
	
	@RequestMapping("hero_info")
	public String trans_Info(Model model) {
		System.out.println("영웅 정보 페이지");
		return "afk/Hero_Infomation";
	}
	
	@RequestMapping("wiki")
	public String hero_wiki(Model model,@RequestParam("name") String name) {
		System.out.println("영웅 위키");
		model.addAttribute("name",name);
		return "afk/Hero_wiki";
	}
	
	@RequestMapping("trans_Info")
	public String hero_InfoPage(Model model,HttpServletRequest req) {
		System.out.println("영웅 정보 페이지");
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("name");
		String skil=(String)session.getAttribute("skil");
		String weaphone=(String)session.getAttribute("weaphone");
		
		//afkservice.trans_service(skil);
		weaphone=afkservice.trans_service(weaphone);
		System.out.println(weaphone);
		return "afk/Hero_Infomation";
	}
}
