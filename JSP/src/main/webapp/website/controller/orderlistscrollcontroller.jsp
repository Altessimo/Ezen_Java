<%@page import="Dao.ProductDao"%>
<%@page import="Dto.Product"%>
<%@page import="Dto.Porderdetail"%>
<%@page import="Dao.PorderDao"%>
<%@page import="Dto.Porder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% int item = Integer.parseInt(request.getParameter("item")); // ajax 변수 요청 %>
<% Login login = (Login)session.getAttribute("login"); // 로그인 된 회원 정보 %>

	<% ArrayList<Porder> porders = PorderDao.getPorderDao().getPorderslist(login.getM_num()); // 1. 주문자의 주문 목록 %>
							<% for (int i=item; i<item+1; i++) { %>
							
								<div class="row mt-5">
									<div class="col-md-4 border rounded p-3 d-flex align-items-center flex-wrop"> <!-- 주문 정보 -->
										<p class="pview"> 주문번호 : <%=porders.get(i).getOrder_num() %></p>
										<p> 주문일 : <%=porders.get(i).getOrder_date() %></p>
										<button class="form-control"> 주문상세 </button>
									</div>
									
									<div class="col-md-8"> <!-- 주문 상세 -->
									<% ArrayList<Porderdetail> porderdetails =
										PorderDao.getPorderDao().getPordersdetail(porders.get(i).getOrder_num()); // 2. 주문 목톡 통해 주문 상세 %>
									<% for (int j=0; j<porders.size(); j++) { %>
									<% Product product = ProductDao.getProductDao().getproduct(porderdetails.get(j).getP_num()); // 3. 주문 상세 통해 제품 정보 %>
									
									<p> 제품 내역 </p><HR>
										<div class="row">
											<div class="col-md-3 d-flex align-items-center">
											<!-- d-flex align-items-center : 아이템들을 세로로 배치하여 가운데 정렬 -->
												<img alt="" src="../../upload/<%= product.getP_img()%>" style="max-width: 100%">
											</div>
											<div class="col-md-9 row">
												<div class="col-md-8">
													<p class="pview"> 상품명 : <%=product.getP_size() %></P>
													<P> 옵션 : <%=product.getP_size() %></p>
													<p> 수량 : <%=porderdetails.get(j).getP_count() %></p>
													<p> 배송상태 : <%=porderdetails.get(j).getDelivery_state() %></p>
												</div>
												<div class="col-md-2">
													<button class="btn btn-outline-danger my-3"> 배송 조회 </button>
													<button class="btn btn-outline-danger my-3"> 주문 변경 </button>
												</div>
											</div>
										</div>
										<% } %>
									</div>
								</div>
								<% } %>