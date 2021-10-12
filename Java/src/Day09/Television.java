package Day09;

public class Television implements RemoteControl {
	// extends : 설계도 연장
	// implements : (추상메소드를 구현, 정의 하라) 구현하다
	// 클래스 : 서로다른 클래스의 정의는 다름.
	
	// 1. 필드
	private int volume;
	
	// 2. 생성자
	// 3. 메소드
		// 연결된 인터페이스의 추상 메소드 정의하기
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	// Ctrl + 스페이스바 : 구현할 추상 메소드 목록
	@Override // 생략가능
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			// 현재 소음이 최대 소음보다 커지면
			this.volume = RemoteControl.MAX_VOLUME; 
			// 최대 소음으로 대입하기[현재 소음은 최대 소음보다 커질수가 없음]
		} else if(volume<RemoteControl.MIN_VOULUME) {
			// 현재소음이 최소소음[0]보다 작으면
			this.volume = RemoteControl.MIN_VOULUME;
			// 최소소음으로 대입하기[현재소음은 음수가 될 수 없음]
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Tv 볼륨 : "+ volume);
	}
}
