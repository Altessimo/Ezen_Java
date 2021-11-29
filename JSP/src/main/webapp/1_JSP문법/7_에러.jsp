<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isErrorPage="true" %> <!-- 예외 페이지를 쓰겠다고 선언 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> 오류 발생 </h3>
	<p> 사유 : <%=exception.getMessage() %>
</body>
</html>