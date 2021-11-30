<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Day11-5 도서검색프로그램</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	<%! String[] 도서목록 = {"된다! 네이버 블로그&포스트","스프링 부트 실전 활용 마스터","Tucker의 Go 언어 프로그래밍","혼자 공부하는 C 언어"}; %>
	<% out.print(Array.toString(도서목록)); %>
	<%
	for(int i=0; i<도서목록.length; i++) {
		if(request.getParameter(i+"")!=null&&request.getParameter(i+"").equals(i+"")&&도서목록[i].equals(" ")){
			out.print(i+"선택");
		}
	}
	%>
	
	<table>
		<tr>
			<th> 도서코드 </th><th> 제목 </th><th> 내용 </th>
		</tr>
		<% for(int i=0; i<books.size(); i++) { %>
		<tr>
			<td><%=(i+1) %></td>
			<td><a href="bookview.jsp?bnum=<%=i%>">
			<%=books.get(i).getCode() %></a></td>
			<td> <%=books.get(i).getTitle() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html>