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

	<div class="text-center m-4">
		<h3> New Arribal </h3>
		<p> 신상품 </p>
	</div>
	
	<div class="container">
		<div class="row mb-2">
		<div class="col-md-4 col-sm-6 my-5">
			<div class="card">
				<img class="cardimgtop" src="img/game.jpg">
					<div class="card-text"> 젤다의 전설 브레스 오브 더 와일드
					<hr>
					<p class="item p-1">
						광대한 세계를 무대로 어디로 가든, 무엇을 하든, 모험의 모든 것을 당신이 원하는 대로 할 수 있습니다.<br>
						야생 동물을 사냥하며 지낼 것인가? 몬스터를 퇴치하러 갈 것인가?<br>
						절경 포인트를 보러 다닐 것인가?<br>
						달리고, 헤엄치고, 날고, 높은 곳을 오르고, 광활한 세계에서 본인이 마음먹은 대로 모험할 수 있습니다.<br>
					희망소비자 가격 <span class="price mr-2">74,800원</span><br>
					<span class="badge badge-pill badge-danger my-2">품절</span>
					</p>
					</div>
			</div>
		</div>
	</div>
	
	

	</div>
<%@ include file="footer.jsp" %>
</body>
</html>