<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.List" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/boardStyle.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>게시글</title>
</head>
<body>
<div id="s_left"></div>
<div id="contents">
	<center><h1>게시글</h1>
	<hr>
	${board.heading } ${board.title }<br/>
	${board.regDate }<br/>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="orange">내용</td>
			<td align="left"><textarea name="content" cols="100" rows="20" readonly="readonly" style="resize:none;">${board.content}</textarea></td>
		</tr>
	</table>
	<hr>
	<form action="insert_comment?num=${board.num }" method="post">
		<textarea name="comment" cols="105" rows="5" placeholder="댓글을 남겨보세요"></textarea><br/>
	<input type="submit" align="right" value="등록"><br/>
	</form>
	<hr/>
	<table border="1" cellpadding="0" cellspacing="0">
	<c:forEach items="${comment }" var="cmt">
	<tr>
		<td>${cmt.writer }</td>
		<td><textarea cols="100" readonly="readonly" style="resize:none;">${cmt.comment }</textarea></td>
	</tr>
	</c:forEach>
	</table>
	<hr/>
	</center>
	<center>
		<a href="insertBoard">글 등록</a>&nbsp;&nbsp;
		<a href="BoardList">글 목록</a>&nbsp;&nbsp;
		<c:if test="${sessionScope.id == board.name }">
			<a onclick="return confirm('정말로 삭제하시겠습니까?')" href="deleteBoard?num=${board.num}">글 삭제</a>&nbsp;&nbsp;
			<a href="updateBoard?num=${board.num }">글 수정</a>
		</c:if>
	</center>
</div>
<div id="s_right"></div>

</body>
</html>