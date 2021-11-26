<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Heder.jsp" %>
<div class="container my-5"></div>
<h3 class="col-md-6 offset-4"> 로그인 </h3>
	<form class="col-md-6 offset-4 input-group my-5">
		<table>
			<tr>
				<td> 아이디 </td>
				<td><input type="text"></td>
			</tr>
			
			<tr>
				<td> 비밀번호 </td>
				<td><input type="password"></td>
			</tr>
			
			<tr>
				<td rowspan="2"><button class="btn btn-info ml-5"> 회원가입 </button></td>
				<td rowspan="2"><button class="btn btn-info ml-5"> 로그인 </button></td>
			</tr>
			
		</table>
	</form>
</body>
</html>

