<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		#main{
			width: 700px;
			margin: 0 auto;
			background-image: url(�����̹���3.png);
			border: solid 1px #cccccc;
	
		}
		#main #ul{
			text-align: center;
			list-style-type: none;
		}
		.row1{
		font-size: 50px; color: yellow; text-shadow: 2px 2px 1px black;
		font-weight: bold;
		}
		.row2{
		font-size: 20px; color: yellow;
		}
		.row3{
		color: white; margin-top: 10px;
		
		}
		#main2{
		width: 450px; margin: 0 auto;
		}
		
		#ul2 .it{
		color: white;
		
		}
		#buttons {
			text-align: center; width: 450px;
		}
		#buttons button {
			padding: 10px 20px;
			font-size: 30px;
			margin: 50px;
		}
	</style>
</head>
<body>


	<!-- 
	
		ul : ��ȣ�� ���°� 
		ol : ��ȣ�� �ִ°�
		li : ����Ʈ ������(�ȿ� ���� �׸�)
	
	
	 -->

	<div id="main"> 
		<ul id = "ul"> 
			<li class="row1"> ����� �巹�� �� </li>
			<li class="row2"> Special Dress Shop </li>
			<li class="row3">����, ��ȥ�����, ���� ����� �� Ư���� ���� ����� �巹���� �԰� ���������� ���� �߾��� ������ ���ܺ�����. </li>
		</ul>
		
		<div id="main2">
			<img src="�巹����.jpg">
			<ul id="ul2">
				<li class="it">�Ⱓ : ���� ��/�Ͽ���<br>13:00 ~ �����ð� ������
				</li>
				<li class="it">��� : ���ǰ �Ǹ��� �� ����� �巹��<br>�� Ű��, Ŀ�� �巹���� �԰� �Ǿ����!
				</li>
			</ul>
			<div id="buttons">
				<button>�̿��� �� �̿���</button>
			</div>
		</div>
	
	</div>




</body>
</html>