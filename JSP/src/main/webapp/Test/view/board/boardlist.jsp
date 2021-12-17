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
<%
	
%>


	<div class="container my-5">
		<h3> 게시판 </h3>
		<p> 게시물 목록 </p>
				<a href="boardwrite.jsp"><button>글작성</button></a>
			
		<div class="col-md-5 offset-7 input-group my-3">
			<select class="custom-select col-cmd-3" name="key">
				<option value="b_title"> 키워드 </option>
				<option value="b_contents"> 번호 </option>
				<option value="b_num"> 제목 </option>
				<option value="b_writer"> 작성자 </option>
			</select>
			<input type="text" class="form-control">
			<button class="btn btn-info ml-1"> 검색 </button>
	 </div>
	<div>
		<table class="table table-striped">
				<tr class="table-info">
					<th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th>
				</tr>
				<% for(int i=0; i<boards.size(); i++) { %>
			<tr>
				<td><%=(i+1) %></td>
				<td><a href="boardview.jsp?bum=?<%=i %>">
				<%=boards.get(i).getTitle() %></a></td>
			</tr>
			<% } %>
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