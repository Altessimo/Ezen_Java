<%@page import="Dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 웹 사이트 </title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h3> 메인 부문 </h3>
	<%
		MemberDao.getmemberDao();
	%>
	<p> 폰트 적용 </p>
	
	<%@ include file="footer.jsp" %>
</body>
</html>