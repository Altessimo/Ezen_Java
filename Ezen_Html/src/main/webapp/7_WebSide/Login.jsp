<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Heder.jsp" %>
<div class="col-md-4 offset-4 my-5">
<h3>�α���</h3>
	<p> ���̵�� ��й�ȣ�� �Է� �� �ּ��� </p>
</div>
<form>
<div class="col-md-4 offset-4 my-5">
	<div class="form-group">
		<label> ���̵� </label><br>
		<input calss="form-control" type="text" placeholder="���̵� �Է� �� �ּ���"><br>
	</div>
	
	<div class="form-group">
		<label> ��й�ȣ </label><br>
		<input calss="form-control" type="password" placeholder="��й�ȣ�� �Է� �� �ּ���"><br>
	</div>
	
	<div class="form-group mt-5">
		<button type="submit"> ȸ������ </button>
		<button type="submit"> �α��� </button>
	</div>
	</div>
</form>

<%@include file="Footer.jsp" %>
<br><br><br><br><br>
</body>
</html>

