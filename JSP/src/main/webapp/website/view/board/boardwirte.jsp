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
	<!-- 글쓰기 페이지 -->
	<<div class="container">
		<form action="../../controller/boardwritecontroller.jsp" method="post" enctype="multipart/form-data">
			<!-- form 전송데이터 기본 타입 : text(string) enctype="application/x-www-form-urlencoded 기본값 -->
			<!-- form 파일 데이터 타입 : multipart/form-data -->
			제목 : <input type="text" name="title">
			내용 : <textarea rows="" cols="" name="contents"></textarea>
			첨부파일 : <input type="file" name="file">
			<input type="submit" value="등	록"><br>
		</form>
	</div>
</body>
</html>