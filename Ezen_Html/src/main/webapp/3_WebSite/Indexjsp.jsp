<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	/* �׵θ� ���̾ƿ� �� ó���� �ְ� �ϱ�*/
		header{ /* �ش� �±� �ٹ̱�*/
		width: 1150px; /* ���α��� */
		height: 100px; /* ���� : ���̾ƿ� �� */
		margin: 0 auto; /* �ڽ��� �������[��Ʈ��] text-align: ����, ��Ʈ��*/}
		#main_img{width: 100%; /* ���α��� : ����� ����͸� ǥ���� �� �ִ� �ȼ� */ 
		height: 250px; /* ���� */ }
		/*
			�ȼ� 	vs 	����
			��		��
			���伥	�Ϸ���Ʈ
			����/����	�ִϸ��̼�
			���켺	
			��� ����
		*/
		
		#contents{width: 1150px; margin: 0 auto;}
		#sub_menu{width: 240px;
		float: left;} /* �ڽ��� ���� ��ġ */
		#main_contents{width: 900px;
		float: right; /* �ڽ��� ������ ��ġ */
		}
		footer{width: 100%; /* Ǫ�ʹ� ������ 1���� 1���� �ۿ� ���� */
		height: 150px;
		clear: both; /* float : ���� */
		}
		
	</style>
</head>
<body>
	<!-- 1. ���̾ƿ�(display : block �� 1ĭ ����) -->
		<!-- �ش� �±�[div ����ص� ���� -->
		<%@ include file="2_Header.jsp" %>
		<!-- ���� �±�[div ó�� ���� ������ --> <!-- Ŭ������ �ٹа�� 2���̻� -->
		<%@ include file="3_MainImg.jsp" %>
		 <!-- ���� �±� -->
		<!-- �޴��±� [div ����ص� ����] -->
		<%@ include file="4_main.jsp" %>
		<!-- Ǫ�͸޴� [div ����ص� ����] -->
		<%@ include file="5_Footer.jsp" %>
</body>
</html>