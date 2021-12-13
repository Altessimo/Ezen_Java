<%@page import="Dao.ProductDao"%>
<%@page import="Dto.Product"%>
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
	// 제품 상세페이지 == 게시물보기
	int p_num = Integer.parseInt( request.getParameter("p_num") );
		Product product = ProductDao.getProductDao().getproduct(p_num);
%>

	<%@include file="../header.jsp" %>
	
	<div class="container"> <!-- 박스권 -->
		<div class="row"> <!-- 가로 배치 -->
		
			<div class="col-md-6">
				<img alt="" src="../../upload/<%=product.getP_img()%>" style="max-width: 100%;">
			</div>
			
				<div class="col-md-6">
					<p> <%=product.getP_manufacturer() %> </p>
					<h4> <%=product.getP_name() %> </h4>
					<hr>
						<div class="row">
							<div class="col-md-3"> 구매혜택 </div>
							<div class="col-md-9">  포인트 1% 제공 </div>
						</div><br>
						<div class="row">
							<div class="col-md-3"> 배송정보 </div>
							<div class="col-md-9"> 영업일 기준 1~3일(휴일제외) </div>
						</div>
					<hr>
						<div class="row">
							<div class="col-md-3"> 가격 </div>
							<div class="col-md-9"><%=product.getprice() %> 원</div>
						</div>
					<hr>
						<div class="row">
							<div class="col-md-3"> 제품 사이즈 </div>
									<div class="col-md-9">
									<select name="p_active" class="form-control">
										<option> 옵션선택 </option>
										<option> M </option>
										<option> S </option>
										<option> L </option>
									</select> </div>
						</div>
					<hr>
						<div class="row">
							<div class="col-md-3"> 수량 </div>
								<div class="col-md-9 row no-gutters"> <!-- no-gutters : 마진과 여백 없애기 초기값 0 -->
										
										<button class="btn btn-outline-secondary" onclick="pchange('p',<%=product.getP_stock()%>, <%=product.getP_price()%>);"> + </button>
										
											<div class="col-md-2">
												<input class="form-control" type="text" id="pcount" value="1" onchange="pchange('s',<%=product.getP_stock()%>, <%=product.getP_price()%>);">
											</div>
											
										<button class="btn btn-outline-secondary" onclick="pchange('m',<%=product.getP_stock()%>, <%=product.getP_price()%>);"> - </button>
								 </div>
						</div>
					<hr>
						<div class="row">
							<div class="col-md-3"> 총 상품 금액 </div>
							<div class="col-md-9 text-right">
								<span id="total"><%=product.getP_price() %> </span> 원
							 </div>
						</div>
					<hr>
						<div>
							<button class="form-control bg-success text-white" style="font-size: 1.5rem"> 구매하기 </button>
						</div>
					<div class="row my-3"> <!-- my : 마진[바깥여백] y[세로] -->
						<div class="col-md-6">
							<button class="form-control"> 장바구니 </button>
						</div>
						<div class="col-md-6">
						<%
							int m_num=0;
							if(login!=null){m_num=login.getM_num();}
							// 만약에 좋아요가 존재하면 
							if(ProductDao.getProductDao().plikecheck(p_num, m_num)) {
						%>
								<button class="form-control" id="btnplike" onclick="plike(<%=product.getP_num()%>, <%=m_num%>);">찜하기♥</button>
								<% } else { // 좋아요가 존재 하지 않으면 %> 
								<button class="form-control" id="btnplike" onclick="plike(<%=product.getP_num()%>, <%=m_num%>);">찜하기♡</button>
								<% } %>
						</div>
					</div>
				</div>
		</div>
	</div>
</body>
</html>