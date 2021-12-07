<%@page import="Dao.BoardDao"%>
<%@page import="Dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../header.jsp" %>

<div class="container my-5">
	<h3> 고객센터 게시판 </h3>
	<p> 질문 게시판 </p>
	<div class="col-md-5 offset-7 input-group my-3">
	<select class="custom-select">
		<option> 번호 </option>
		<option> 제목 </option>
		<option> 작성자 </option>
	</select>
	<input type="text" class="form-control">
	<button class="btn btn-info ml-1"> 검색 </button>
	</div>
	<div>
	<table class="table table-strped text-center">
			<tr>
				<th> 번호 </th> <th> 제목 </th> <th> 작성자 </th>
				<th> 작성일 </th> <th> 조회수 </th>
			</tr>
	
		<%
		ArrayList<Board> boards = BoardDao.getboardDao().boardlist();
		for(Board board : boards) {
		%>
				<tr>
					<td><%=board.getB_num() %></td>
					<td><a href="boardview.jsp?b_num=<%=board.getB_num()%>"><%=board.getB_title() %></a></td>
							<!-- 게시물 상세페이지 이동 [ 클릭한 게시물 번호 요청 ] -->
					<td><%=board.getM_num() %></td>
					<td><%=board.getB_date() %></td>
					<td><%=board.getB_view() %></td>
				</tr>
			<% } %>
	</table>
</div>
</div>

<div class="row">
<div class="col-md-2 offset-5 my-5">
	<ul class="pagination">
		<li class="page=item"><a class="page-link"> 이전 </a></li>
		<li class="page=item"><a class="page-link"> 1 </a></li>
		<li class="page=item"><a class="page-link"> 2 </a></li>
		<li class="page=item"><a class="page-link"> 3 </a></li>
		<li class="page=item"><a class="page-link"> 4 </a></li>
		<li class="page=item"><a class="page-link"> 5 </a></li>
		<li class="page=item"><a class="page-link"> 다음 </a></li>
	</ul>
</div>
<div class="col-md-1 offset-2 my-3">
	<a href="boardwirte.jsp"><button class="btn btn btn-outline-info"> 글쓰기 </button></a>
</div>
</div>
</body>
</html>