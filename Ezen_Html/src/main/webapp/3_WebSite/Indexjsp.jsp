<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	/* 테두리 레이아웃 용 처음엔 넣고 하기*/
		header{ /* 해더 태그 꾸미기*/
		width: 1150px; /* 가로길이 */
		height: 100px; /* 높이 : 레이아웃 용 */
		margin: 0 auto; /* 박스권 가운데정렬[컨트롤] text-align: 사진, 컨트롤*/}
		#main_img{width: 100%; /* 가로길이 : 백분율 모니터를 표현할 수 있는 픽셀 */ 
		height: 250px; /* 높이 */ }
		/*
			픽셀 	vs 	백터
			점		선
			포토샵	일러스트
			영상/사진	애니메이션
			현살성	
			계단 현상
		*/
		
		#contents{width: 1150px; margin: 0 auto;}
		#sub_menu{width: 240px;
		float: left;} /* 박스권 왼쪽 배치 */
		#main_contents{width: 900px;
		float: right; /* 박스권 오른쪽 배치 */
		}
		footer{width: 100%; /* 푸터는 페이지 1개당 1가지 밖에 없음 */
		height: 150px;
		clear: both; /* float : 제거 */
		}
		
	</style>
</head>
<body>
	<!-- 1. 레이아웃(display : block → 1칸 차지) -->
		<!-- 해더 태그[div 사용해도 무관 -->
		<%@ include file="2_Header.jsp" %>
		<!-- 세션 태그[div 처럼 구역 나누기 --> <!-- 클래스만 꾸밀경우 2번이상 -->
		<%@ include file="3_MainImg.jsp" %>
		 <!-- 세션 태그 -->
		<!-- 메뉴태그 [div 사용해도 무관] -->
		<%@ include file="4_main.jsp" %>
		<!-- 푸터메뉴 [div 사용해도 무관] -->
		<%@ include file="5_Footer.jsp" %>
</body>
</html>