<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> ��ũ��Ʈ �� </title>
</head>
<body>
	<h3> ��ũ��Ʈ �� </h3>
	<%! int one; String msg; %> <!-- �����̶� syso�� ������ ���� -->
	<% int one=31; String msg="���� ��Ʈ��Ʈ"; %>
	
	<br> one : <%= one %> <!-- ��Ʈ��Ʈ -->
	<br> msg : <%= msg %> <!-- ��Ʈ��Ʈ -->
	<br> ���� one : <%= this.one %>
	<br> ���� msg : <%= this.msg %>
	<br> ���� ��� : <%= application.getRealPath("/") %>
	
	<% float f = 2.3f;
	int i=Math.round(f);
	Date date = new Date(); // java ���̺귯�� ȣ�� ����
	%>
	
	<br> �Ǽ� f�� �ݿø� ���� : <%= f %>
	<br> ������ ��¥�� �ð���? : <%= date.toString() %>
</body>
</html>