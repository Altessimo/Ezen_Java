<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="1_BootstrapStart.jsp" %>

<h3> 컨트롤 클래스 </h3>
	<ul>
		<li> 1. from-control </li>
	</ul>
<div class="container">
	<input type="text" class="form-control">
	<input type="password" class="form-control">
	<input type="datedtime" class="form-control">
	<input type="datedtime-local" class="form-control">
	<textarea type="rows="5" clos="5" class="form-control"></textarea>

<div class="checkbox">
	<input type="checkbox">
</div>

<div class="radio">
	<input type="radio">
</div>

<div class="row">
	<div class="col-md-2">
		<input type="text" class="form-control">
	</div>
	<div class="col-md-2 offset-3">
		<input type="text" class="form-control">
	</div>
	<div class="col-md-2 offset-3">
		<input type="text" class="form-control">
	</div>
</div>
</div>

<h3> 버튼</h3>
	<button type="button"> 버튼 </button>
	<button type="button" class="btn"> 버튼 </button> <!--  -->
	<button type="button" class="btn btn-default"> 버튼 </button> <!--  -->
	<button type="button" class="btn btn-success"> 버튼 </button> <!--  -->
	<button type="button" class="btn btn-info"> 버튼 </button> <!--  -->
	<button type="button" class="btn btn-donger"> 버튼 </button> <!-- 빨간색 -->
	
<h3> 이미지 </h3>
	<div class="col-sm-6">
		<img src="dog.jpg">
	</div>
	
	<div class="col-sm-6">
		<img src="dog.jpg" class="rounded"> <!-- 테두리 둥글게 -->
	</div>
	
	<div class="col-sm-6">
		<img src="dog.jpg" class="rounded-circle img-fluid">
	</div>
	
	<div class="col-sm-6">
		<img src="dog.jpg" class="img-thumbnail img-fluid">
	</div>
</body>
</html>