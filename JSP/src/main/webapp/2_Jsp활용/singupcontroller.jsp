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
	<!-- 사용자 뷰 X : java  -->
	<% // 스크립트 문
		request.setCharacterEncoding("utf-8"); // 변수 값을 한글로 요청
		String id = request.getParameter("id"); // form으로 부터 id 변수 요청
		String password = request.getParameter("password"); // form 으로부터 password 변수 요청
		String name = request.getParameter("name"); // form 으로부터 name 변수 요청
		
		// 객체화
		Member member = new Member(id, password, name);
		
		// 파일처리[예외처리 x : 서블렛에 예외처리가 되어있음]
			// 1. 파일출력 스트림
		FileOutputStream fileOutputStream =
		new FileOutputStream("C:/Users/505/git/Ezen_Java/JSP/src/main/java/Test/memberlist.txt", true);
		// 2. 출력할 문자열
		String outstring = member.getId()+","+member.getPassword()+","+member.getName()+"\n";
		// 3. 문자열 출력 [문자열 → 바이트]
		fileOutputStream.write(outstring.getBytes());
		
		// 페이지 이동 [respone.sendRedirect("이동페이지경로")]
		response.sendRedirect("main.jsp");
		
		// DB처리
		
	%>
</body>
</html>