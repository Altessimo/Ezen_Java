package Day09;

public class Bank2 implements ATM {

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
}
