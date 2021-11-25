<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	*{text-align: center;}
	header{height: 100px; background-color: skyblue; padding: 10px; margin: 10px;}
	footer{border-top: dotted 2px black;}
	ul{padding: 10px; background-color: green;}
</style>
</head>
<body>
<%@ include file="1_BootstrapStart.jsp" %>
<div class="container">
	<header>
		<h3> 그리드 레이아웃 </h3>
	</header>
	<div class="row">
		<div class="col-md-2">
			<ul>
				<li> 메뉴 1 </li>
				<li> 메뉴 2 </li>
				<li> 메뉴 3 </li>
				<li> 메뉴 4 </li>
			</ul>
		</div>
		
		<div class="col-md-8">
		<div class="row"> <!-- inline으로 처리 -->
			<div class="col-md-5 offset-2"> <!-- 왼쪽 2칸 띄어쓰기(공백주는것) -->
			<p> 어린 개를 일컫는 순우리말이다. </p> </div>
			<div class="col-md-5">
			<p> 개 + 작다는 뜻의 접두어 앚 + 명사전성어미 "이"가 합쳐져서 강아지가 됐다. 아지는 옛날에 아기를 다르게 부르는 말이다. 지방, 지역마다 조금씩 다르게 부르기도 한다. </p></div>
		</div>
	</div>
	
	<div class="col-md-2">
			<ul>
				<li> 메뉴 1 </li>
				<li> 메뉴 2 </li>
				<li> 메뉴 3 </li>
				<li> 메뉴 4 </li>
			</ul>
		</div>
	
	<footer>
		여기는 푸터
	</footer>
</div>
</body>
</html>