package Day09;

public class Day09_3 {
// 인터페이스 : 객체의 사용방법을 정의하는 타입
	// 목적 : 클래스들이 구현해야 하는 동작을 지정하는데 사용되는 추상자료
	// 추상 : 
	// Ex) 오락기
		// 안터페이스[버튼] = 이동버튼, 공격버튼, 방어버튼
		// 클래스[게임들] = 비행게임, 사냥게임, RPG게임
			// 동일한 목적하의 서로다른 클래스들의 조작
// implements : 구현하다
	// 추상메소드 : 선언만 있는 메소드 => 연결된 클래스내에서 구현 
	// 추상메소드 구현
	// 인터페이스는 객체
// 인터페이스 사용
	// 1. 인터페이스 인터페이스명 = new 클래스()
		// 인터페이스 = (클래스) 객체
	// 2. 익명 구현 객체
		// 인터페이스 명 = new 인터페이스명() {
		// 		추상메소드 오버라이딩
		// };
	// extends : 다중 X[상속은 한번만 가능]
	// implements : 다중 O[구현은 여러번 가능]
	
// P.347 ~ 354
	public static void main(String[] args) {
		// 1. 인터페이스 설계 : RemoteControl
		// 2. 클래스 설계 : Television implements RemoteContro
		// 3. 클래스 설계 : Audio implements RemoteControl
		
// 1. 리모컨 생성[메모리 할당 X]
		RemoteControl rc;
		
// 2. 리모컨에 텔리비젼 클래스 연결
		rc = new Television(); // 해당 리모컨은 텔레비젼으로 설정
		// 텔레비젼 리모컨 사용
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
// 3. 텔레비젼 리모컨을 오디오 리모컨으로 변경
		System.out.println("-- 리모컨을 오디오 전용으로 변경합니다!");
		rc = new Audio();
		// 오디오 리모컨 사용
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(15);
		
		// P. 360
		rc.setMute(true); // 디폴트 메소드 재 정의
		
		// P. 362
		RemoteControl.changeBattery(); // 정적 메소드는 객체 없이 사용
		
// P. 354 익명 구현 객체 사용 이유 : 일회성 코드
		RemoteControl rc2 = new RemoteControl() {
			
			@Override
			public void turnOn() { }
			@Override
			public void turnOff() { }
			@Override
			public void setVolume(int volume) { }
		};
	}
}