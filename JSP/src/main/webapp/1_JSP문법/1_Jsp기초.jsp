<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> ���� ���� </title>
</head>
<body>
	<P> JSP(JavaServer Pages) : �ڹ� ���� ������</P>
	<ul>
		<li> 1. HTML + JAVA �ڵ带 ���� �� �� �ִ� ������ </li>
		<li> 2. �������� ��ȯ </li>
		<li> 3. Java �� �� ���α׷���[���� : Java, Html ����] �� Jsp[Javahtml]</li>
			<li> // Spring + ���� / javahtml �������� X </li>
		<li> 4. Jsp ���� �� java + Html + css + Js �ۼ� ���� </li>
		<li> 5. Jsp �������� �� �� ����[java ����]�� ��ȯ </li>
		<li> 6. ��� ��� : java ���� �±� �ȿ��� �ۼ� </li>
	</ul>
	<h1> ��Ʈ��Ʈ �� </h1> <!-- html ���� -->
	
	<!-- jsp ����(���� �±� : 1. ��������[��������] O, 2. �޼ҵ� ���� O, 3. ��� X) -->
	<%! String ���ڿ� = "Jsp ����"; %>
	<%! public String �޼ҵ�(){return "Jsp �޼ҵ� ����";} %>
	
	<!-- jsp ����(��ũ��Ʈ �±� : �޼ҵ� ���� X, 1. ���� ���� O[��������], 2. �޼ҵ� ���� X, 2. ��� O) -->
	<% String ��ũ��Ʈ ="Jsp ��ũ��Ʈ";
	String ���� = "Jsp �Դϴ�.";
	System.out.print("�ֿܼ� ����ϴ� �޼ҵ�"); // �ܼ� ���
	out.print("Html ����ϴ� �޼ҵ�"); // out : ��ũ��Ʈ �±� ������ �� html�� �̵�(ȭ�鿡 ����� ��)
	%>
	
	<!-- html ���� -->
	<BR> ���� ��� : <%= ���ڿ� %> <!-- ǥ���� �±� : ����, �޼ҵ� ȣ�� -->
	<BR> �޼ҵ� ��� : <%= �޼ҵ�() %>
	<BR> ��ũ��Ʈ ��� : <%= ��ũ��Ʈ %>
	
	<!-- �ּ� -->
	<BR> HTML : <!-- HTML �ּ� -->
	<BR> CSS : /* CSS �ּ� */
	<BR> JSP : <%-- JSP �ּ� --%>
	<BR> JSP : <% /* ������ �ּ� */		// ���� �ּ� %>
</body>
</html>