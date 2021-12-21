<%@page import="Dto.Product"%>
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
<%@ include file="../header.jsp" %>

<div class="container">
	<div class="row">
		<div class="col-md-6">
			<h3> 주문 그래프</h3>
				<canvas id="mychart"></canvas>
			</div>
		<div class="col-md-6">
		<h6> 제품별 총 판매량 </h6>
			<canvas id="productchart"></canvas>
		</div>
	</div>
	
	<div class="row">
		<div class="col-md-6">
			<h6> 제품별 판매 추이</h6>
				<select class="from-control" onchange="pchange()" id="pselect">
					<option> 제품 명 선택 </option>
					<% ArrayList<Product> products = ProductDao.getProductDao().getProductslist(null, null); %>
					<% for(Product temp : products) { %>
						<option value="<%=temp.getP_num()%>"> <%=temp.getP_name()%></option>
					<% } %>
				</select>
				<canvas id="productdatechart"></canvas>
			</div>
		<div class="col-md-6">
		<h6> 제품별 판매량 </h6>
		</div>
	</div>
</div>
</body>
</html>