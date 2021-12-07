<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="Dto.Board"%>
<%@page import="Dto.Login"%>
<%@page import="Dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
	
	String file = multi.getFilesystemName("file"); // type : file
	if(file == null){
		file = multi.getFilesystemName("oldfile"); // 새로운 첨부가 없을 경우 기존 첨부를 DB에 저장 // type: he
	}
	// getFilesystemName업로드 관련 X / boardwirte.jsp의 multipart/form-data로 가는 경로
	
	// 요청[일반 form]
		/* request.setCharacterEncoding("utf-8"); // 요청[request] 한글인코딩
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String file = request.getParameter("file");
		*/
		int b_num = Integer.parseInt(multi.getParameter("b_num"));
		Board board = new Board(b_num, title, contents, file); // 객체화
		boolean result=BoardDao.getboardDao().boardupdate(board); // db 처리
		if(result) {
		      out.print("<script>alert('게시글이 수정되었습니다.')</script>");
		      out.print("<script>location.href='/Ezen_Jsp/website/view/board/boardview.jsp?b_num="+b_num+"';</script>"); 
		   }else{
		      out.print("<script>alert('게시글 수정 실패')</script>");
		   }
	%>