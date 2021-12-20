<%@page import="Dao.PorderDao"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	JSONObject jsonObject = new JSONObject();
	/* // JSONObject ←-→ Map
		// JSONObject.put(키:값) : 엔트리 추가
	jsonObject.put("id", "1234");
	jsonObject.put("password", "1234"); */
	
	jsonObject = PorderDao.getPorderDao().getorderdatecount();
%>

<%=jsonObject%>