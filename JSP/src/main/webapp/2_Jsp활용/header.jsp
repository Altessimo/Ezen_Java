<%@page import="Test.Book"%>
<%@page import="Test.Board"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="Test.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 세션 불러오기
	String loginid = (String)session.getAttribute("loginid");
	%>
	
	<%
	ArrayList<Member> members=new ArrayList<>(); // 1. 회원 초기화 
	// 2. 파일 스트림 설정
	FileInputStream fileInputStream = new FileInputStream("C:/Users/505/git/Ezen_Java/JSP/src/main/java/Test/memberlist.txt");
	byte[] bytes = new byte[1000]; // 3. 읽어올 바이트를 저장할 바이트 배열
	fileInputStream.read(bytes); // 4. 파일 읽기 → 문자열 변환
	String smember = new String(bytes); // 5. 바이트 배열 → 문자열 변환
	String[] ssmember = smember.split("\n"); // 6. 문자열 분해[\n] : 회원 구분
	for(int i=0; i<ssmember.length-1; i++) { // 7. 마지막 \n을 제외한 반복문을 돌림 그래서 -1을 함
		// 객체화
		Member member = new Member(ssmember[i].split(",")[0],
				ssmember[i].split(",")[1], ssmember[i].split(",")[2]);
		members.add(member); // 리스트에 객체 저장
	}
		fileInputStream.close();
		
	// 게시물 파일
	ArrayList<Board> boards=new ArrayList<>();
	fileInputStream=new FileInputStream("C:/Users/505/git/Ezen_Java/JSP/src/main/java/Test/boardlist.txt");
	bytes = new byte[1000];
	fileInputStream.read(bytes);
	String sboard=new String(bytes);
	String[] ssboard=sboard.split("\n");
	for(int i=0; i<ssboard.length-1; i++){
		Board board = new Board(ssboard[i].split(",")[0], ssboard[i].split(",")[1], ssboard[i].split(",")[2]);
				boards.add(board);
	}
	fileInputStream.close();
	/* 
	// 도서 검색
	ArrayList<Book> books=new ArrayList<>();
	fileInputStream=new FileInputStream("C:/Users/505/git/Ezen_Java/JSP/src/main/java/Test/book.txt");
	bytes = new byte[1000];
	fileInputStream.read(bytes);
	String sbook=new String(bytes);
	String[] ssbook=sbook.split("\n");
	for(int i=0; i<ssbook.length-1; i++){
		Book book = new Book(ssbook[i].split(",")[0], ssbook[i].split(",")[1], ssbook[i].split(",")[2]);
		books.add(book);
	}
	fileInputStream.close(); */
	%>
	
	<h3> <a href="main.jsp"> 페이지 구역 </a></h3>
	<ul>
	<% if(loginid != null){out.print("<li>"+loginid+"님 안녕하세요</li>");} %>
	<% if(loginid != null) { %>
	<li> <a href="logout.jsp">로그아웃</a></li>
	<% } %>
		<li><a href="login.jsp">로그인</a></li>
		<li><a href="signup.jsp">회원가입 </a></li>
		<li><a href="book.jsp"> 도서검색 </a></li>
		<li><a href="lotto.jsp"> 로또구매 </a></li>
		<li><a href="boardlist.jsp"> 게시판</a> </li>
	</ul>
</body>
</html>