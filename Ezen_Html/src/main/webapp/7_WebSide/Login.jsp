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
<div class="col-md-4 offset-4 my-5">
<h3>로그인</h3>
	<p> 아이디와 비밀번호를 입력 해 주세요 </p>
</div>
<form>
<div class="col-md-4 offset-4 my-5">
	<div class="form-group">
		<label> 아이디 </label><br>
		<input calss="form-control" type="text" placeholder="아이디를 입력 해 주세요"><br>
	</div>
	
	<div class="form-group">
		<label> 비밀번호 </label><br>
		<input calss="form-control" type="password" placeholder="비밀번호를 입력 해 주세요"><br>
	</div>
	
	<div class="form-group mt-5">
		<button type="submit"> 회원가입 </button>
		<button type="submit"> 로그인 </button>
	</div>
	</div>
</form>

<%@include file="Footer.jsp" %>
<br><br><br><br><br>
</body>
</html>

