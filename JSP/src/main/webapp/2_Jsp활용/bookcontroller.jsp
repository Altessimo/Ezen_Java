<%@page import="java.io.FileOutputStream"%>
<%@page import="Test.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	<%
	request.setCharacterEncoding("utf-8");
	String code=request.getParameter("code");
	String title= request.getParameter("title");
	
	Book book = new Book(code, title, (String)session.getAttribute("loginid"));
	
	FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/Ezen_Java/JSP/src/main/java/Test/book.txt", true);
	String outString = book.getCode()+","+book.getTitle()+book.getContents()+"\n";
	fileOutputStream.write(outString.getBytes());
	
	response.sendRedirect("book.jsp");
	%>
</body>
</html>