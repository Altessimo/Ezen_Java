<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="5_제어문결과.jsp">
	<!-- form action 속성 : submit이 실행되면 이동하는 페이지 -->
		이름 : <input type="text" name="name"><br>
		좋아하는 색상 : <select name="color">
			<option value="blue"> 파란색 </option>
			<option value="red"> 빨간색 </option>
			<option value="yellow"> 노란색 </option>
			<option value="etc"> 기타 </option>
		</select><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>