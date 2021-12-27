<%@page import="Dao.ProductDao"%>
<%@page import="Dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- 부트스트랩 설정 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<!-- 본인 css 호출 -->
<link rel="stylesheet" href="/Ezen_Jsp/website/css/main.css">

</head>
<body>
	<!-- Jquery  -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
   <!-- 부트스트랩 js 설정 -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<!-- 다음 우편 주소 api js 호출 -->
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<!-- 결제 API iamport.payment.js -->
	<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	<!-- chart Api -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	<!-- Kakao Map(지도) Api -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b028ade5d3f1b82fd18a67af94de38ea"></script>
	<!-- 본인 js 호출 -->
	<script type="text/javascript" src="/Ezen_Jsp/website/js/main.js"></script>
	
	<% // 재고가 0일 경우 제품의 상태를 품절로 변경
		ProductDao.getProductDao().stockupdate();
	%>
	
	<%
		Login login=(Login)session.getAttribute("login");
		String loginid = null; // 
		if(login != null) {loginid = login.getM_id();}
		// 세션이 있을 경우에만 로그인을 해야하는데 없는 경우엔 Null 값이 계속 들어감
	%>
	
	<!-- 헤더 start -->
	<div class="fixed-top bg-white"> <!-- 상단 고정, 배경 흰색 -->
		<div class="container"> <!-- 박스권 -->
			<header class="py-3"> <!-- p : 안쪽여백 // m 바깥여백 // y : 위, 아래, x : 왼쪽 오른 -->
				<div class="row"> <!-- 가로배치 -->
					<div class="col-md-4 affset-4 text-center"> <!-- 로고[웹 사이트명] -->
						<a href="/Ezen_Jsp/website/view/main.jsp" class="heder_logo"> Nature Travel </a>
					</div>
					
					<div class="col-md-4 d-flex justiy-content-end"> <!-- 상단메뉴 -->
						<ul class="nav">
							<% if(loginid != null){ // 로그인이 되어있는경우
							if(loginid.equals("admin")){ // 로그인이 되어있으면서 관리자 이면
							%>
							
							<li><a href="/Ezen_Jsp/website/view/admin/dashboard.jsp" class="heder_menu"> 관리자 </a></li>
							<% } %>
							<li> <span  class="header_menu"> <%=loginid %>님 </span> </li>
							<li><a href="/Ezen_Jsp/website/view/member/memberinfo.jsp" class="heder_menu"> 회원정보 </a></li>
							<li><a href="/Ezen_Jsp/website/controller/logoutcontroller.jsp" class="heder_menu"> 로그아웃 </a></li>
							<%
							} else { // 로그인이 안되어있는경우
							%>
							<li><a href="/Ezen_Jsp/website/view/member/login.jsp" class="heder_menu"> 로그인 </a></li>
							<li><a href="/Ezen_Jsp/website/view/member/singup.jsp" class="heder_menu"> 회원가입 </a></li>
							<% } %>
						</ul>
					</div>
				</div>
			</header>
				<!-- 메인메뉴 -->
				<nav class="navbar navbar-expand-lg navbar-light bg-white">
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main_manu">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="main_manu">
						<ul class="navbar-nav col-md-12 justify-content-between"><!-- between : 자동으로 정렬 -->
							<li class="nav-item"><a href="#" class="nav-link">봄</a></li>
							<li class="nav-item"><a href="#" class="nav-link">여름</a></li>
							<li class="nav-item"><a href="#" class="nav-link">가을</a></li>
							<li class="nav-item"><a href="#" class="nav-link">겨울</a></li>
							<li class="nav-item"><a href="/Ezen_Jsp/website/view/member/chatting.jsp" class="nav-link">실시간 채팅</a></li> 
							<li class="nav-item"><a href="#" class="nav-link">방문후기</a></li>
							<li class="nav-item"><a href="/Ezen_Jsp/website/view/board/boardlist.jsp" class="nav-link">고객센터</a></li> 
							<li class="nav-item"><a href="/Ezen_Jsp/website/view/product/productcart.jsp" class="nav-link">장바구니</a></li>
						</ul>
					</div>
				</nav>
		</div>
	</div>
	<!-- 헤더 end -->
	<br><br><br><br><br><br><br>
	<ul>
	
	</ul>
</body>
</html>