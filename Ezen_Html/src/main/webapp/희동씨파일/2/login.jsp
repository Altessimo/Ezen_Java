<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="Heder.jsp" %>
	<!-- login start -->
	<br><br><br><br><br><br><br>
	<div class = "container">
		<div class= "inner">
			<form>
				<div class="box form-group">
					<h2>로그인</h2>
					<h5 > 아이디를 입력해주세요. </h5>
					<input class="form-control" type="text" placeholder="아이디">
				</div>
				<div class="box form-group"> 
					<h5 > 비밀번호를 입력해주세요.</h5>
					<input class="form-control" type="password" placeholder="비밀번호">
				</div>
				<div class="form-group mt-4"> 
					<button class="btn btn2 btn-primary" type="submit">로그인</button>
				</div>
				<div >
					<ul style="list-style: none; display: inline-block;">
						<li >아이디찾기</li>
						<li>비밀번호찾기</li>
					</ul>
				</div>
			</form>
		</div>	
	</div>

</body>
</html>