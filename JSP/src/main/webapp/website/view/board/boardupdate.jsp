<%@page import="Dto.Board"%>
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
	int b_num=Integer.parseInt(request.getParameter("b_num"));
	Board board = BoardDao.getboardDao().getboard(b_num); // 수정할 게시물
	board.setB_contents(board.getB_contents().replaceAll("<br>", "\n")); // <br> → \n
	%>
	<%@ include file="../header.jsp" %>
	
	<div class="container">
		<form action="../../controller/boardupdatecontroller.jsp" method="post" enctype="multipart/form-data">
		<input type="hidden" name="b_num" value="<%=b_num %>">
		<input type="hidden" name="oldfile" value="<%=board.getB_file() %>"> <!-- 매개변수 값을 숨겨서 보내기 -->
			<!-- form 전송데이터 기본 타입 : text(string) enctype="application/x-www-form-urlencoded 기본값 -->
			<!-- form 파일 데이터 타입 : multipart/form-data -->
			제목 : <input type="text" name="title" value="<%=board.getB_title() %>"><br>
			내용 : <textarea rows="10" cols="50" name="contents"><%=board.getB_contents() %></textarea><br>
			첨부파일 : <input type="file" name="file"><%=board.getB_file() %><br>
			<input type="submit" value="등	록">
		</form>
	</div>
</body>
</html>