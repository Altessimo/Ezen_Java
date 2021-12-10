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
<div class="container">
	<div class="row">
		<div class="offset-1 col-md-10 offset-1">
			<input type="text" placeholder="제목" class="form-control my-1">
			<textarea rows="20" cols="내용" name="contents" class="form-control my-1"></textarea>
			 <input type="file" name="file">
			<div class="offset-11 my-1">
				<a href="/Ezen_Jsp/Test/view/board/boardview.jsp"><button class="btn btn-success">글 수정하기</button></a>
			</div>
			<div class="offset-11 my-1">
				<a ><button class="btn btn-success">글 작성하기</button></a>
			</div>
		</div>
	</div>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>