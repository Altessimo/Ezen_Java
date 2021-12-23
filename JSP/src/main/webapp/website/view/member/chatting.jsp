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
	<div class="row my-3" id="startdiv">
		<button class="form-control col-md-3" onclick="start('<%=loginid%>', 1)">채팅방1</button>
		<button class="form-control col-md-3" onclick="start('<%=loginid%>', 2)">채팅방2</button>
		<button class="form-control col-md-3" onclick="start('<%=loginid%>', 3)">채팅방3</button>
		<button class="form-control col-md-3" onclick="start('<%=loginid%>', 4)">채팅방4</button>
	</div>
	<div class="row my-3">
		<input type="hidden" id="roomnum"><!-- 선택된 방번호 숨기기 -->
		<button class="form-control col-md-4 offset-4" id="btnexit" onclick="exit();">채팅방 나가기</button>
	</div>
	<!-- 채팅방 만들기 -->
		<div class="row" style="display:none;" id="chattingdiv">
			
			<div class="col-md-6 offset-2">
				<div id="msgbox">	<!-- 채팅창 -->
					<!-- 채팅 메시지가 추가 되는 위치 -->
				</div>
				<div class="row no-gutters"> <!--채팅입력 창, 전송버튼 -->
					<div class="col-md-2">
						<input id="toid" class="form-control" type="text" placeholder="공개">
					</div>
					<div class="col-md-8"><!-- 채팅입력 창 -->
						<input id="msginput" class="form-control" type="text" placeholder="내용 입력">
					</div>
					<div class="col-md-2">	<!-- 전송버튼 -->
						<button class="form-control" onclick="send();">전송</button>
				</div>
			</div>
		</div>
	<!-- 	<div class="col-md-2">
			<div id="mlist">
			</div> 
		</div> -->
	</div>
</div>

<script type="text/javascript">
	/* 전역변수들 : 모든 function에서 사용되는 변수들
		로그인 된 아이디, 메시지 창, 웹 소켓
		2. 현재 회원 아이디 가져오기 // value 속성이 있는 태그만 가능 // 3. 채팅창 가져오기*/
	var loginid = null; var msgbox = null; var webSocket=null; // 초기값 null
	
	var roomnum = 0; // 방 번호
	function start(id, num) { // 채팅방 접속 버튼을 눌렀을때[인수는 로그인 아이디, 채팅창 번호]
		if(id=="null") { // 로그인이 안되어 있을때
			alert("로그인 해 주세요."); return; // 접속 불가
		} else { // 로그인 시
			document.getElementById("chattingdiv").style="display: block"; // 채팅창 보이기
			document.getElementById("startdiv").style="display: none"; // 채팅창 목록 숨기기
			document.getElementById("btnexit").style="display: block"; // 채팅방 나가기 버튼 보이기
			loginid=id; // 로그인 된 아이디 넣어주기
			msgbox = document.getElementById("msgbox"); // 채팅 창 가져오기
			msgbox.innerHTML += "<div class='text-center roomstart'>"+num+"번째 방에 입장하셨습니다.</div>"; // 채팅방 입장 내용을 채팅창에 추가
			roomnum=num; // 방번호 인수를 방번호 변수에 저장
			ocument.getElementById("chattingdiv").value=num; // 방 번호 저장
			// 4. 접속객체 [웹 소켓 메모리 할당[서버소켓과 연결]]
				// var webSocket = new webSocket("ws://웹ip:http port번호/프로젝트명 경로");
			webSocket = new WebSocket("ws://localhost:8085/Ezen_Jsp/chatting/"+roomnum); // 접속(Dto→chatting)
			 	// 접속 객체										// @ServerEndpoint 이동
			 
			 // 5. 웹 소켓 이벤트[인수에 현재 세션 정보]
			 webSocket.onopen = function(event) {onOpen(event)}; // 웹 소켓 실행시 메소드
			 webSocket.onclose = function(event) {onClose(event)}; // 웹 소켓 종료시 메소드
			 webSocket.onmessage = function(event) {onMessage(event)}; // 웹 소켓 메시지 전송 메소드
			 webSocket.onerror = function(event) {onError(event)}; // 웹 소켓 오류 메소드
		}
	}
	
	function exit() { // 방 나가기[1. 채팅방 숨기기, 2. 채팅방 초기화 3. 소켓닫기 4. 채팅방 목록]
		document.getElementById("chattingdiv").style="display: none"; //1. 채팅창 숨기기
		document.getElementById("chattingdiv").innerHTML=""; //2. 채팅창 내용 초기화
		document.getElementById("startdiv").style="display: block"; // 3. 채팅방 목록
		document.getElementById("btnexit").style="display: block"; // 4. 나가기 버튼 숨기기
		webSocket.close(); // 5. .close=소켓을 닫는다
	}
	
	 // 6. 이벤트 메소드 정의
	 function onOpen(event) {alert("접속 되었습니다");}
	 function onClose(event) {alert("퇴장하셨습니다.");}
	 function onError(event) {alert("[에러 사유] "+event.data+" 관리자에게 문의 해주세요.");}
	 
	 // 8. 받는 메소드
	 function onMessage(event) {
		 // 받은 메시지에서 방번호를 제외한 나머지를 분리
		 var from = event.data.split(",")[1]; // , 기준으로 문자열 분리해서 1번째 문자열
		 var to = event.data.split(",")[2]; // , 기분으로 문자열 분리해서 2번째 문자열
		 var time = event.data.split(",")[3]; // , 기준으로 문자열 분리해서 3번째 문자열
		 var msg = event.data.split(",")[4]; // , 기분으로 문자열 분리해서 4번째 문자열
		 
		 // 현재 로그인 된 아이디와 to와 동일할 경우[메시지 받음] // 귓속말
		 if(to==loginid) { // 특정 id만 받기 // 로그인 된 사람만 받기
			 msgbox.innerHTML += "<div class='profile mx-2 my-2'>"+from+"</div>"
			 msgbox.innerHTML +=
				 "<div class='d-flex justify-content-start mx-2 my-2'><span class='to mx-1'>"+msg+"</span><span class='msgtime d-flex align-items-end'>"+time+"</span></div>";
			msgbox.scrollTop=msgbox.scrollHeight; // 현 스크롤 위쪽 위치 = 스크롤 전체 높이[바닥]
		 } else if(to=="all"){ // 모든메시지[모든 사람이 받는 메시지] // 공개형 채팅
			 msgbox.innerHTML += "<div class='profile mx-2 my-2'>"+from+"</div>"
			 msgbox.innerHTML +=
				 "<div class='d-flex justify-content-start mx-2 my-2'><span class='to mx-1'>"+msg+"</span><span class='msgtime d-flex align-items-end'>"+time+"</span></div>";
			msgbox.scrollTop=msgbox.scrollHeight; // 현 스크롤 위쪽 위치 = 스크롤 전체 높이[바닥]
		 }
	}
	 
	 // 7. 보내는 메소드
	 function send() {
		// 1. 입력창에 입력된 데이터를 가져온다
		var msginput = document.getElementById("msginput").value;
		 if(msginput==""){return;} // 입력이 없을떄 유효성 검사 {전송막기}
		let today = new Date(); // js에서 현재 날짜/시간 객체
		var time = today.toLocaleTimeString(); // 시간만 가져오기
		 // 받는 사람
		 var toid = document.getElementById("toid").value;
		 if(toid=="") { // 귓속말 대상이 없으면
			 toid=="all"; // 모두에게 보내기
		 }
		 
		 roomnum=document.getElementById("chattingdiv").value;
		// msg = 방 번호, 보내는 사람 id, 받는 사람, 보낸시간, 메시지 내용
		var msg = roomnum+","+loginid+","+toid+","+time+","+msginput; // 누가 보냈고 언제 보냈는지 시간도 메시지에 포함하기

		// 입력 된 문자와 날짜를 채팅방 div에 추가
		msgbox.innerHTML +=
			"<div class='d-flex justify-content-end mx-2 my-2'><span class='msgtime d-flex align-items-end'>"+time+"</span><span class='from mx-1'>"+msginput+"</span></div>";
		 
		 webSocket.send(msg); // 서버로 부터 메시지 전송
		 // 입력상자 초기화
		 document.getElementById("msginput").value=""; // 전송 후 입력창 내용을 지우기[초기화]
		 // 스크롤 있을 경우 스크롤 위치를 가장 아래로 이동
		 msgbox.scrollTop=msgbox.scrollHeight; // 현 스크롤 위쪽 위치 = 스크롤 전체 높이[바닥]
		 
		 
		 }
</script>
</body>
</html>