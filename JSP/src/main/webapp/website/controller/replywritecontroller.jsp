<%@page import="Dto.Login"%>
<%@page import="Dto.Reply"%>
<%@page import="Dao.BoardDao"%>
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
		String contents = request.getParameter("contents");
		int b_num = Integer.parseInt(request.getParameter("b_num"));
		// int = Integer.parseInt();
		// 로그인 된 회원의 번호
		Login login = (Login)session.getAttribute("login");
		int m_num = login.getM_num();
		
		// 객체화
		Reply reply = new Reply(contents, m_num, b_num);
		
		// Db 처리
		boolean result = BoardDao.getboardDao().replywrite(reply);
		if(result){ // 결과
			out.print("<script>alert('댓글 등록 되었습니다.');</script>");
			out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_num+"';</script>");
		} else {
			out.print("<script>alert('댓글 등록 오류[관리자에게문의].');</script>");
			out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_num+"';</script>");
		}
		%>
</body>
</html>