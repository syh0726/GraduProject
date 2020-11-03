<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/accountStyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>로그인 페이지</title>
</head>
<body>
<center>
<div style="padding-top:50px;"><a href="afk">[돌아가기]</a></div>
<div id="l_contents"></div>
<h1>로그인</h1>
<form action="login" method="post">
	<table>
		<tr>
			<td><input type="text" name="id" placeholder="ID" ></td>
			<td rowspan="2"><input type="submit" value="로그인" style="height:70px;"></td>
		</tr>
		<tr>
			<td><input type="password" name="pwd" placeholder="Password" ></td>
		</tr>
	</table>
</form>
<a href="id_found">아이디 찾기</a>|
<a href="pw_found">비밀번호 찾기</a>|
<a href="regist">회원 가입</a>
</center>
</div>
</body>
</html>