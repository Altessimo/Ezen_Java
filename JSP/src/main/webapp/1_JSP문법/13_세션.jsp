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
		// 1. 세션 할당 [쿠키와 달리 세션은 내장객체(미리 만들어진 내장 객체)]
		session.setAttribute("id", "asdf"); // 세션의 저장소는 서버 톰캣으로 메모리 할당 가능
		session.setAttribute("pasword", "1234");
		
		// 2. 세션 생명주기[세션 호출이 없을때] → 부가적인 기능
		session.setMaxInactiveInterval(60); // 60초 [기본 값 : 30분]
	%>
	
	<p> 세션 만들기</p>
	<p> <a href="13_세션테스트.jsp"> 확인 </a></p>
	
</body>
</html>