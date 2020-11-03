<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="resources/css/InfoStyle.css"> 
<script type="text/javascript" src="http://code.jquery.com/jquery-Latest.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-Latest.min.js"></script>
<script type="text/javascript" src="resources/js/Information.js"></script>
<title>영웅 정보</title>
</head>
<body>
<div class="top">
	<button onClick="window.open('https://www.rafkarena.com/new-player-guides')">[reddit 가이드]</button>
	<button onClick="window.open('https://cafe.naver.com/afkarenakr')">[Naver 카페]</button>
</div>
<div class="left"></div>
<div class="hero_content">
	<table>
		<tr><th>반신/악마</th><th>위키</th></tr>
		<tr>
			<td><img src="resources/image/high_epic/Athalia_Icon.png"><font>아탈리아</font></td>
			<td><button onClick="search_wiki('Athalia');">wiki</button></td>
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Ezizh_Icon.png"><font>에이츠</font></td>
			<td><button onClick="search_wiki('Ezizh');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Flora_Icon.png"><font>플로라</font></td>
			<td><button onClick="search_wiki('Flora');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Khazard_Icon.png"><font>카자드</font></td>
			<td><button onClick="search_wiki('Khazard');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Lucretia_Icon.png"><font>루클레시아</font></td>
			<td><button onClick="search_wiki('Lucretia');">wiki</button></td>
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Mehira_Icon.png"><font>메히라</font></td>
			<td><button onClick="search_wiki('Mehira');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Mezoth_Icon.png"><font>메조스</font></td>
			<td><button onClick="search_wiki('Mezoth');">wiki</button></td>
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Orthros_Icon.png"><font>오르토로스</font>
			<td><button onClick="search_wiki('Orthros');">wiki</button></td>
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Talene_Icon.png"><font>탈렌</font></td>
			<td><button onClick="search_wiki('Talene');">wiki</button></td>
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Twins_Icon.png"><font>쌍둥이</font></td>
			<td><button onClick="search_wiki('Elijah_%26_Lailah');">wiki</button></td>
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/WuKong_Icon.png"><font>오공</font></td>
			<td><button onClick="search_wiki('Wu_Kong');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Zaphrael_Icon.png"><font>자파엘</font></td>
			<td><button onClick="search_wiki('Zaphrael');">wiki</button></td>
		</tr>
		<tr>
			<td><img src="resources/image/high_epic/Zolrath_Icon.png"><font>졸라스</font></td>
			<td><button onClick="search_wiki('Zolrath');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/other/Arthur_Icon.png"><font>아서</font></td>
			<td><button onClick="search_wiki('Arthur');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/other/Nakoruru_Icon.png"><font>나코루루</font></td>
			<td><button onClick="search_wiki('Nakoruru');">wiki</button></td>
		</tr>
		<tr>
			<td><img src="resources/image/other/EzIo_Icon.png"><font>에지오</font></td>
			<td><button onClick="search_wiki('Ezio');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/other/Ukyo_Icon.png"><font>우쿄</font></td>
			<td><button onClick="search_wiki('Ukyo');">wiki</button></td>
		</tr>
	</table>
	<br/><br/>
	<table>
		<tr><th>레오프론</th><th>위키</th></tr>
		<tr>
			<td><img src="resources/image/epic/Estrilda_Icon.png"><font>에스트릴다</font></td>
			<td><button onClick="search_wiki('Estrilda');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Belinda_Icon.png"><font>벨린다</font></td>
			<td><button onClick="search_wiki('Belinda');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Raine_Icon.png"><font>레인</font></td>
			<td><button onClick="search_wiki('Raine');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Fawkes_Icon.png"><font>포크스</font></td>
			<td><button onClick="search_wiki('Fawkes');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Lucius_Icon.png"><font>루시우스</font></td>
			<td><button onClick="search_wiki('Lucius');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Thane_Icon.png"><font>세인</font></td>
			<td><button onClick="search_wiki('Thane');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Hendrik_Icon.png"><font>핸드릭</font></td>
			<td><button onClick="search_wiki('Hendrik');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Rowan_Icon.png"><font>로완</font></td>
			<td><button onClick="search_wiki('Rowan');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Gwyneth_Icon.png"><font>귀네스</font></td>
			<td><button onClick="search_wiki('Gwyneth');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Rosaline_Icon.png"><font>로젤린</font></td>
			<td><button onClick="search_wiki('Rosaline');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Cecilia_Icon.png"><font>세실리아</font></td>
			<td><button onClick="search_wiki('Cecilia');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Rigby_Icon.png"><font>릭비</font></td>
			<td><button onClick="search_wiki('Rigby');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Oscar_Icon.png"><font>오스카</font></td>
			<td><button onClick="search_wiki('Oscar');">wiki</button></td>	
		</tr>
	</table>
	<br/><br/>
	
	<table>
		<tr><th>오크</th><th>위키</th></tr>
		<tr>
			<td><img src="resources/image/epic/Brutus_Icon.png"><font>부루투스</font></td>
			<td><button onClick="search_wiki('Brutus');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Khasos_Icon.png"><font>카소스</font></td>
			<td><button onClick="search_wiki('Khasos');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Vurk_Icon.png"><font>버크</font></td>
			<td><button onClick="search_wiki('Vurk');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Numisu_Icon.png"><font>누미스</font></td>
			<td><button onClick="search_wiki('Numisu');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Skreg_Icon.png"><font>스트레그</font></td>
			<td><button onClick="search_wiki('Skreg');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Warek_Icon.png"><font>워렉</font></td>
			<td><button onClick="search_wiki('Warek');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Antandra_Icon.png"><font>안탄드라</font></td>
			<td><button onClick="search_wiki('Antandra');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Safiya_Icon.png"><font>사피아</font></td>
			<td><button onClick="search_wiki('Safiya');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Satrana_Icon.png"><font>사트리나</font></td>
			<td><button onClick="search_wiki('Satrana');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Tidus_Icon.png"><font>타이더스</font></td>
			<td><button onClick="search_wiki('Tidus');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Drez_Icon.png"><font>드레즈</font></td>
			<td><button onClick="search_wiki('Drez');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Skriath_Icon.png"><font>스크리아스</font></td>
			<td><button onClick="search_wiki('Skriath');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Anoki_Icon.png"><font>아노키</font></td>
			<td><button onClick="search_wiki('Anoki');">wiki</button></td>	
		</tr>
	</table>
	<br/><br/>
	
	<table>
		<tr><th>엘프</th><th>위키</th></tr>
		<tr>
			<td><img src="resources/image/epic/Nemora_Icon.png"><font>네모라</font></td>
			<td><button onClick="search_wiki('Nemora');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Kaz_Icon.png"><font>케즈</font></td>
			<td><button onClick="search_wiki('Kaz');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Lyca_Icon.png"><font>라이카</font></td>
			<td><button onClick="search_wiki('Lyca');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Tasi_Icon.png"><font>타시</font></td>
			<td><button onClick="search_wiki('Tasi');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Ulmus_Icon.png"><font>울머스</font></td>
			<td><button onClick="search_wiki('Ulmus');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Seirus_Icon.png"><font>세이러스</font></td>
			<td><button onClick="search_wiki('Seirus');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Eironn_Icon.png"><font>에이론</font></td>
			<td><button onClick="search_wiki('Eironn');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Gorvo_Icon.png"><font>고르보</font></td>
			<td><button onClick="search_wiki('Gorvo');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Lorsan_Icon.png"><font>로잔</font></td>
			<td><button onClick="search_wiki('Lorsan');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Saurus_Icon.png"><font>사우루스</font></td>
			<td><button onClick="search_wiki('Saurus');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Solice_Icon.png"><font>솔리스</font></td>
			<td><button onClick="search_wiki('Solise');">wiki</button></td>		
		</tr>
	</table>
	<br/><br/>
	
	<table>
		<tr><th>그레이브본</th><th>위키</th></tr>
		<tr>
			<td><img src="resources/image/epic/Grezhul_Icon.png"><font>그레쥴</font></td>
			<td><button onClick="search_wiki('Grezhul');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Shemira_Icon.png"><font>세미라</font></td>
			<td><button onClick="search_wiki('Shemira');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Thoran_Icon.png"><font>토란</font></td>
			<td><button onClick="search_wiki('Thoran');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Isabella_Icon.png"><font>이사벨라</font></td>
			<td><button onClick="search_wiki('Isabella');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Nara_Icon.png"><font>나라</font></td>
			<td><button onClick="search_wiki('Nara');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Ferael_Icon.png"><font>페라엘</font></td>
			<td><button onClick="search_wiki('Ferael');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Baden_Icon.png"><font>바든</font></td>
			<td><button onClick="search_wiki('Baden');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Kelthur_Icon.png"><font>켈투르</font></td>
			<td><button onClick="search_wiki('Kelthur');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Oden_Icon.png"><font>오든</font></td>
			<td><button onClick="search_wiki('Oden');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Izold_Icon.png"><font>이졸드</font></td>
			<td><button onClick="search_wiki('Izold');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Torne_Icon.png"><font>토른</font></td>
			<td><button onClick="search_wiki('Torne');">wiki</button></td>		
		</tr>
		<tr>
			<td><img src="resources/image/epic/Daimon_Icon.png"><font>데이먼</font></td>
			<td><button onClick="search_wiki('Daimon');">wiki</button></td>	
		</tr>
		<tr>
			<td><img src="resources/image/epic/Theowyn_Icon.png"><font>테라민</font></td>
			<td><button onClick="search_wiki('Theowyn');">wiki</button></td>		
		</tr>
	</table>
</div>
</body>
</html>