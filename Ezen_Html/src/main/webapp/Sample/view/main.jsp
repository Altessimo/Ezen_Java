<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게임 구입 페이지 </title>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	<!-- 캐러셀 -->
	<div id="carouselcontent" class="carousel slide" data-ride="carousel" data-interval="1000">
  <ol class="carousel-indicators">
    <li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
    <li data-target="#carouselcontent" data-slide-to="1"></li>
    <li data-target="#carouselcontent" data-slide-to="2"></li>
  </ol>
  
  <div class="carousel-inner">
    <div class="carousel-item active"> <img src="../img/carousel1.jpg"></div>
    <div class="carousel-item"> <img src="../img/carousel2.jpg"></div>
    <div class="carousel-item"> <img src="../img/carousel3.jpg"></div>
  </div>
  
  <a class="carousel-control-prev" href="#carouselcontent" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  
  <a class="carousel-control-next" href="#carouselcontent" role="button" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>

	<div class="text-center">
		<h3> New Arribal </h3>
		<p> 신상품 </p>
	</div>
	
	<div class="container">
		<div class="col-md-4 col-sm-6 my-5">
			<div class="card">
				<img alt="" src="">
			</div>
		</div>
	</div>


<%@ include file="footer.jsp" %>
</body>
</html>