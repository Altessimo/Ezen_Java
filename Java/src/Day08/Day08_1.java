package Day08;

public class Day08_1 {
// 실행클래스 → main 메소드[스레드]
	// 상속 :
	 // 1. extends : 연장하다[설계도 연장]
		// public class 자식 클래스 명 extends 부모 클래스명{ }
	 // 2. super : 부모클래스 내 맴버 접근
		// 1. super() : 부모클래스 내 생성자 호출
		// 2. super.필드명/메소드명 : 부모 클래스 내 필드, 메소드 호출
	
	 // 3. @Override : 부모 클래스 내 메소드 재 정의
	
	// 4. final
	// final class CellPhone : 부모클래스로 사용불가
	// final void CellPhone : 오버라이딩 불가
	
	public static void main(String[] args) {
		// 서브 클래스 이용한 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("모델 : " + dmbCellPhone.model); // 부모 맴버 / private 변수가 아닐경우 맴버 접근 가능
		System.out.println("색상 : " + dmbCellPhone.color); // 부모 맴버
		
		System.out.println("채널 : " + dmbCellPhone.channel); // 본인 필드
		
		// 부모메소드
		dmbCellPhone.powerOn(); // 부모 메소드 접근
		dmbCellPhone.bell(); // 부모 메소드 접근
		dmbCellPhone.sendVoice("안녕하세요"); // 부모메소드
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동 인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		
		// 본인 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
