<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		#d1{
			background-image: url(�����̹���3.png);
			background-repeat: no-repeat;
			background-position: right top;
			width: 500px;
			boder: solid 1px;
			margin: 200px; padding: 100px;
			text-align: center;
		}
		h3{text-align: center; color: yellow; font-weight: bould; font-size: 50px;}
		#d1 .ds1{color: yellow; font-size: 20px;}
		#d1 .ds2{color: white;}
		#d1 .ds3{color: yellow;}
		#d1 .ds4{color: yellow;}
		#buttons{padding: 5px;}
	
	</style>

</head>
<body>
	<%@ include file="12_�޴���.jsp" %>

	<div id="d1">
	<h3> ����� �巹�� ��</h3>
		<ul class="ds1">
			<td class="col1"> Special Dress Shop</td>
		</ul>
		
		<ul class="ds2">
			<td class=col2> ����, ��ȥ�����, ���� ����� �� Ư���� ���� ����� �巹���� �԰� ���������� ���� �߾��� ������ ���ܺ�����. </td>
		</ul>
		
		<ul class="ds3">
			<td> <img src="�巹����.jpg"> </td>
		</ul>
			
		<ul class="ds4">
			<li class=col3> �Ⱓ : ���� ��/�Ͽ��� </li>
			13:00 ~ �����ð� ������
		</ul>
		
		<ul class="ds4">
			<li class=col3> ��� : ���ǰ �Ǹ��� �� ����� �巹�� </li>
			c
		</ul>
		
		<div id="buttons">
			<button type="submit"> �̿��� �� �̿��� </button>
		</ul>
		</div>

</body>
</html>