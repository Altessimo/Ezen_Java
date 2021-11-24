<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	footer{clear: both; height: 200px; background-color: #292c32; color: white; padding-bottom: 50px;}
	footer .box div{padding: 60px 0 0 20px;}
	footer .box li{display: inline;}
	
	
	[class*="col_"]{float: left; padding: 15px;} /* 와일드 카드(*) */
	.col_1{width: 8.33%;} .col_2{width: 16.66%;}
	.col_3{width: 25%;} .col_4{width: 33.33%;}
	.col_5{width: 41.66%;} .col_6{width: 50%;}
	.col_7{width: 58.33%;} .col_8{width: 66.66%;}
	.col_9{width: 75%;} .col_10{width: 83.33%;}
	.col_11{width: 91.66%;} .col_12{width: 100%;}
	
</style>
</head>
<body>
	<footer>
		<div class="box">
			<div class="col_4">
				<ul>
					<h3> 고객 센터 </h3>
					<h1> Tel : 1588-1588 </h1>
				</ul>
			</div>
			
			<div class="col_6">
				<ul>
					<li> 회사 소개 </li> <li> | </li>
					<li> 개인정보처리방침 </li> <li> | </li>
					<li> 이용약관 </li> <li> | </li>
					<li> 제휴안내 </li> <li> | </li>
				</ul>
					<p> 주소 : 경기도 용인시 수지구 정평로 123 <br>
					email : photo@korea.com <br>
					COPYRIGHT &copy; 2021 The 스튜디오. ALL RIGHTS RESERVED. </p>
					<!-- &copy; : Html 중 저작권 특수문자 -->
			</div>
			
			<div class="col_2">
				<ul>
					<a href="#"><img alt="" src="Img/facebook.png"> </a>
					<a href="#"><img alt="" src="Img/blog.png"> </a>
					<a href="#"><img alt="" src="Img/instagram.png"> </a>
				</ul>
			</div>
		</div>
	</footer>
</body>
</html>