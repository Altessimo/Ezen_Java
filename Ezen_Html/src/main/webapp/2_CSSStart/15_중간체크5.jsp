<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		#main{
			width: 700px;
			margin: 0 auto;
			background-image: url(패턴이미지3.png);
			border: solid 1px #cccccc;
	
		}
		#main #ul{
			text-align: center;
			list-style-type: none;
		}
		.row1{
		font-size: 50px; color: yellow; text-shadow: 2px 2px 1px black;
		font-weight: bold;
		}
		.row2{
		font-size: 20px; color: yellow;
		}
		.row3{
		color: white; margin-top: 10px;
		
		}
		#main2{
		width: 450px; margin: 0 auto;
		}
		
		#ul2 .it{
		color: white;
		
		}
		#buttons {
			text-align: center; width: 450px;
		}
		#buttons button {
			padding: 10px 20px;
			font-size: 30px;
			margin: 50px;
		}
	</style>
</head>
<body>


	<!-- 
	
		ul : 번호가 없는것 
		ol : 번호가 있는것
		li : 리스트 아이템(안에 들어가는 항목)
	
	
	 -->

	<div id="main"> 
		<ul id = "ul"> 
			<li class="row1"> 스페셜 드레스 샵 </li>
			<li class="row2"> Special Dress Shop </li>
			<li class="row3">생일, 결혼기념일, 만난 기념일 등 특별한 날에 스페셜 드레스를 입고 포토존에서 멋진 추억의 사진을 남겨보세요. </li>
		</ul>
		
		<div id="main2">
			<img src="드레스샵.jpg">
			<ul id="ul2">
				<li class="it">기간 : 매주 토/일요일<br>13:00 ~ 마감시간 전까지
				</li>
				<li class="it">장소 : 기념품 판매점 옆 스페션 드레스<br>※ 키즈, 커플 드레스도 입고 되었어요!
				</li>
			</ul>
			<div id="buttons">
				<button>이용요금 및 이용방법</button>
			</div>
		</div>
	
	</div>




</body>
</html>