<%@page import="Dto.Login"%>
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
	
	boolean result = MemberDao.getmemberDao().login(id, password);

		if(result){
			int m_num= MemberDao.getmemberDao().getmembernum(id);
			Login login = new Login(m_num, id);
			session.setAttribute("login", login);
			response.sendRedirect("../view/main.jsp");
		} else {
		response.sendRedirect("../view/member/login.jsp?result=fail");
		}
	%>
</body>
</html>