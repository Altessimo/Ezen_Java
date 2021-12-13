<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String foldpath = request. getSession().getServletContext().getRealPath("website/update");
	MultipartRequest multi = new MultipartRequest(request, foldpath, 1024*1024*10, "utf-8", new DefaultFileRenamePolicy());
	
	request.setCharacterEncoding("utf-8");
	String pnum = multi.getParameter("pnum");
	String pprice = multi.getParameter("pprice");
	String pcategory = multi.getParameter("pcategory");
	String pmanufacturer = multi.getParameter("pmanufacturer");
	String psize = multi.getParameter("psize");
	String pstock = multi.getParameter("pstock");
	String pimg = multi.getParameter("pimg");
	String pcontents = multi.getParameter("pcontents");
	
	pcontents=pcontents.replaceAll("<","&lt;").replaceAll(">","&gt;").replaceAll("\n", "<br>");
	
%>