<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.carousel-item{width: 200px; height: 200px; !inportant; /* !inportant > id > class > �׵� > * */
	
	}
</style>
</head>
<body>
<%@ include file="1_BootstrapStart.jsp" %>
<h3> �̹��� �����̵�[ĳ����] </h3>
<div class="container">

	<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="1000">
		<!-- carousel slide : �̹��� �����̵�	data-interval : �����̵� ��ȯ ��1000=1�� -->
		
		<ol class="carousel-indicators"> <!-- carousel-indicators : ���� �����̵� ��ġ -->
			<li data-target="#carouselcontents" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontents" data-slide-to="1"></li>
			<li data-target="#carouselcontents" data-slide-to="2"></li>
		
		</ol>
		
		<div class="carousel-item active"> <!-- �����̵� �� ������ -->
			<img src="reo.png" alt="1��° �����̵�">
				<div class="carosel-caption"><!-- �̹��� ���̺� -->
					<h3> ������ </h3>
					<p> ������ �̹��� �Դϴ�. </p>
				</div>
		</div>
		
		<div class="carousel-item">
			<img src="vvid.png" alt="2��° �����̵�">
		</div>
		
		<div class="carousel-item">
			<img src="wonder.png" alt="3��° �����̵�">
		</div>
		
		<!-- �̵� ��ư -->
		<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev"> <!-- ���� �̹��� �̵� ��ư -->
			<span class="carousel-control-prev-icon"></span> <!-- ������ -->
		</a>
		
		<a class="carousel-control-next" href="#carouselcontents" data-slide="next"> <!-- ���� �̹��� �̵� ��ư -->
			<span class="carousel-control-next-icon"></span> <!-- ������ -->
		</a>
		
	</div>
</div>	
</body>
</html>