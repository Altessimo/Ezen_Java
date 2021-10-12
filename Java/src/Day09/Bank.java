package Day09;
// 2.

public class Bank implements ATM {
// 슈퍼 클래스로 사용 예정
	
	String 은행코드 ="02";
			
	// 1. 필드
	String 계좌번호;
	int 예금액;
	
	@Override
	public void 계좌등록() {
		System.out.println("----- 계좌 등록 합니다 -----");
	}
	@Override
	public void 예금() {
		System.out.println("----- 계좌 예금 합니다 -----");
	}
	@Override
	public void 출금() {
		System.out.println("----- 계좌 출금 합니다 -----");
	}
	@Override
	public void 잔고() {
		System.out.println("----- 계좌 잔고 확인 합니다 -----");
	}
	
	// 2. 생성자
	
	
	// 3. 메소드
	
}
