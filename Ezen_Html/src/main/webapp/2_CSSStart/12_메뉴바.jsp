<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">

	#menuul{
		text-align: center; /* �ؽ�Ʈ ��� ���� */
		background-color: skyblue; /* ���� */
		color: white; /* �۲� �� */
		padding: 15px; /* ���� ���� */
	}

	.menuul{
		display: inline; /* inline(�� ����) block(���� ����) */
		margin-left: 20px; /* ���� �ٱ� ���� */
	}

	a{
		color: white; /* ��ũ ���� */
		ext-decoration: none; /* ��ũ(�⺻�� : ����) �������� */
	}

	a:hover {color: orange;} /* ���콺 �÷����� */
	

</style>


</head>
<body>
	<ul id="menuul"> <!-- ul(unorder list) : ����(��ȣ) ���� ��� -->
		<li class="menuul"> <a href="12_��ǰ�Ұ�.jsp"> �Ұ� </a></li>
		<li class="menuul"> <a href="12_������.jsp"> ������ </a></li>
		<li class="menuul"> <a href="12_�α���.jsp"> �α��� </a></li>
		<li class="menuul"> <a href="11_�߰�üũ4.html"> ȸ������ </a></li>
		<li class="menuul"> <a href="12_ã�ƿ��ô±�.jsp"> ã�ƿ��ô� �� </a></li>
	</ul>
</body>
</html>