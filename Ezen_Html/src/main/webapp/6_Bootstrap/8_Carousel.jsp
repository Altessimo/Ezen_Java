<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.carousel-item{width: 200px; height: 200px; !inportant; /* !inportant > id > class > 테드 > * */
	
	}
</style>
</head>
<body>
<%@ include file="1_BootstrapStart.jsp" %>
<h3> 이미지 슬라이드[캐러셀] </h3>
<div class="container">

	<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="1000">
		<!-- carousel slide : 이미지 슬라이드	data-interval : 슬라이드 전환 초1000=1초 -->
		
		<ol class="carousel-indicators"> <!-- carousel-indicators : 현재 슬라이드 위치 -->
			<li data-target="#carouselcontents" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontents" data-slide-to="1"></li>
			<li data-target="#carouselcontents" data-slide-to="2"></li>
		
		</ol>
		
		<div class="carousel-item active"> <!-- 슬라이드 내 아이템 -->
			<img src="reo.png" alt="1번째 슬라이드">
				<div class="carosel-caption"><!-- 이미지 레이블 -->
					<h3> 강아지 </h3>
					<p> 강아지 이미지 입니다. </p>
				</div>
		</div>
		
		<div class="carousel-item">
			<img src="vvid.png" alt="2번째 슬라이드">
		</div>
		
		<div class="carousel-item">
			<img src="wonder.png" alt="3번째 슬라이드">
		</div>
		
		<!-- 이동 버튼 -->
		<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev"> <!-- 이전 이미지 이동 버튼 -->
			<span class="carousel-control-prev-icon"></span> <!-- 아이콘 -->
		</a>
		
		<a class="carousel-control-next" href="#carouselcontents" data-slide="next"> <!-- 다음 이미지 이동 버튼 -->
			<span class="carousel-control-next-icon"></span> <!-- 아이콘 -->
		</a>
		
	</div>
</div>	
</body>
</html>