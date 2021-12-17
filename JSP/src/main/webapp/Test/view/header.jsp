<%@page import="Dto.Login"%>
<%@page import="Test.Board"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="Test.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 가져오기 Css -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<!-- css 호출 -->
<link rel="stylesheet" href="/Ezen_Html/Test/css/main.css">
</head>
<body>
<!-- 부트스트랩 가져오기 Js/j퀘리 -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<%
	Login login=(Login)session.getAttribute("login");
	String loginid = null;
	if(login != null) {loginid = login.getM_id();}
	
	ArrayList<Board> boards=new ArrayList<>();
	FileInputStream fileInputStream=new FileInputStream("C:/Users/505/git/Ezen_Java/JSP/src/main/java/Test/boardlist.txt");
	byte[] bytes= new byte[1000];
	fileInputStream.read(bytes);
	String sboard=new String(bytes);
	String[] ssboard=sboard.split("\n");
	for(int i=0; i<ssboard.length-1; i++){
		Board board = new Board(ssboard[i].split(",")[0], ssboard[i].split(",")[1], ssboard[i].split(",")[2]);
				boards.add(board);
	}
	fileInputStream.close();
%>

<!-- 헤더 시작 -->
<div class="fixed-top bg-white">
	<div class="container">
		<header class="py-3">
		<div id="logo">
			<img src="img/logo.gif">
		</div>
		<div class="row justify-content-between align-items-center">
			<div class="col-4 offset-3 text-center">
				<a href="/Ezen_Jsp/Test/view/main.jsp" class="heder_logo"> 게임 구입 페이지 </a>
			</div>
			
			<div class="col-md-4 d-flex justiy-content-end">
						<ul class="nav">
							<% if(loginid != null){ %>
							
							<li> <span  class="header_menu"> <%=loginid %>님 </span> </li>
							<li><a href="/Ezen_Jsp/Test/view/member/memberinfo.jsp" class="heder_menu"> 회원정보 </a></li>
							<li><a href="/Ezen_Jsp/Test/controller/logoutcontroller.jsp" class="heder_menu"> 로그아웃 </a></li>
							<%
							} else {
							%>
							<li><a href="/Ezen_Jsp/Test/view/member/login.jsp" class="heder_menu"> 로그인 </a></li>
							<li><a href="/Ezen_Jsp/Test/view/member/signup.jsp" class="heder_menu"> 회원가입 </a></li>
							<% } %>
						</ul>
					</div>
			</div>
		</header>
		
		<nav class="nabar navbar-expand-lg navbar-light bg-white">
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main_manu">
			<span class="navbar-toggler-icon"></span>
		</button>
	
	<div class="collapse navbar-collapse m-4" id="header-mainmenu">
		<ul class="navbar-nav col-lg-12 justify-content-between">
			<li class="nav-item"> <a href="#" class="nav-link"> 닌텐도 스위치 </a></li>
			<li class="nav-item"> <a href="#" class="nav-link"> 닌텐도 3DS </a></li>
			<li class="nav-item"> <a href="#" class="nav-link"> 소프트웨어 </a></li>
			<li class="nav-item"> <a href="/Ezen_Jsp/Test/view/board/boardlist.jsp" class="nav-link"> 고객센터 </a></li>
			<li class="nav-item"> <a href="#" class="nav-link"> News </a></li>
			<li class="nav-item"> <a href="#" class="nav-link"> 다운로드 구입 </a></li>
		</ul>
	</div>
		</nav>
	</div>
</div>
<br><br><br><br><br><br><br><br>

</body>
</html>