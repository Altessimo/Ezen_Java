<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> 문법 기초 </title>
</head>
<body>
	<P> JSP(JavaServer Pages) : 자바 서버 페이지</P>
	<ul>
		<li> 1. HTML + JAVA 코드를 삽입 할 수 있는 페이지 </li>
		<li> 2. 서블릿으로 변환 </li>
		<li> 3. Java → 웹 프로그래밍[서블릿 : Java, Html 별도] → Jsp[Javahtml]</li>
			<li> // Spring + 서블릿 / javahtml 스프링은 X </li>
		<li> 4. Jsp 파일 내 java + Html + css + Js 작성 가능 </li>
		<li> 5. Jsp 실행했을 때 → 서블릿[java 파일]로 변환 </li>
		<li> 6. 사용 방법 : java 사용시 태그 안에서 작성 </li>
	</ul>
	<h1> 스트립트 예 </h1> <!-- html 구역 -->
	
	<!-- jsp 구역(선언문 태그 : 1. 변수선언[전역변수] O, 2. 메소드 선언 O, 3. 출력 X) -->
	<%! String 문자열 = "Jsp 선언문"; %>
	<%! public String 메소드(){return "Jsp 메소드 선언";} %>
	
	<!-- jsp 구역(스크립트 태그 : 메소드 선언 X, 1. 변수 선언 O[지역변수], 2. 메소드 선언 X, 2. 출력 O) -->
	<% String 스크립트 ="Jsp 스크립트";
	String 내용 = "Jsp 입니다.";
	System.out.print("콘솔에 출력하는 메소드"); // 콘솔 출력
	out.print("Html 출력하는 메소드"); // out : 스크립트 태그 나가기 → html로 이동(화면에 출력이 됨)
	%>
	
	<!-- html 구역 -->
	<BR> 선언문 출력 : <%= 문자열 %> <!-- 표현식 태그 : 변수, 메소드 호출 -->
	<BR> 메소드 출력 : <%= 메소드() %>
	<BR> 스크립트 출력 : <%= 스크립트 %>
	
	<!-- 주석 -->
	<BR> HTML : <!-- HTML 주석 -->
	<BR> CSS : /* CSS 주석 */
	<BR> JSP : <%-- JSP 주석 --%>
	<BR> JSP : <% /* 여러줄 주석 */		// 한줄 주석 %>
</body>
</html>