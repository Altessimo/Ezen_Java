<%@page import="Dao.BoardDao"%>
<%@page import="Dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file = "../header.jsp" %> <!-- 헤더 페이지 -->
<%
// 검색처리 : 키워드 입력하고 검색 버튼을 눌렀을때 
String key=request.getParameter("key");
String keyword=request.getParameter("keyword");

// 페이징 처리[1. 검색이 있을경우 2. 검색이 없을경우]
String pagenum= request.getParameter("pagenum"); // 클릭한 페이지 번호
	if(pagenum==null){ // 클릭한 페이지 번호가 없으면[게시판 첫 화면]
		pagenum="1"; // 1페이지 설정
	}

	int lastrow=BoardDao.getboardDao().boardcount(key, keyword); // 1. 총 개시물 수
	int listsize = 10; // 2. 페이지당 화면에 표시할 게시물 수 

	int lastpage = 0; // 34개면 4페이지 : 10 + 10 + 10 + 4
		if(lastrow % listsize==0) { // 3. 마지막 페이지 34 = 3+1 / 30 = 3 // 나머지가 있을때 +1
			lastpage=lastrow / listsize;
		} else {
			lastpage=lastrow / listsize+1;
		}

// 5. 현재 페이지 번호 // 34 : 1(1~10) 2(11~20)
int currentpage = Integer.parseInt(pagenum);
// 6. 현제 페이지 시작번호
int startrow=(currentpage-1)*listsize;
// 1페이지 → 0*10 → 0 / 2페이지 → 1*10 → 10 / 3페이지 → 2*10 → 20
// 7. 현제 페이지 마지막 번호
//int endrow=currentpage*listsize;

ArrayList<Board> boards = BoardDao.getboardDao().boardlist(startrow, listsize, key, keyword);
%>

<!-- 고객센터 페이지 -->
<div class="container">

	<div class="text-center">
		<h3 style="border-bottom: solid 1px #eeeee;"> 고객센터 </h3><br>
		<p style="color: orange;"> 궁금하신점이 있으시다면 알려주세요 </p>
	</div>

<div class="text-center">

	<div class="row">
	<div class="col-md-5 m-2">
		<h4> 자주 묻는 질문 </h4>
			<table class="table">
				<tr>   <td> Q. </td> <td> 이용방법이 궁금합니다 </td></tr>
				<tr>   <td> Q. </td> <td> 아이디를 분실했습니다 </td></tr>
				<tr>   <td> Q. </td> <td> 비밀번호를 분실했습니다 </td></tr>
				<tr>   <td> Q. </td> <td> 아이디를 분실했습니다 </td></tr>
			</table>
		</div>

<div class="col-md-6 align-middle">
	<h4> 고객문의 </h4> 
	<h1 class="text-success"> 1234-5678 </h1><br>
	<h6> 365일 24시간 운영</h6>
	
</div>
</div>
</div>
<br><br>

	<h4> 문의 게시판 </h4>
	<div class="row">
			<%
			if(loginid != null) { // null값은 equals 불가
			%>
					<div class="col-md-2 offset-10">
						<a href="boardwirte.jsp"><button type="button" class="form-control">글 등록</button></a>
					</div>
			<% } else { %>
				<div class="col-md-3 offset-9">
					로그인 후에 글 등록 가능합니다.
				</div>
			<% } %>
			</div><br>
			
			<!-- 게시물 수 -->
			<% if(keyword != null) { %>
				<p> 총 검색 수 : <%=lastrow %></p>
			<% } else { %>
				<p> 총 게시물 수 : <%=lastrow %></p>
			<% } %>
			
	<table class="table">
		<tr>
			<th> 번호 </th>
			<th> 제목 </th>
			<th> 작성자 </th>
			<th> 작성일 </th>
			<th> 조회수 </th>
		</tr>
			<% if(boards.size()==0) {%>
			<tr>
				<td colspan="5" class="text-center">검색 결과가 없습니다.</td>
			</tr>
			<% } %>
			
			<% for(Board board : boards) { %>
		<tr>
			<td><%=board.getB_num() %></td>
			<td><a href="boardview.jsp?b_num=<%=board.getB_num()%>"><%=board.getB_title() %></a></td>
			<!-- 게시물 상세페이지 이동 [ 클릭한 게시물 번호 요청 ] -->
			<td><%=board.getB_writer() %></td>
			<td><%=board.getB_date() %></td>
			<td><%=board.getB_view() %></td>
		</tr>
			<% } %>
</table>

<!-- 페이징 번호 -->
<div class="row"> <!-- 가로 배치 -->
	<div class="col-md-4 offset-4 my-3">
		<ul class="pagination">
		<% if(keyword==null) { %>
			
		<!-- 첫 페이지에서 이전페이지 눌렀을때 첫 페이지 고정 -->
			<% if(currentpage==1) { %>
			<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage %>&key=<%=key%>&keyword=<%=keyword %>" class="page-link"> 이전 </a></li>
				<% } else { %>									<!-- 현재 페이지 번호 -1 -->
				<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage%>&key=<%=key%>&keyword=<%=keyword %>" class="page-link"> 이전 </a> </li>	
				<% } %>
		<% } else { %>														<!-- 현재 페이지 번호 -1 -->
			<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage-1 %>" class="page-link"> 이전 </a></li>
			<% } %>
			
			<!-- 게시물의 수 만큼 페이지 번호 생성 -->
			<% for(int i=1; i<=lastpage; i++) { %>
			<!-- 게시물의 수 만큼 페이지 번호 생성 -->
			<li class="page-item"><a href="boardlist.jsp?pagenum=<%=i %>" class="page-link"> <%=i %> </a></li>
			<!-- i 클릭한 번호에 현재 페이지 이동[클릭한 페이지 번호] -->
			<% } %>
			
			<!-- 마지막 페이지에서 다음버튼 눌렀을때 마지막 페이지 고정 -->
			<% if(currentpage==lastpage) { %>
			<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage %>&key=<%=key %>&keyword=<%=keyword %>" class="page-link"> 다음 </a></li>
			<% } else { %>									<!-- 현재 페이지 번호 +1 -->
			<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage+1 %>&key=<%=key %>&keyword=<%=keyword %>" class="page-link"> 다음 </a></li>
			<% } %>
		</ul>
	</div>
</div>
	
	<!-- 검색 -->
	<form action="boardlist.jsp?pagenum=<%=currentpage%>" method="get" class="col-md-5 offset-3 input-group my-3">
		<select class="custom-select col-cmd-3" name="key"> <!-- key : 필드명 -->
			<option value="b_title"> 제목 </option>
			<option value="b_contents"> 내용 </option>
			<option value="b_num"> 번호 </option>
			<option value="b_writer"> 작성자 </option> <!-- value = 필드명 -->
			
		</select>
	<input type="text" class="form-control" name="keyword"><!-- keyword: 검색 대상 -->
	<input type="submit" class="btn btn-outline-info" value="검색">
	</form>
</div>
<br><br><br><br><br><br><br>

</body>
</html>