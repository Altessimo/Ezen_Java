<%@page import="Test2.BoardDao"%>
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
	
	
<div class="container">
	<h3> 게시물 상세 페이지 </h3>
	<a href="boardlist.jsp"><button> 목록보기 </button></a>
	<div class="row">
		<div class="offset-1 col-md-10 offset-1">
			<table class="table">
				<tr>
					<td style="width: 20%"> 번호 : </td>
					<td> <%=bnum %> </td>
				</tr>
				<tr>
					<td> 제목 : </td>
					<td colspan="2"> <%=boards.get(bnum).getTitle() %> </td>
				</tr>
				<tr>
					<td style="height: 300px;"> 내용 : </td>
					<td colspan="2"> <%=boards.get(bnum).getContents() %> </td>
				</tr>
			</table>
		</div>
	</div>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>