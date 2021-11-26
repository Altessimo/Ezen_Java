<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="1.bootstrap.jsp" %>
	<div classs"container">
			<nav class="navbar navbar-expand-md navbar-light fixed-top" stlye="background-color:skyblue;">
			<a class="navbar" href="#"> <img alt="" src="로고.jfif" style="width: 50px;"> </a>
			
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarcontents" 
		    	aria-controls="navbarcontents" aria-expanded="false" aria-label="Toggle navi">
    			<span class="navbar-toggler-icon"></span>
  			</button>
			
			<div class="collapse navbar-collapse" id="navbarcontents">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item dropdown">		
		        		<a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" 
				        	aria-haspopup="true" aria-expanded="false">	
				          	남성
		        		</a>
		        		<div class="dropdown-menu">			
				          <a class="dropdown-item" href="#"> 신발 </a>	
				          <a class="dropdown-item" href="#"> 의류 </a>
				          <a class="dropdown-item" href="#"> 용품 </a>
		        		</div>
		     		</li>
		     		
		     		<li class="nav-item dropdown">		
		        		<a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" 
				        	aria-haspopup="true" aria-expanded="false">	
				          	여성
		        		</a>
		        		<div class="dropdown-menu">			
				          <a class="dropdown-item" href="#"> 신발 </a>	
				          <a class="dropdown-item" href="#"> 의류 </a>
				          <a class="dropdown-item" href="#"> 용품 </a>
		        		</div>
		     		</li>
					
					<li class="nav-item dropdown">		
		        		<a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" 
				        	aria-haspopup="true" aria-expanded="false">	
				          	유아
		        		</a>
		        		<div class="dropdown-menu">			
				          <a class="dropdown-item" href="#"> 신발 </a>	
				          <a class="dropdown-item" href="#"> 의류 </a>
				          <a class="dropdown-item" href="#"> 용품 </a>
		        		</div>
		     		</li>
				</ul>
				
				<form class="form-inline">
					<input type="text"  class="form-control" placeholder="검색">	
					<a class="button" href="#"><img alt="" src="검색.png" style="width: 30px;"> </a>
				</form>
				
			</div>
		</nav>
	</div>

</body>
</html>