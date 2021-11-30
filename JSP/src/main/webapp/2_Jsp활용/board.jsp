<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	<h3> 게시물 목록 </h3>
	<button><a href="boardwrite.jsp"> 글 작성</a></button>
	<table>
		<tr>
			<th>번호</th><th>제목</th><th>작성자</th>
		</tr>
	</table>
</body>
</html>