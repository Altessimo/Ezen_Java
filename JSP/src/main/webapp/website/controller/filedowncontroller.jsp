<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
// 1. 경로에서 파일 명 가져오기 [조건 : ../../controller/filedowncontroller.jsp?file=파일명] 파일 이름 요청
request.setCharacterEncoding("utf-8");
String filename = request.getParameter("file");

// 2. 서버 내 업로드 폴더애서 파일 찾기
String folderpath = request.getSession().getServletContext().getRealPath("website/upload/"+filename);
					// request.getSession().getRealPath : 서버 내 경로 찾기 // 현재 문서의 경로 찾기
// 3. 서버 내 업로드 폴더 내 파일 찾아서 파일을 객체화
File file = new File(folderpath);

// 4. 다운로드 형식변경  / 클라이언트에게 응답하기
response.setHeader("Content-Disposition", "attachment;filename="+filename+";");
// setHeader("다운로드형식html, 다운로드형식에 표시할 파일명")

// 내보내기[스트림(바이트)]
// 2. 만약에 파일이 존재하면
if(file.isFile()) { //file.isFile() : 파일이 있는지 없는지 유무 확인
	// 3. 입력 스트림[파일을 바이트 형으로 읽어오기] //  해당 경로에서 파일 읽어오기[바이트를 읽어오기]
	BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
	// 1. 배열 선언
	byte[] bytes = new byte[(int)file.length()]; // file.legnth : 파일내 바이트 길이 메소드
	inputStream.read(bytes);
	// 3. 출력 스트림[읽어 온 바이트형 파일을 내보내기] : response.getOutputStream() : 클라이언트에게 바이트 전송
	BufferedOutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
	outputStream.write(bytes);
	// 클라이언트 서버 → 폴더 → 서버 → 클라이언트
	
	inputStream.close(); // 입력 스트림 닫기 / 용량이 많을경우 오류 가능 첨부파일 사용시에는 꼭 스트림 닫기
	outputStream.close(); // 출력 스트림 닫기
}
%>