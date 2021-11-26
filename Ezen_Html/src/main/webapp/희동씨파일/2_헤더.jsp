<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
   <style type="text/css">
   .navbar-brand {width: 200px; margin: 0 auto;}
   .navbar-brand:hover{  transition: all 0.2s linear; transform: scale(1.2);}
   .navbar-nav li {padding:0 10px 0 0; font-size: 20px; color:black;}
   .nav-item a:hover {
      border-bottom: 2px orange solid;
      color: orange;
      font-weight: bold;
      
   }
   .nav-item a.active{
      color: orange;       
   }
   

   </style>
</head>
<body>
   
   <div class = container>
      <nav class = "navbar navbar-expand-lg navbar-light fixed-top" style="background-color: #ffffff; border-bottom: 1px solid #E6E6E6;">
         <a href="#" class="navbar-brand">
            <img alt="" src="logo.png" style="width: 120px; height: 30px;">
         </a>
         
         <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarcontents"
               aria-controls="navbarcontents" aria-expanded="false" aria-abel="Toggle navi">
               
            <span class="navbar-toggler-icon"></span>
         </button>   
         
         <div class="collapse navbar-collapse" id="navbarcontents">
            <ul class = "navbar-nav">
               <li class ="nav-item active"><a href="#" class="nav-link">역사</a></li>
               <li class="nav-item"><a href="#" class="nav-link">제품소개</a></li>
               <li class="nav-item"><a href="#" class="nav-link">사업영역</a></li>
               <li class="nav-item"><a href="#" class="nav-link">찾아오시는 길</a></li>
               
               <li class="nav-item dropdown">
                  <a class = "nav-link dropdown-toggle" href="#" data-toggle="dropdown" 
                     aria-haspopup="true" aria-expanded="false">
                     인재채용
                  </a>
                  <div class = "dropdown-menu">
                     <a class="dropdown-item" href="#">인재상</a>
                     <a class="dropdown-item" href="#">직무소개</a>
                     <a class="dropdown-item" href="#">인사제도</a>
                  </div>
               </li>   
            </ul>
            <form class="form-inline justify-content-between">
               <input type ="text" class = "form-control" placeholder="제품검색">
               <button class="btn btn-default">역사</button>
            </form>
            
         </div>
      </nav>
   </div>
</body>
</html>