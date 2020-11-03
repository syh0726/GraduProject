<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/accountStyle.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="resources/js/check.js"></script>
<title>회원 가입 페이지</title>
</head>
<body>
<center>
<form action="regist_service" method="post">
	회원가입 <br/><br/>
	아이디<br/>
	<input type="text" name="id" id="id" size="30"><br/>
	<div class="id_check" id="id_check" style="height:20px;"></div>
	비밀번호<br/>
	<input type="password" name="pwd" id="pwd" size="30" ><br/><br/> 
	비밀번호 재확인<br/>
	<input type="password" name="pwdchk" id="pwdchk" size="30"><br/>
	<div id="pwd_check" style="height:20px;"></div>
	이름<br/>
	<input type="text" name="name" size="30"><br/><br/>
	휴대폰<br/>
	<input type="text" name="phone" id="phone" placeholder="000-0000-000" size="30"><br/>
	<div id="phone_check" style="height:20px;"></div>
	이메일<br/>
	<input type="text" name="email" id="email" size="30" ><br/>
	<div id="email_check" style="height:20px;"></div>
	<input type="submit" id="sign" value="회원 가입">
</form>
</center>

</body>
</html>