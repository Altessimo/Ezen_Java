<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">

	#menuul{
		text-align: center; /* 텍스트 가운데 정렬 */
		background-color: skyblue; /* 배경색 */
		color: white; /* 글꼴 색 */
		padding: 15px; /* 안쪽 여백 */
	}

	.menuul{
		display: inline; /* inline(줄 포함) block(한줄 차지) */
		margin-left: 20px; /* 왼쪽 바깥 여백 */
	}

	a{
		color: white; /* 링크 색상 */
		ext-decoration: none; /* 링크(기본값 : 밑줄) 밑줄제거 */
	}

	a:hover {color: orange;} /* 마우스 올렸을때 */
	

</style>


</head>
<body>
	<ul id="menuul"> <!-- ul(unorder list) : 순서(번호) 없는 목록 -->
		<li class="menuul"> <a href="12_제품소개.jsp"> 소개 </a></li>
		<li class="menuul"> <a href="12_고객센터.jsp"> 고객센터 </a></li>
		<li class="menuul"> <a href="12_로그인.jsp"> 로그인 </a></li>
		<li class="menuul"> <a href="11_중간체크4.html"> 회원가입 </a></li>
		<li class="menuul"> <a href="12_찾아오시는길.jsp"> 찾아오시는 길 </a></li>
	</ul>
</body>
</html>