<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> ���� ���� Ȩ������ </title> <!-- ������ ���� -->
<!-- ��Ʈ��Ʈ�� �������� Css -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<!-- ���� �ۼ��� Css �������� -->
<link href="css/main.css" rel="stylesheet">
<!-- �����[�������� ����] -->
<!-- ������ ��� : ��Ʈ ��� ��ũ -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>
<!-- ��� ���� -->
<div class="fixed-top bg-white"> <!-- ��� ���� -->
<div class="container"> <!-- ��ü ����޴��� ����ִ� ���� -->
	<header class="py-3"> <!-- ��� �޴� / ���, y�� -->
		<div class="row justify-content-between align-items-center">
			<div class="col-4 offset-4 text-center">
				<a href="Main.jsp" class="text-dark header-logo"> ���� ���� Ȩ������ </a>
			</div>
			<div class="col-4 d-flex justify-content-end align-items-center">
				<ul class="nav header-topmanu">
					<li><a href="Login.jsp" class="text-info mx-1"> �α��� </a> | </li>
					<li><a href="Join.jsp" class="text-info mx-1"> ȸ������ </a> | </li>
					<li><a href="#" class="text-info mx-1"> ���� ���� </a> | </li>
				</ul>
			</div>
		</div>
	</header>
<nav class="navbar navbar-expand-lg navbar-light bg-white"> <!-- �� �޴� -->

<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#header-mainmenu">
	<span class="navbar-toggler-icon"></span>
</button>

<div class="collapse navbar-collapse" id="header-mainmenu">
	<ul class="navbar-nav col-lg-12 justify-content-between">
		<li class="nav-item"> <a href="#" class="nav-link"> ���ٵ� ����ġ </a></li>
		<li class="nav-item"> <a href="#" class="nav-link"> ���ٵ� 3DS </a></li>
		<li class="nav-item"> <a href="#" class="nav-link"> ����Ʈ���� </a></li>
		<li class="nav-item"> <a href="QnABoard.jsp" class="nav-link"> ������ </a></li>
		<li class="nav-item"> <a href="#" class="nav-link"> News </a></li>
		<li class="nav-item"> <a href="#" class="nav-link"> �ٿ�ε� ���� </a></li>
		<li class="nav-item"> <a href="#" class="nav-link"> <i class="fas fa-search"></i></a></li>
	</ul>
	</div>
</nav>
</div>
</div>
<!-- ��� ���� -->

<!-- ĳ���� -->

<!-- ��Ʈ��Ʈ�� �������� Js/j���� -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>