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
	
	<h3> 도서 검색 프로그램 </h3>
	<% int bunm=Integer.parseInt(request.getParameter("bunm")); %>
	<a href="book.jsp"><button>검색</button></a>
	<table>
		<tr>
			<td> 도서 코드 : </td><td><%=bunm %></td>
		</tr>
		
		<tr>
			<td> 제목 : </td><td><%=books.get(bunm).getTitle() %></td>
		</tr>
		
		<tr>
			<td> 내용 : </td><td><%=books.get(bunm).getContents %></td>
		</tr>
	</table>
</body>
</html>