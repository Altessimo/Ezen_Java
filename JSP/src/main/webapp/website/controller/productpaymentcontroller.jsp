<%@page import="Dao.PorderDao"%>
<%@page import="Dto.Porder"%>
<%@page import="Dto.Login"%>
<%@page import="Dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// ajax를 이용한 매개변수 요청
	String order_name = request.getParameter("order_name"); // main.js에 있는 order_name을 불러옴
	String order_phone =request.getParameter("order_phone");
	String order_address =request.getParameter("order_address");
	int order_pay =Integer.parseInt(request.getParameter("order_pay"));
	String order_payment =request.getParameter("order_payment");
	int delivery_pay =Integer.parseInt(request.getParameter("delivery_pay"));
	String order_contents =request.getParameter("order_contents");
	
	Login login = (Login)session.getAttribute("login"); // 로그인 세션 호출
	
	// 객체화
	Porder porder = new Porder(login.getM_num(), order_name, order_phone, order_address,
			order_pay, order_payment, delivery_pay, order_contents);
	
	// 카트 세션 호출
	String sname="cart"+login.getM_id(); // 장바구니 세션 이름[이름 : cart+아이디 값 : cart 리스트]
	ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);
	
	// DB 저장
	boolean result = PorderDao.getPorderDao().orderwrite(porder, carts);
	if(result) {
		out.print("1"); session.setAttribute(sname, null); // 장바구니 초기화
	} else out.print("0");
	
/*
	순서[1. 주문 DB 등록한다 → 2. 주문 상품 수 만큼 주문 상세 등록]
		1. 주문등록
			1. 회원번호 : m_num : 세션
			2. 수령자 : order_name
			3. 수령자 연락처 : order_phone
			4. 수령자 주소 : order_address
			5. 주문 총 금액 : order_pay
			6. 결제수단 : order_payment
			7. 배송비 : delivery_pay
			9. 배송 요청 사항 : 
				
		2. 주문 상세[먼저 주문 등록 된다는 가정] : 반복문
			1. 주문 번호 : order_num : DB
			2. 상품 번호 : p_num : 카트 세션
			3. 구매 수량 : p_count : 카트 세션
			4. 배송상태 : delivery_state : 임의값[1]
		3. 재고 감소[제품 업데이트]
		4. 카트세션 초기화
*/

%>