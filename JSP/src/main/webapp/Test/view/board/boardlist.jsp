<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../header.jsp" %>
	<div class="container my-5">
		<h3> 게시판 </h3>
		<p> 질문 게시판 </p>
		<div class="col-md-5 offset-7 input-group my-3">
			<select class="custom-select">
				<option> 키워드 </option>
				<option> 번호 </option>
				<option> 제목 </option>
				<option> 작성자 </option>
			</select>
			<input type="text" class="form-control">
			<button class="btn btn-info ml-1"> 검색 </button>
	 </div>
	<div>
		<table class="table table-striped">
			<thead>
				<tr class="table-info">
					<th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<tr><td>1</td><td>환불해주세요</td><td>홍길동</td><td>2021-12-08</td><td>1</td></tr>
				<tr><td>2</td><td>환불해주세요</td><td>홍길동</td><td>2021-12-09</td><td>2</td></tr>
				<tr><td>3</td><td>환불해주세요</td><td>홍길동</td><td>2021-12-10</td><td>3</td></tr>
			</tbody>
		</table>
	</div>
	<nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
        <span class="sr-only">Previous</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
        <span class="sr-only">Next</span>
      </a>
    </li>
  </ul>
</nav>

<div class="col-md-10 offset-10 my-10">
	<a href="boardwirte.jsp"><button type="button" class="btn btn-warning">문의하기</button></a>
</div>

 </div>
<br><br><br><br><br>
</body>
</html>