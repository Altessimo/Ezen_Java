<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<%@include file="Heder.jsp" %>
	<!-- 캐러셀 시작 -->
	<div id="carouselcontent" class="carousel slide" data-ride="carousel" data-interval="1000">
	
	<!-- 현재 슬라이드 위치 알려주는 리스트 -->
		<ol class="carousel-indicators">
			<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontent" data-slide-to="1"></li>
			<li data-target="#carouselcontent" data-slide-to="2"></li>
		</ol>
            
		<!-- 캐러셀 이미지 넣기 -->
		<div class="carousel-inner">
			<div class="carousel-item active"><img src="img/main.jpg"></div>
			<div class="carousel-item"><img src="img/main2.jpg"></div>
			<div class="carousel-item"><img src="img/main3.jpg"></div>
		</div>
	<!-- 캐러셀 이미지 이동버튼 -->
	<a class="carousel-control-prev" href="#carouselcontent" data-slide="prov" >
			<span class="carousel-control-prev-icon"></span>
		</a>
		<a class="carousel-control-next" href="#carouselcontent" data-slide="next" >
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>
	<!-- 캐러셀 종료 -->
	
	<hr><!-- 구분선 -->
	<div class="container text-center">
		<h3> New ARRIVAL </h3>
		<P> 신상품 </P>
	</div>
	
	<!-- 아이템 : 제품 시작 -->
	<div class="container"> <!-- 박스권 -->
		<div class="row mb-2"> <!-- 가로 12그리드 -->
		
			<div class="col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700px~900px 사이 / col-sm-6 : 700 밑으로 떨어짐 my : 위아리 마진-->
				<div class="card"><!-- 카드 -->
					<img class="card-img-top" src="img/img.jpg"> <!-- 카드 상단 이미지 -->
					<div class="card-body"><!-- 카드 내용 -->
						<p class="card-text"> 소매 버튼 쉬폰 블라우스 </p>
						<hr>
						<p class="item p-1">
						디테일 컷이 실제 제품 색상과 가장 흡사합니다.
						모니터에 따라 차이가있을 수 있습니다.<br><br>
						판매가 <span class="price mr-2"> 47,000원</span> 65,000원<br>
						
						<span class="badge badge-pill badge-warning my-2"> 주문폭주 </span>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700px~900px 사이 / col-sm-6 : 700 밑으로 떨어짐 my : 위아리 마진-->
				<div class="card"><!-- 카드 -->
					<img class="card-img-top" src="img/img.jpg"> <!-- 카드 상단 이미지 -->
					<div class="card-body"><!-- 카드 내용 -->
						<p class="card-text"> 소매 버튼 쉬폰 블라우스 </p>
						<hr>
						<p class="item p-1">
						디테일 컷이 실제 제품 색상과 가장 흡사합니다.
						모니터에 따라 차이가있을 수 있습니다.<br><br>
						판매가 <span class="price mr-2"> 47,000원</span> 65,000원<br>
						
						<span class="badge badge-pill badge-warning my-2"> 주문폭주 </span>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700px~900px 사이 / col-sm-6 : 700 밑으로 떨어짐 my : 위아리 마진-->
				<div class="card"><!-- 카드 -->
					<img class="card-img-top" src="img/img.jpg"> <!-- 카드 상단 이미지 -->
					<div class="card-body"><!-- 카드 내용 -->
						<p class="card-text"> 소매 버튼 쉬폰 블라우스 </p>
						<hr>
						<p class="item p-1">
						디테일 컷이 실제 제품 색상과 가장 흡사합니다.
						모니터에 따라 차이가있을 수 있습니다.<br><br>
						판매가 <span class="price mr-2"> 47,000원</span> 65,000원<br>
						
						<span class="badge badge-pill badge-warning my-2"> 주문폭주 </span>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700px~900px 사이 / col-sm-6 : 700 밑으로 떨어짐 my : 위아리 마진-->
				<div class="card"><!-- 카드 -->
					<img class="card-img-top" src="img/img.jpg"> <!-- 카드 상단 이미지 -->
					<div class="card-body"><!-- 카드 내용 -->
						<p class="card-text"> 소매 버튼 쉬폰 블라우스 </p>
						<hr>
						<p class="item p-1">
						디테일 컷이 실제 제품 색상과 가장 흡사합니다.
						모니터에 따라 차이가있을 수 있습니다.<br><br>
						판매가 <span class="price mr-2"> 47,000원</span> 65,000원<br>
						
						<span class="badge badge-pill badge-warning my-2"> 주문폭주 </span>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>

		</div>
	</div>
	
	<!-- 아이템 : 제품 종료 -->


<%@include file="Footer.jsp" %>
</body>
</html>