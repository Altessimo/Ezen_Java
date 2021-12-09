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
int r_num=Integer.parseInt(request.getParameter("r_num"));
int b_num=Integer.parseInt(request.getParameter("b_num"));

// DB처리
boolean result = BoardDao.getboardDao().replydelete(r_num);
if(result) { // 결과
	out.print("<script>alert('댓글 삭제 되었습니다');</script>");
	out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_num+"';</script>");
} else {
	out.print("<script>alert('댓글 삭제 요류 : 관리자에게 문의');</script>");
	out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_num+"';</script>");
}
%>
</body>
</html>