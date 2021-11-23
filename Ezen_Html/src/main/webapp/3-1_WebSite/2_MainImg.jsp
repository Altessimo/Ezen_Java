<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	*{box-sizing: border-box;}
	/*
	box-sizing: contents-box;	내용 기준으로 크기 정렬
	box-sizing: border-box;		테투리 기준으로 크기 정함
	box-sizing: inital;			기본값
	이미지에 링크를 넣어야지 실행이 됨 약간의 버튼 기능 생김
	
	*/
	#main_img{
	height: 320px;
	background-image: url("Img/mainimg.png");
	background-repeat: no-repeat;
	background-position: top center;
	margin-top: 20px; margin-bottom: 20px;
	text-align: center; /* 신청하러 가기 a 태그 가운데 정렬 */
	padding: 220px 0 0 750px;
	}
</style>
</head>
<body>
	<section id="main_img"> 
	<a href="#"><img alt="" src="Img/dslr.png"> </a>
	</section>
</body>
</html>