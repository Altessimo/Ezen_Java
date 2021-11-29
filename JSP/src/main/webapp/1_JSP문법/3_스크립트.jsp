<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> 스크립트 문 </title>
</head>
<body>
	<h3> 스크립트 문 </h3>
	<%! int one; String msg; %> <!-- 선언문이라서 syso가 나오지 않음 -->
	<% int one=31; String msg="서블릿 스트립트"; %>
	
	<br> one : <%= one %> <!-- 스트립트 -->
	<br> msg : <%= msg %> <!-- 스트립트 -->
	<br> 선언문 one : <%= this.one %>
	<br> 선언문 msg : <%= this.msg %>
	<br> 서블릿 경로 : <%= application.getRealPath("/") %>
	
	<% float f = 2.3f;
	int i=Math.round(f);
	Date date = new Date(); // java 라이브러리 호출 가능
	%>
	
	<br> 실수 f의 반올림 값은 : <%= f %>
	<br> 현재의 날짜와 시간은? : <%= date.toString() %>
</body>
</html>