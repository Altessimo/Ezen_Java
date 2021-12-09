<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="Dto.Board"%>
<%@page import="Dto.Login"%>
<%@page import="Dao.BoardDao"%>
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
	/* 서버로 파일 업로드
		1. form[]
		2. cos.jar 추가
		3. MultipartRequest 객체명 = new MultipartRequest(요청방식[request], 업로드 파일 폴더경로, "용량(바이트)", "인코딩타입", "보안")
			1. 요청방식 : request
			2. 업로드 할 폴더 경로
			3. 용량 : 바이트 단위
			4. 인코딩 타입 : "utf-8"
			5. 보안 : new DefaultFileRenamePolicy()
				1. DefaultFileRenamePolicy : 파일명이 동일할경우 자동으로 파일명 뒤에 번호 부여[식별용]
		*/
		// 현재 작업폴더 업로드
	//String folderpath="C:/Users/505/git/Ezen_Java/JSP/src/main/webapp/website/uploud";
	
	// 서버 폴더 업로드
		// 1. 서버 실제 경로
	String folderpath = request.getSession().getServletContext().getRealPath("website/upload");
	MultipartRequest multi = new MultipartRequest(request, folderpath, 1024*1024*10, "utf-8", new DefaultFileRenamePolicy());
	// 컴퓨터에 있는 파일을 Cos 서버로 이동
	
	request.setCharacterEncoding("utf-8");
	String title = multi.getParameter("title");
	String contents = multi.getParameter("contents");
	
	// <br>, 프론트 <> 마크업 태그 제거
	// contents = contents.replace("/r\n", "<br>");
	
	// 프론트 <> 태그 제거(입력상자 사용시 필수)
		// 1. html < > → 문자변환
	contents = contents.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>");
	// &lt : < 표시를 하기 위해서 
	title = title.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\S)*(/)?","");
	
	String file = multi.getFilesystemName("file");
	// getFilesystemName업로드 관련 X / boardwirte.jsp의 multipart/form-data로 가는 경로
	
	// 요청[일반 form]
		/* request.setCharacterEncoding("utf-8"); // 요청[request] 한글인코딩
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String file = request.getParameter("file");
		*/
		
		// 작성자의 회원 번호
		Login login = (Login)session.getAttribute("login");
		int m_num = login.getM_num();
		
		// 객체화
		Board board = new Board(title, contents, m_num, file);
		
		// db 처리
		BoardDao.getboardDao().boardwrite(board);
		
		response.sendRedirect("../view/board/boardlist.jsp");
	%>
</body>
</html>