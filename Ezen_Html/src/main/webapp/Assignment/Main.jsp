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
					<p>�Բ� ������! �� 13ȸ ������Ʈ ��ī�� �ǻ� ������ ķ���� 2021 ��Ÿ�� ��</p>
				</div>
				
				<div class="item col-md-4">
					<img src="img/bnr_1st_Anniversary.png">
					<h3>2021.11.01.</h3>
					<p>�Բ� ������! �� 6ȸ �ǰ� ���׽�Ʈ ���μ�ī Next</p>
				</div>
				
				<div class="item col-md-4">
					<img src="img/bnr_1st_Anniversary.png">
					<h3>2021.09.30.</h3>
					<p>Anniversary "û������" �������</p>
				</div>
			</div>
		</div>
	</div>





	<section id="contents"></section>
	 <div id="main_contents">
	 	<h3> INTRODUCTION </h3>
	 		<p>����, �װ��� "������ ����"�� ã�� �� �ִ� ���<br>
	 		���� �úξ�.<br>
			�����̵��� ���̴�, ������ �߽����� �������İ� ������ �� �Ÿ���.<br>
			�� �ҳడ �������� ���� ��ũ���� �÷��� ���� �־���.</p>
			<p>�Ͱ� ��, �ҳడ ����Ʈ���� ���� �������<br>
			[Untitled]��� ���� �� ������ �߰��Ѵ�.<br>
			�����ϰ� �����ϸ� ���� �������, �ҳ�� ���Ͼ� ���� �۽ο�, ���� ��ҷ� ���� �ȴ�.<br>
			��� �ҳ��� ���տ��¦���</p>
	 </div>
	 
	 <div id="main2">
	 	<h3 class=title1> News </h3>
	 	<ul class="item1">
	 		<li><img src="img/news_thumb_113_fjdsila.jpg"> </li>
	 		<li class="subject"> �Բ� ������! �� 13ȸ ������Ʈ ��ī�� �ǻ� ������ ķ���� 2021 ��Ÿ�� �� </li>
	 		<li class="date"> 2021.11.22. </li>
	 	</ul>
	 	
	 	<ul class="item1">
	 		<li><img src="img/news_thumb_111_omwdspo.jpg"> </li>
	 		<li class="subject"> �Բ� ������! �� 6ȸ �ǰ� ���׽�Ʈ ���μ�ī Next </li>
	 		<li class="date"> 2021.11.01. </li>
	 	</ul>
	 	
	 	<ul class="item1">
	 		<li><img src="img/news_thumb_109_bgwsrpi.jpg"> </li>
	 		<li class="subject"> Anniversary "û������" ������� </li>
	 		<li class="date"> 2021.09.30. </li>
	 	</ul>
	 	
	 	<ul class="item1">
	 		<li><img src="img/news_thumb_106_VSJIP.jpg"> </li>
	 		<li class="subject"> ������Ʈ </li>
	 		<li class="date"> 2021.09.26. </li>
	 	</ul>
	 </div>
</body>
</html>