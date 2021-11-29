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
<h3>회원가입</h3>
	<p> 빈칸을 입력해 주세요 </p>
</div>
<form>
<div class="col-md-4 offset-4 my-5">

	<div class="form-group">
		<label> 아이디를 입력 해 주세요 </label><br>
		<input calss="form-control" type="text" placeholder="아이디"><br>
	</div>
	
	<div class="form-group">
		<label> 비밀번호를 입력 해 주세요 </label><br>
		<input calss="form-control" type="password" placeholder="비밀번호"><br>
	</div>
	
	<div class="form-group">
		<label> 이름을 입력 해 주세요 </label><br>
		<input calss="form-control" type="password" placeholder="이름"><br>
	</div>
	
	<div class="form-group mt-5">
		<label> 회원가입을 누르면 가입이 완료 됩니다 </label>
		<button type="submit" class="btn btn-primary"> 회원가입 </button>
	</div>
</form>
</body>
</html>