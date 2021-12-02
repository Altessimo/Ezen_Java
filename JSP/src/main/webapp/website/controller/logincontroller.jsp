<%@page import="Dao.MemberDao"%>
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
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	// Db 처리
	boolean result = MemberDao.getmemberDao().login(id, password);
	// Db 결과처리
		if(result){// 로그인 성공시
			// 세션 부여[내장객체 : 기본값(30분)]
			session.setAttribute("loginid", id); // 세션명, 세션 데이터
		response.sendRedirect("../view/main.jsp");
		} else { // 로그인 실패
		response.sendRedirect("../view/member/login.jsp?result=fail");
		}
	%>
</body>
</html>