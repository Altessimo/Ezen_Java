<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	adide{width: 220px; float: left;}
	maim{width: 840px; float: right;}
	#main_contents h3{font-size: 22px; text-align: center;
	border-bottom: 8px; padding-bottom: dotted 1px #cccccc;
	color: #444466; padding: 12px; background-color: #4bf3df}
	#main_contents p{margin-bottom: 30px; line-height: 100%;}
	
	#main2{width: 400px; float: right; }
	#main2 .item1{width: 195px; float: right; margin-top: 30px;}
	#main2 .subject{margin-top: 10px; font-weight: bold; font-size: 15px;}
	#main2 .date{margin-top: 5px;}
</style>
</head>
<body>
<%@ include file="Start.jsp" %>

	<div class="container">
		<div class="row">
			<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="3000">
				<ol class="carousel-indicators">
					<li data-target="#carouselcontents" data-slide-to="0" class="active"></li>
					<li data-target="#carouselcontents" data-slide-to="1" class="active"></li>
					<li data-target="#carouselcontents" data-slide-to="2" class="active"></li>
				</ol>
				
				<div class="carousel-item active">
					<img alt="" src="img/word01.png">
					<div class="carousel-caption">
					</div>
				</div>
				
				<div class="carousel-item active">
					<img alt="" src="img/word02.png">
					<div class="carousel-caption">
					</div>
				</div>
				
				<div class="carousel-item active">
					<img alt="" src="img/word03.png">
					<div class="carousel-caption">
					</div>
				</div>
				
				<div class="carousel-item active">
					<img alt="" src="img/word04.png">
					<div class="carousel-caption">
					</div>
				</div>
				
				<div class="carousel-item active">
					<img alt="" src="img/word05.png">
					<div class="carousel-caption">
					</div>
				</div>
				
				<div class="carousel-item active">
					<img alt="" src="img/word06.png">
					<div class="carousel-caption">
					</div>
				</div>
				
				<div class="carousel-item active">
					<img alt="" src="img/word07.png">
					<div class="carousel-caption">
					</div>
				</div>
				
				<a class="carousel-control-prev" href="##carouselcontents" data-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</a>
				<a class = "carousel-control-next" href="#carouselcontents" data-slide="next">
               		<span class = "carousel-control-next-icon"></span>
           		 </a>				
			</div>
			<div class="row footimg">
				<div class="item col-md-4">
					<img src="img/bnr_1st_Anniversary.png">
					<h3>2021.11.22.</h3>
					<p>함께 만들자! 제 13회 프로젝트 세카이 의상 디자인 캠페인 2021 판타지 편</p>
				</div>
				
				<div class="item col-md-4">
					<img src="img/bnr_1st_Anniversary.png">
					<h3>2021.11.01.</h3>
					<p>함께 만들자! 제 6회 악곡 콘테스트 프로세카 Next</p>
				</div>
				
				<div class="item col-md-4">
					<img src="img/bnr_1st_Anniversary.png">
					<h3>2021.09.30.</h3>
					<p>Anniversary "청춘찬가" 공개기념</p>
				</div>
			</div>
		</div>
	</div>





	<section id="contents"></section>
	 <div id="main_contents">
	 	<h3> INTRODUCTION </h3>
	 		<p>세계, 그것은 "진정한 마음"을 찾을 수 있는 장소<br>
	 		도쿄 시부야.<br>
			젊은이들이 모이는, 음악을 중심으로 서브컬쳐가 번성한 그 거리에.<br>
			한 소녀가 교차로의 대형 스크린을 올려다 보고 있었다.</p>
			<p>귀가 후, 소녀가 스마트폰을 보니 어느샌가<br>
			[Untitled]라는 곡이 들어가 있음을 발견한다.<br>
			수상하게 생각하며 곡을 재생하자, 소녀는 새하얀 빛에 휩싸여, 낯선 장소로 오게 된다.<br>
			놀란 소녀의 눈앞에는──</p>
	 </div>
	 
	 <div id="main2">
	 	<h3 class=title1> News </h3>
	 	<ul class="item1">
	 		<li><img src="img/news_thumb_113_fjdsila.jpg"> </li>
	 		<li class="subject"> 함께 만들자! 제 13회 프로젝트 세카이 의상 디자인 캠페인 2021 판타지 편 </li>
	 		<li class="date"> 2021.11.22. </li>
	 	</ul>
	 	
	 	<ul class="item1">
	 		<li><img src="img/news_thumb_111_omwdspo.jpg"> </li>
	 		<li class="subject"> 함께 만들자! 제 6회 악곡 콘테스트 프로세카 Next </li>
	 		<li class="date"> 2021.11.01. </li>
	 	</ul>
	 	
	 	<ul class="item1">
	 		<li><img src="img/news_thumb_109_bgwsrpi.jpg"> </li>
	 		<li class="subject"> Anniversary "청춘찬가" 공개기념 </li>
	 		<li class="date"> 2021.09.30. </li>
	 	</ul>
	 	
	 	<ul class="item1">
	 		<li><img src="img/news_thumb_106_VSJIP.jpg"> </li>
	 		<li class="subject"> 업데이트 </li>
	 		<li class="date"> 2021.09.26. </li>
	 	</ul>
	 </div>
</body>
</html>