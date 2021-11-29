<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> 선언문 </title>
</head>
<body>
	<h3> 선언문 </h3>
	<% String 스크립트 = "Jsp 프로그래밍 1";
	int 변수1=0; // 스크립트문에서 변수 선언시 무조건 초기값 필수
	%>
	
	<%! String 선언문 = "Jsp 프로그래밍 2";
	int 변수2; // 맴버변수 : 초기값이 없을 경우 null, 0이 자동으로 들어감 필수 X
	%>
	
	<br> 출력결과 : <%= 스크립트 %>
	<br> 출력결과 : <%= 선언문 %>
	<br> 출력결과 : <%= 변수1 %>
	<br> 출력결과 : <%= 변수2 %>
	
	<%! // jsp 선언문 구역
	int one; int two=2;
	public int plus(){
		return one+two;
	}
	String msg;
	int three;
	%>
	<!-- 표현식 -->
	<br> one과 two의 합은? : <%= plus() %> <!-- 메소드 결과 -->
	<br> msg의 값은? : <%= msg %>	<!-- 문자열이 초기값이 없을경우 null -->
	<br> three의 값은? : <%= three %> <!-- 함수열이 초기없이 없을경우 0 -->
</body>
</html>