<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> ���� </title>
</head>
<body>
	<h3> ���� </h3>
	<% String ��ũ��Ʈ = "Jsp ���α׷��� 1";
	int ����1=0; // ��ũ��Ʈ������ ���� ����� ������ �ʱⰪ �ʼ�
	%>
	
	<%! String ���� = "Jsp ���α׷��� 2";
	int ����2; // �ɹ����� : �ʱⰪ�� ���� ��� null, 0�� �ڵ����� �� �ʼ� X
	%>
	
	<br> ��°�� : <%= ��ũ��Ʈ %>
	<br> ��°�� : <%= ���� %>
	<br> ��°�� : <%= ����1 %>
	<br> ��°�� : <%= ����2 %>
	
	<%! // jsp ���� ����
	int one; int two=2;
	public int plus(){
		return one+two;
	}
	String msg;
	int three;
	%>
	<!-- ǥ���� -->
	<br> one�� two�� ����? : <%= plus() %> <!-- �޼ҵ� ��� -->
	<br> msg�� ����? : <%= msg %>	<!-- ���ڿ��� �ʱⰪ�� ������� null -->
	<br> three�� ����? : <%= three %> <!-- �Լ����� �ʱ���� ������� 0 -->
</body>
</html>