<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3> 표현식 </h3>
	<% String 이름[] = {"홍길동", "유재석", "강호동"}; %>
	<table border="1" width="200">
		<% // java start
			for(int i=0; i<이름.length; i++){
				// java end
			%>
			<!-- html start -->
			<tr>
				<td> <%=i %></td> <td><%=이름[i] %></td>
			</tr>
			<% // java start
		}
		// java end
			%>
	</table>
	
</body>
</html>