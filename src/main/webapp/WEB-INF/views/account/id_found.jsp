<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/accountStyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아이디 찾기</title>
</head>

   <center>
      <h1>아이디 찾기</h1>
      <div id=f_div>
         <form action="id_found_email" method="post">
            <p id="f_mail">본인 이메일로 아이디 찾기</p>
            <table id="f_table" align="center">
               <tr>
                  <td>이름 :</td>
                  <td><input type="text" name="name" size="23" ></td>
               </tr>
               <tr>
                  <td>이메일 :</td>
                  <td><input type="text" name="email" size="23" ></td>
               </tr>
            </table>
            <br/> 
            <input type="submit" value="찾기"> 
            <input type="reset" value="취소">
         </form>

         <form action="id_found_phone" method="post">
            <p id="f_mail">전화번호로 아이디 찾기</p>
            <table id="f_table" align="center">
               <tr>
                  <td>이름 :</td>
                  <td><input type="text" name="name" size="23" ></td>
               </tr>
               <tr>
                  <td>전화번호 :</td>
                  <td><input type="text" name="phone" size="23" ></td>
               </tr>
            </table>
            <br /> 
            <input type="submit" value="찾기"> <input type="reset" value="취소">
         </form>
      </div>
   </center>
</body>
</html>