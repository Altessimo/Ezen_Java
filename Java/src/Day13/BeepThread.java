package Day13;

import java.awt.Toolkit;

public class BeepThread extends Thread {
// extends : 상속
	
	// 스레드 이름 설정
	public BeepThread() {
		setName("스레드 A");
	}
	
	@Override
	public void run() { // 멀티 스레드 시작 메소드
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) { // 
		toolkit.beep(); // 비프음 소리 메소드
		
		// 무조건 예외처리
		try { BeepThread.sleep(1000); } // 1초 일시정지[Thread.sleep(밀리초[1000/1초])]
		catch (InterruptedException e) { } 
		}
	}
}
