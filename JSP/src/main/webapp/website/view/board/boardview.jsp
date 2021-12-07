<%@page import="java.util.ArrayList"%>
<%@page import="Dao.BoardDao"%>
<%@page import="Dto.Board"%>
<%@page import="Dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file = "../header.jsp" %>
	
	<%
	/* ArrayList<String> viewtemp = new ArrayList<>(); */
	int b_num = Integer.parseInt( request.getParameter("b_num")); // 전 페이지에서 클릭한 게시물번호
	
	String boardviews = loginid+" : " + b_num; // 2. 현재 로그인 id + 게시물번호; → 세션이동 사용예정
	if(session.getAttribute(boardviews)==null) { // 3. DB 호출[조회수 증가]
	/* if(session.getAttribute("loginid")==null && (int)session.getAttribute("loginid") != b_num) { */

	// 조회수 증가
	BoardDao.getboardDao().boardcount(b_num); // 4. 세션명 = 현재로그인 id + 게시물 번호
	/* viewtemp.add(loginid); */
	// 조회수 증가 방지[세션 생성 : 세션 아이디, 세션 값]
			String boardview = loginid+" : " + b_num;// 5. 조회수 증가 방지[세션 생성 : 세션 아이디, 세션 값]
	session.setAttribute(boardview, true);
	session.setMaxInactiveInterval(60*60*24); // 하루 세션 값 // 세션 유효시간 : 초당[하루]
	}
	/* session.setAttribute(b_num, viewtemp); */
	/* } */
	// 해당 게시물 번호의 게시물 가져오기
	Board board = BoardDao.getboardDao().getboard(b_num);
	%>
	
<!-- 게시물 상세 페이지 -->
<div class="container">
	<div class="row">
		<div class="m-2"><a href="#"><button class="form-control">목록보기</button></a></div>
		<% if(loginid !=null && loginid.equals(board.getB_writer())) { %> <!-- 로그인 아이디와 작성자가 동일할 경우에만 -->
		<div class="m-2"><a href="boardupdate.jsp?b_num=<%=board.getB_num()%>"><button class="form-control">수정하기</button></a></div>
		<div class="m-2"><a href="../../controller/boarddeletecontroller.jsp?b_num=<%=board.getB_num()%>"><button class="form-control">삭제하기</button></a></div>
		<% } %>
	</div>
	<table class="table">
		<tr>
			<td style="width: 20%"> 작성자 : <%=board.getB_writer() %></td>
			<td> 작성일 : <%=board.getB_date() %></td>
			<td> 조회수 : <%=board.getB_view() %></td>
		</tr>
		
		<tr>
			<td>제목</td>
			<td colspan="2"><%=board.getB_title() %></td>
		</tr>
		
		<tr>
			<td style="height: 300px;">내용</td>
			<td colspan="2"><%=board.getB_contents() %></td>
		</tr>
		
		<tr>
			<td> 첨부파일 다운로드 <br>
			<% if(board.getB_file()==null) { %>
			<% } else { %>
				<a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file()%>"><%=board.getB_file() %></a>
			<% } %>
			</td>
			
			<% if(board.getB_file()==null) { %>
			<td colspan="2" height="300px;"> <!-- 박스권안에 사진 사이징 : max-width, max-height -->
			 미리보기 <img src="../../upload/<%=board.getB_file()%>" style="max-width: 100%; max-height: 100%;"></td>
			 <% } %>
		</tr>
	</table>
	<br><br>
	<hr>
	
	<div class="row">
		<div class="col-md-2">
			<h6> 댓글 작성 </h6>
		</div>
		
		<div class="col-md-8">
			<textarea rows="" cols="" class="form-control"></textarea>
		</div>
		
		<div class="col-md-2">
			<button class="form-control"> 등록 </button>
		</div>
		<table class="table m-3">
			<tr>
				<th> 작성자 </th> <th> 내용 </th> <th> 작성일 </th>
			</tr>
			</form>
		</table>
	</div>
</div>
</body>
</html>