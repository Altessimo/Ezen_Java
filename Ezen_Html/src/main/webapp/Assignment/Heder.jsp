<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.navbar-brand{width: 200px; margin: 0 auto;}
	.navbar-brand:hover {transition: all 0.2 linear; transform: scale(1.2)}
	.navbar-nav li{padding: 0 10px 0 0; font-size: 20px; color: black;}
	.nav-item a:hover {border-bottom: 2px orange solid;
	color: orange; font-weight: bold;}
	.nav-item a.active{color: orange;}
</style>
</head>
<body>
<%@ include file="Start.jsp" %>

	<div class="container">
		<nav vlass = "nabar navbar-expand-lg navbar-light fixed-top" style="background-color: #skyblue; border-bottom : 1px soild #E6E6E6;">
			<a href="#" class="navbar-borand">
				<img alt="" src="img/logo.png" style="width: 120px; height: 30px;"></a>
				
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarcontents"
	aria-controls="navbarcontents" aria-expanded="false" aria-abel="Toggle navi">
		<span class="navbar-toggler-icon"></span>
	</button>
	
	<div class="collapse navbar-collapse" id="navbarcontents">
		<ul class="navbar-nav">
			<li class="nav-item-active"><a href="#" class="nav-link">News</a></li>
			<li class="nav-item"><a href="#" class="nav-link">News</a></li>
			<li class="nav-item"><a href="#" class="nav-link">Story</a></li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false">Character(Unit)</a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">VIRTUAL SINGER</a>
					<a class="dropdown-item" href="#">Leo/need</a>
					<a class="dropdown-item" href="#">MORE MORE JUMP!</a>
					<a class="dropdown-item" href="#">Vivid BAD SQUAD</a>
					<a class="dropdown-item" href="#">원더랜즈×쇼타임</a>
					<a class="dropdown-item" href="#">25시, 나이트코드에서.</a>
				</div>
			</li>
			<li class="nav-item"><a href="#" class="nav-link">System</a></li>
			<li class="nav-item"><a href="#" class="nav-link">Music</a></li>
			<li class="nav-item"><a href="#" class="nav-link">Special</a></li>
			<li class="nav-item"><a href="#" class="nav-link">FAQ</a></li>
		</ul>
			<form class="form-inline">
				<input type="text" class="form-control" placeholder="검색">
				<button class="btn btn-default">검색</button>
			</form>
	</div>
	</nav>
	</div>
</body>
</html>