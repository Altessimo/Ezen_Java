<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Dao.MemberDao" %>

<%
	// 0. Html 지우는 이유 : 
		
	// 1. ajax 통신할 데이터를 요청
	String userid=request.getParameter("userid");
	
	// Dao 아이디 체크 
	boolean result = MemberDao.getmemberDao().idcheck(userid);
	
	if(result) {
		out.print("1"); // html에 작성하기 / out은 <% 태그를 나감
	} else {
		out.print("0");
	}
	
	// jsp 태그는 통신 결과로 가지 않음(반환이 X) // htnk만 통신 결과로 반환
%>