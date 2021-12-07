<%@page import="Dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 웹 사이트 </title>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	<!-- 캐러셀 start -->
		<!-- 캐러셀 start -->
		<div id="carouselcontent" class="carousel slide" data-ride="carousel" data-interval="2000">
		
			<ol class="carousel-indicators">
				<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
				<li data-target="#carouselcontent" data-slide-to="1" ></li>
				<li data-target="#carouselcontent" data-slide-to="2" ></li>
				<li data-target="#carouselcontent" data-slide-to="3" ></li>
			</ol>
			
			<div class="carousel-inner">
				<div class="carousel-item active"> <img src="../img/spring.jpg"> </div>
				<div class="carousel-item"> <img src="../img/summer.jpg"> </div>
				<div class="carousel-item"> <img src="../img/autumn.jpg"> </div>
	
				<div class="carousel-item"> <img src="../img/winter.jpg"> </div>
			</div>
			
			<!-- 케러셀 이미지 이동 버튼 -->
			<a class="carousel-control-prev" href="#carouselcontent" data-slide="prov">
				<span class="carousel-control-prev-icon"></span>
			</a>
			<a class="carousel-control-next" href="#carouselcontent" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>
		</div>
		
	<!-- 캐러셀 end -->
	
	<!-- 제품목록 -->
	
	<!-- 제품목록 end -->
	
	<%@ include file="footer.jsp" %>
</body>
</html>