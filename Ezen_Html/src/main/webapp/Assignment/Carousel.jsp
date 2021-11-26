<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.carousel-item{width: 200px; height: 200px; !inportant;}
</style>
</head>
<body>
	<%@ include file="Start.jsp" %>
	
<div class="container">

	<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="3000">
		<ol class="carousel-indicators">
			<li data-target="#carouselcontents" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontents" data-slide-to="1"></li>
			<li data-target="#carouselcontents" data-slide-to="2"></li>
		</ol>
		
		<div class="carousel-item active">
			<img src="img/bnr_1st_Anniversary.png" alt="1st_Anniversary">
				<div class="carosel-caption">
			</div>
		</div>
		
		<div class="carousel-item">
			<img src="img/bnr_1stlive.jpg" alt="1st_Live">
		</div>
		
		<div class="carousel-item">
			<img src="img/bnr_teaser_pc.png" alt="teaser_pc">
		</div>
		
		<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</a>
		<a class="carousel-control-next" href="#carouselcontents" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>
</div>
</body>
</html>