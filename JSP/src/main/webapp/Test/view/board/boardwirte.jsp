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

	<form action="boardwritecontroller.jsp">
	</form>
<div class="container">
	<div class="row">
		<div class="offset-1 col-md-10 offset-1">
			<input type="text" placeholder="제목" class="form-control my-1">
			<textarea rows="20" cols="내용" name="contents" class="form-control my-1"></textarea>
			<div class="offset-11 my-1">
				<a href="/Ezen_Jsp/Test/view/board/boardupdate.jsp"><button class="btn btn-success">글 수정하기</button></a>
			</div>
			<div class="offset-11 my-1">
				<a href=""><button type="button" class="btn btn-success">글 작성하기</button></a>
			</div>
		</div>
	</div>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>