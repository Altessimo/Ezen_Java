<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %> <!-- 헤더페이지 포함 -->
	
	<h3> 회원 페이지 구역 </h3> <!-- 회원 페이지 구역 -->
	<form action="singupcontroller.jsp" method="post"> <!-- action="이동페이지경로"  method="전송방식:get,post" -->
		<input type="text" name="id" placeholder="ID"><br>
		<input type="password" name="password" placeholder="Password"><br>
		<input type="text" name="name" placeholder="Name"><br> <!-- form으로 부터 -->
		<input type="submit" value="회원가입"> <!-- submit을 클릭 했을때 form에 전송(action) -->
	</form>
</body>
</html>