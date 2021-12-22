package Dto;

import java.io.IOException;
import java.util.Vector;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chatting") // 1. 서버소켓[종착점] (경로생성)
public class Chatting {
	/* 접속된 세션을 저장하는 리스트[동기화 ArrayList vs Vector(동기화)] */
	private static Vector<Session> clients=new Vector<Session>();
	
	// 2. 클라이언트가 서버로부터 접속 요청
	@OnOpen // 소켓 접속하는 어노테이션
	public void onOpen(Session session) {
		clients.add(session); // 리스트에 추가
		// System.out.print(session.getId()); // 세션번호 확인
		// //System.out.print("현재 접속한 세션들 : " + clients); // 현재 접속된 세션들
	}
	
	// 3. 클라이언트가 서버로부터 접속 해지
	@OnClose // 소켓 담는 어노테이션
	public void onClose(Session session) {
		clients.remove(session); // 리스트에 제거
	}
	
	// 4. 서버가 클라이언트로부터 메시지 받는 메소드
	@OnMessage // 메시지 받는 어노테이션
	public void onMessage(String msg, Session session) throws IOException {
		// 인수 : 메시지, 보낸 세션(회원)
		for(Session client:clients) {
			// 모든 리스트에 저장된[잡속된] 메시지 보내기
			if(!client.equals(session)) {
				client.getBasicRemote().sendText(msg);
			}
		}
	}
	
	/*
	 * import javax.websocket.OnError;
	 * // 5. 서버가 클라이언트로부터 오류
	 * @OnError // 클라이언트 오류 어노테이션
	 * public void onError(Session session) { }
	 */
}