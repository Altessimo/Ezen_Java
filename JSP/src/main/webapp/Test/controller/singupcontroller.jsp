<%@page import="java.io.FileOutputStream"%>
<%@page import="Test.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		// 객체화
		Member member = new Member(id, password, name);
		
		FileOutputStream fileOutputStream =
		new FileOutputStream("C:/Users/505/git/Ezen_Java/JSP/src/main/java/Test/memberlist.txt", true);
		String outstring = member.getId()+","+member.getPassword()+","+member.getName()+"\n";
		fileOutputStream.write(outstring.getBytes());
		
		response.sendRedirect("../view/member/signupsuccess.jsp");
	%>
</body>
</html>