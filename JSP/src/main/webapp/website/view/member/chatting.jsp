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

<h3 class="text-center"> 실시간 채팅 </h3>
<div class="container">
	<div class="row">
	
		<div class="col-md-6">
			<div id="msgbox"> <!-- 채팅창 -->
				<!-- 채팅 메시지가 추가되는 위치 -->
				
				
				
			</div>
			<div class="row no-gutters"> <!-- 체팅입력 창, 전송 버튼  -->
				<div class="col-md-10"> <!-- 채팅 입력 창 -->
					<input id="msginput" class="form-control" type="text" placeholder="내용 입력" onkeyup="entersend();">
				</div>
				<div class="col-md-2"> <!-- 전송버튼 -->
					<button class="form-control" onclick="btnsend();">전송</button>
				</div>
			</div>
		</div>
		<div class="col-md-6">
			보내는 사람 : <input id="loginid" class="form-control" type="text" value="<%=loginid%>">
			받는 사람 : <input class="form-control" type="text" value="all">
			접속 회원 목록
			<div id="mlist">
				
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	// 2. 현재 회원 아이디 가져오기
	var loginid = document.getElementById("loginid").value; // value 속성이 있는 태그만 가능
	// 3. 채팅창 가져오기
	var msgbox = document.getElementById("msgbox");
	// 4. 웹 소켓
		// var webSocket = new webSocket("ws://웹ip:http port번호/프로젝트명 경로");
	 var webSocket = new WebSocket("ws://localhost:8085/Ezen_Jsp/chatting"); // 접속(Dto→chatting)
	 	// 접속 객체										// @ServerEndpoint 이동
	 
	 // 5. 웹 소켓 이벤트[인수에 현재 세션 정보]
	 webSocket.onopen = function(event) {onOpen(event)}; // 웹 소켓 실행시 메소드
	 webSocket.onclose = function(event) {onClose(event)}; // 웹 소켓 종료시 메소드
	 webSocket.onmessage = function(event) {onMessage(event)}; // 웹 소켓 메시지 전송 메소드
	 webSocket.onerror = function(event) {onError(event)}; // 웹 소켓 오류 메소드
	 // 6. 이벤트 메소드 정의
	 function onOpen(event) {alert("접속 되었습니다");}
	 function onClose(event) {alert("퇴장하셨습니다.");}
	 function onError(event) {alert("에러 사유 : "+event.data+" 관리자에게 문의 해주세요.");}
	 
	 // 7. btn 보내는 메소드
	 function btnsend() {
		// 1. 입력창에 입력된 데이터를 가져온다
		var msginput = document.getElementById("msginput").value;
		
		 // 입력이 없을떄 유효성 검사 {전송막기}
		 if(msginput==""){return;}
		// 날짜
		 let today = new Date(); // js에서 현재 날짜/시간 객체
		 var time = today.toLocaleTimeString(); // 시간만 가져오기
		
		// 언제 보냈는지 시간도 메시지에 포함하기
		var msg = loginid+","+time+","+msginput;
		 // 입력 된 문자와 날짜를 채팅방 div에 추가
		msgbox.innerHTML +=
			"<div class='d-flex justify-content-end mx-2 my-2'><span class='msgtime d-flex align-items-end'>"+time+"</span><span class='from mx-1'>"+msginput+"</span></div>";
		 
		 webSocket.send(msg); // 서버로 부터 메시지 전송
		 // 입력상자 초기화
		 document.getElementById("msginput").value=""; // 전송 후 입력창 내용을 지우기[초기화]
		 
		 // 스크롤 있을 경우 스크롤 위치를 가장 아래로 이동
		 msgbox.scrollTop=msgbox.scrollHeight; // 현 스크롤 위쪽 위치 = 스크롤 전체 높이[바닥]
		
		}
	 
	// 7. 보내는 메소드
	 function entersend() {
		 // 엔터를 눌렀을떄
		 if(window.event.keyCode==13){ // ★ https://blog.lael.be/post/75 윈도우 이벤트 키코드 중에 13번이 엔터
	
			 
		// 1. 입력창에 입력된 데이터를 가져온다
		var msginput = document.getElementById("msginput").value;
		// 날짜
		 let today = new Date(); // js에서 현재 날짜/시간 객체
		 var time = today.toLocaleTimeString(); // 시간만 가져오기
		// 언제 보냈는지 시간도 메시지에 포함하기
		var msg = loginid+","+time+","+msginput;
		// 입력이 없을떄 유효성 검사 {전송막기}
		 if(msginput==""){return;}
		 
		
		 // 입력 된 문자와 날짜를 채팅방 div에 추가
		msgbox.innerHTML +=
			"<div class='d-flex justify-content-end mx-2 my-2'><span class='msgtime d-flex align-items-end'>"+time+"</span><span class='from mx-1'>"+msginput+"</span></div>";
		 webSocket.send(msg); // 서버로 부터 메시지 전송
		 // 입력상자 초기화
		 document.getElementById("msginput").value=""; // 전송 후 입력창 내용을 지우기[초기화]
		 
		 // 스크롤 있을 경우 스크롤 위치를 가장 아래로 이동
		 msgbox.scrollTop=msgbox.scrollHeight; // 현 스크롤 위쪽 위치 = 스크롤 전체 높이[바닥]
		 }
		}
	 
	 // 8. 받는 메소드
	 function onMessage(event) {
		 var msg = event.data.split(",")[2]; // , 기분으로 문자열 분리해서 1번째 문자열
		 var from = event.data.split(",")[0]; // , 기준으로 문자열 분리해서 2번째 문자열
		 var time = event.data.split(",")[1]; // , 기준으로 문자열 분리해서 3번째 문자열
		 msgbox.innerHTML += "<div class='profile'>보낸사람 : "+from+"</div>"
		 msgbox.innerHTML +=
			 "<div class='d-flex justify-content-start mx-2 my-2'><span class='to mx-1'>"+msg+"</span><span class='msgtime d-flex align-items-end'>"+time+"</span></div>";
		msgbox.scrollTop=msgbox.scrollHeight; // 현 스크롤 위쪽 위치 = 스크롤 전체 높이[바닥]
	}
		
	
</script>
</body>
</html>