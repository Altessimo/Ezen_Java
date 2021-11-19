<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		#d1{
			background-image: url(패턴이미지3.png);
			background-repeat: no-repeat;
			background-position: right top;
			width: 500px;
			boder: solid 1px;
			margin: 200px; padding: 100px;
			text-align: center;
		}
		h3{text-align: center; color: yellow; font-weight: bould; font-size: 50px;}
		#d1 .ds1{color: yellow; font-size: 20px;}
		#d1 .ds2{color: white;}
		#d1 .ds3{color: yellow;}
		#d1 .ds4{color: yellow;}
		#buttons{padding: 5px;}
	
	</style>

</head>
<body>
	<%@ include file="12_메뉴바.jsp" %>

	<div id="d1">
	<h3> 스페셜 드레스 샵</h3>
		<ul class="ds1">
			<td class="col1"> Special Dress Shop</td>
		</ul>
		
		<ul class="ds2">
			<td class=col2> 생일, 결혼기념일, 만난 기념일 등 특별한 날에 스페셜 드레스를 입고 포토존에서 멋진 추억의 사진을 남겨보세요. </td>
		</ul>
		
		<ul class="ds3">
			<td> <img src="드레스샵.jpg"> </td>
		</ul>
			
		<ul class="ds4">
			<li class=col3> 기간 : 매주 토/일요일 </li>
			13:00 ~ 마감시간 전까지
		</ul>
		
		<ul class="ds4">
			<li class=col3> 장소 : 기념품 판매점 옆 스페션 드레스 </li>
			c
		</ul>
		
		<div id="buttons">
			<button type="submit"> 이용요금 및 이용방법 </button>
		</ul>
		</div>

</body>
</html>