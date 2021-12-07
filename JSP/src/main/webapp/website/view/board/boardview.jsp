<%@page import="Dao.BoardDao"%>
<%@page import="Dto.Board"%>
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
	<%@include file = "../header.jsp" %>
	
	<%
	int b_num = Integer.parseInt( request.getParameter("b_num")); // 전 페이지에서 클릭한 게시물번호
	Board board = BoardDao.getboardDao().getboard(b_num);
	%>
	
<!-- 게시물 상세 페이지 -->
<div class="container">
	<table>
		<tr>
			<td>제목</td>
			<td><%=board.getB_title() %></td>
		</tr>
		
		<tr>
			<td>내용</td>
			<td><%=board.getB_contents() %></td>
		</tr>
		
		<tr>
			<td> 첨부파일 </td>
			<td><a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file()%>"><%=board.getB_file() %></a></td>
		</tr>
	</table>
</div>
</body>
</html>