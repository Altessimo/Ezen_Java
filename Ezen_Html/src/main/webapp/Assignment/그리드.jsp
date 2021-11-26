<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title> 반응형 레이아웃 </title>
<meta charset="EUC-KR">
<style type="text/css">
	*{margin: 0; padding: 0; /* 기본값 제거 */
	box-sizing: border-box; /* 박스권 사이즈 → 테두리 기준 */
	text-align: center;
	}
	li{list-style-type: none;} /* 글머리 제거 */
	.box{width: 80%; height: 50%; background-color: #eeeeee;
	margin: 0 auto;}/* 박스 가운데 정렬 */
	header{height: 100px; background-color: green;}
	[class*="col_"]{float: left; padding: 15px;} /* 와일드 카드(*) */
	.col_1{width: 8.33%;} .col_2{width: 16.66%;} .col_3{width: 25%;}
	.col_4{width: 33.33%;} .col_5{width: 41.66%;} .col_6{width: 50%;}
	.col_7{width: 58.33%;} .col_8{width: 66.66%;} .col_9{width: 75%;}
	.col_10{width: 83.33%;} .col_11{width: 91.66%;} .col_12{width: 100%;}
	
	.main li{float: left; height: 300px;}
	.banner li{float: left; height: 200px;}
	footer{clear: both; height: 100px; background-color: green;}
	
</style>
</head>
<body>
	<header>
		<div class="box"> 헤더 </div>
	</header>
	
	<section>
		<div class="box main">
			<ul>
				<li class="col_8" style="background-color: yellow;"> 메인 사진 </li>
				<li class="col_4" style="background-color: skyblue;"> 서브 사진 </li>
			</ul>
		</div>
		<div class="box banner">
			<ul>
				<li class="col_3" style="background-color: purple;"> 박스권 1 </li>
				<li class="col_3" style="background-color: pink;"> 박스권 2 </li>
				<li class="col_3" style="background-color: purple;"> 박스권 3 </li>
				<li class="col_3" style="background-color: pink;"> 박스권 4 </li>
			</ul>
		</div>
	</section>
	<footer>
		<div class="box"> 푸터 </div>
	</footer>
</body>
</html>