<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<style type="text/css">
			#contents{margin-top: 80px;}
		</style>
</head>
<body>
			<div class="container">
		<div id="contents" class="carousel slide" data-ride="carousel" data-interval="2000">
			<ol class="carousel-indicators">
				<li data-target="contents" data-slide-to="0" class="active"></li>
				<li data-target="contents" data-slide-to="1"></li>
				<li data-target="contents" data-slide-to="2"></li>
			</ol>
			
			
					<div class="carousel-item active">	
						<img alt="일" src="메인1.jpg">
					</div>
					<div class="carousel-item active">	
						<img alt="이" src="메인2.jpg">
					</div>
					<div class="carousel-item active">	
						<img alt="삼" src="메인3.jpg">
					</div>
				<a class="carousel-control-prev" href="#contents" data-slide="prev"><!-- 이전 이미지 이동 버튼 -->
					<span class="carousel-control-prev-icon"></span><!-- 아이콘 -->
				</a>
				<a class="carousel-control-prev" href="#contents" data-slide="next"><!-- 다음 이미지 이동 버튼 -->
					<span class="carousel-control-next-icon"></span><!-- 아이콘 -->
				</a>
		
		
		</div>
	</div>

</body>
</html>