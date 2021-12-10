<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 가져오기 Css -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<!-- css 호출 -->
<link rel="stylesheet" href="/Ezen_Html/Test/css/main.css">
</head>
<body>
<!-- 부트스트랩 가져오기 Js/j퀘리 -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<!-- 헤더 시작 -->
<div class="fixed-top bg-white">
	<div class="container">
		<header class="py-3">
		<div id="logo">
			<img src="img/logo.gif">
		</div>
		<div class="row justify-content-between align-items-center">
			<div class="col-4 offset-3 text-center">
				<a href="main.jsp" class="p-3 mb-2 bg-danger text-white">
				<span style="font-size: 2rem"> 게임 구입 페이지 </span></a>
			</div>
			<div class="col-3 d-flex justify-content-end align-items-center">
				<ul class="nav header-topmamu">
					<li><a href="/Ezen_Html/Test/view/member/login.jsp" class="p-2 mb-1 bg-info text-white"> 로그인 </a>
					<li><a href="/Ezen_Html/Test/view/member/singup.jsp" class="p-2 mb-1 bg-info text-white"> 회원가입 </a>
					<li><a href="#" class="p-2 mb-1 bg-info text-white"> 게시판 </a>
				</ul>
			</div>
			</div>
		</header>
		
		<nav class="nabar navbar-expand-lg navbar-light bg-white">
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main_manu">
			<span class="navbar-toggler-icon"></span>
		</button>
	
	<div class="collapse navbar-collapse m-4" id="header-mainmenu">
		<ul class="navbar-nav col-lg-12 justify-content-between">
			<li class="nav-item"> <a href="#" class="nav-link"> 닌텐도 스위치 </a></li>
			<li class="nav-item"> <a href="#" class="nav-link"> 닌텐도 3DS </a></li>
			<li class="nav-item"> <a href="#" class="nav-link"> 소프트웨어 </a></li>
			<li class="nav-item"> <a href="board/boardlist.jsp" class="nav-link"> 고객센터 </a></li>
			<li class="nav-item"> <a href="#" class="nav-link"> News </a></li>
			<li class="nav-item"> <a href="#" class="nav-link"> 다운로드 구입 </a></li>
		</ul>
	</div>
		</nav>
	</div>
</div>

</body>
</html>