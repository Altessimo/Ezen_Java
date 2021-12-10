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
				<img class="card-img-top" src="img/game.png">
					<div class="card-body">
						<p class="card-text"><h3> 젤다의 전설 브레스 오브 더 와일드</h3>
						<hr>
						<p class="item p-1">
						광대한 세계를 무대로 어디로 가든, 무엇을 하든, 모험의 모든 것을 당신이 원하는 대로 할 수 있습니다.<br>
						야생 동물을 사냥하며 지낼 것인가? 몬스터를 퇴치하러 갈 것인가?<br>
						절경 포인트를 보러 다닐 것인가?<br>
						달리고, 헤엄치고, 날고, 높은 곳을 오르고, 광활한 세계에서 본인이 마음먹은 대로 모험할 수 있습니다.<br>
						희망소비자가격 ₩74,800<br>
						
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6 my-5">
			<div class="card">
				<img class="card-img-top" src="img/item.png">
					<div class="card-body">
						<p class="card-text"><h3> 모여봐요 동물의 숲 </h3></p>
						<hr>
						<p class="item p-1">
						<h4>무인도에서 시작하는 새로운 생활</h4><br>
						현실과 동일한 시간이 흐르는 세계에서, 마음 가는 대로 하루하루를 보내는 「동물의 숲」 시리즈.낚시나 곤충 채집, 가드닝 등 집 밖에서 즐길 수 있는 요소부터 집 꾸미기・패션까지, 다양한 취미를 1년 내내 즐기실 수 있습니다.<br>
						희망소비자가격 ₩64,800<br>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6 my-5">
			<div class="card">
				<img class="card-img-top" src="img/item.png">
					<div class="card-body">
						<p class="card-text"><h3>Caligula2 </h3></p>
						<hr>
						<p class="item p-1">
						타이틀의 유래는 보지 말라고 할수록 보고 싶어지며, 하지 말라고 할수록 더 하고 싶어진다는 ‘칼리굴라 효과’.<br>
						‘우상(아이돌) 죽이기'를 키워드로 한 자극적인 시나리오, 그리고 ‘마음의 병’을 가진 캐릭터들을 양대 테마로 했으며,<br>
						독특한 배틀 시스템과 보컬로이드 프로듀서에 의한 악곡이 특징인 이색 학원 쥬브나일 RPG 「Caligula -칼리굴라-」 시리즈의 새로운 이야기가 시작된다.<br>
						희망소비자가격 ₩64,800<br>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-4 col-sm-6 my-5">
			<div class="card">
				<img class="card-img-top" src="img/item.png">
					<div class="card-body">
						<p class="card-text"> 디즈니 매지컬 월드 2 : 인챈티드 에디션 </p>
						<hr>
						<p class="item p-1">
						<h4>꿈의 세계가 반짝이기 시작한다.</h4><br>
						미키 마우스와 친구들이 사는 꿈의 세계의 구성원이 되어, 디즈니 친구들과 함께 외출하거나 쇼핑, 꾸미기, 낚시, 생일 파티, 댄스 파티 등 다양한 이벤트와 자신만의 꿈의 세계를 즐겨 보아요!<br>
						희망소비자가격 ₩49,800<br>
						<span class="badge badge-pill badge-warning my-2"> 주문폭주 </span>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>






<%@ include file="footer.jsp" %>
</body>
</html>