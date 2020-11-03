<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 
<%@page import="org.jsoup.Jsoup" %>
<%@page import="org.jsoup.nodes.Document" %>
<%@page import="org.jsoup.nodes.Element" %>
<%@page import="org.jsoup.select.Elements" %>   
 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="resources/css/herowikiStyle.css"> 
<title>영웅 정보</title>
</head>
<body>
<%
	String name=(String)request.getAttribute("name");
	String url="https://afk-arena.fandom.com/wiki/"+name;

	Document doc=Jsoup.connect(url).get();
	
	Elements posts=doc.body().getElementsByClass("mw-parser-output");
	Elements skil=posts.select("td");	//tr
	Elements weaphone=posts.select("ul");
	
	String t_skil;
	String t_weaphone;
	
	session.setAttribute("skil", skil.text());
	session.setAttribute("weaphone",weaphone.text());
	session.setAttribute("name",name);
	//System.out.println(weaphone.select("li"));
%>
<center><a href="trans_Info">[영어]</a></center>
<h1>${name }</h1>
<table>
<tr><th>레벨</th><th>스킬</th></tr>
<%
	for(int i=0;i<skil.size();i++){
		if(i%3!=1){
			if(i%3==0){
%><tr>
<%
			}
%>
<td>
<%
			out.println(skil.get(i).text());
		
%></td>

<%
		}
		if(i%3==2){
%>
	</tr>
<% 
		}
	}
%>
</table>
<h2>전용 장비</h2>
<%
	for(int i=4;i<weaphone.size()-2;i++){
		out.println(weaphone.get(i).text());
%>	
	<br/>
<% 
	}

%>

<h2>가구 효과</h2>
<%
		int i=weaphone.size()-2;
		int j=0;
		String temp=weaphone.get(i).text();
		String furniture[]=temp.split("\\[");
		
		for(String e:furniture){
			if(j!=0){
				out.println("["+e);
			}
			j++;
%>	
	<br/>
<%
		}
%>
<br/>
</body>
</html>