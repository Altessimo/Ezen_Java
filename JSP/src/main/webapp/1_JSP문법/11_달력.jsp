<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 달력 Day 12-5 </title>
</head>
<body>
<%
int year=2021; int month=11; // 검색이 없을경우에 해당하는 연도,월 초기값

//검색이 있을경우[request 요청 존재]
if(request.getParameter("year") != null && request.getParameter("month")!=null) {
	year = Integer.parseInt(request.getParameter("year"));
	month = Integer.parseInt(request.getParameter("month"));
}
%>

<% // 스크립트 태그[Java 코드가 작성할 수 있는 공간]
Calendar calendar = Calendar.getInstance(); // 현재 날짜, 시간
// int year = calendar.get(Calendar.YEAR); // 현재 연도
// int month=calendar.get(Calendar.MONTH)+1; // 현재 월 [1월:0 ~ 12:11]
		// 현재 월의 1일 설정
		calendar.set(year, month-1, 1); // 현재 열의 1열 설정
		int sweek = calendar.get(Calendar.DAY_OF_WEEK); // 요일찾기 2 : 월요일
		int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 현재월의 마지막날 → 30
%>
	<h1> <%=year %>년 <%=month %>월 달력(Calendar) [Day 12-5] </h1>
	
	<form style="margin: 30px;" action="11_중간체크1.jsp" method="post"> <!-- 현재 페이지 다시 요청 -->
	검색 : <input type="text" name="year" placeholder="연도">
	<input type="text" name="month" placeholder="월"> <input type="submit" value="검색">
	</form>

	<table border="1" style="margin: 30px;">
		<thead>
			<tr>
				<th>일요일</th><th>월요일</th><th>화요일</th><th>수요일</th><th>목요일</th><th>금요일</th><th>토요일</th>
			</tr>
		</thead>
		<tbody>
		<!-- for 구역 -->
			<tr>
				<% for(int i=1; i<sweek; i++){ %> <!-- for 구역 : 1일 전까지 공백찍기 -->
				<td></td>
				<% } %>
				<% for(int i=1; i<=eday; i++) { %> <!-- for 구역 : 1일부터 마지막날까지 출력 -->
				<td> <%=i %></td>
				<% if(sweek%7==0){ // 요일이 토요일 마다 tr을 닫고 다시 tr시작
					out.print("</tr><tr>");
				}
				sweek++;
				} %>
			</tr>
		</tbody>	
	</table>
</body>
</html>