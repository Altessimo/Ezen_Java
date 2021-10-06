package Day06;

import java.util.Scanner;

public class BankApplication {
	// 접근 제한자
			// public : 프로젝트 내 모든 곳에서 호출 가능
			// private : 전체파일내에서만 호출가능
			// dafult(생략) : 동일한 패키지 내에서만 호출가능
			// protected : 동일한 패키지 내에서만 호출가능
	
// 100개 계좌객체를 저장 할 수 있는 배열 선언
	// main메소드 객체 선언시 : main 메소드 외 모든 메소드에서 호출 가능
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	// private : 현재 클래스 내에서만 호출 가능
	// static : 정적변수 : 프로그램 전반에 걸쳐 수명 유지
		// main 메소드와 같이 프로그램 시작시 메모리 할당
		// 모든 메소드에 사용되는 필드에 선언
		// ←=→  지역변수 : 선언된 {  } 안에서만 사용 → {} 밖으로 나가면 초기화

	public static void main(String[] args) {
		// static 없는 배열 호출
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) { createAccount(); }
			else if(selectNo==2) {accountList();}
			else if(selectNo==3) {deposit();}
			else if(selectNo==4) {withdraw();}
			else if(selectNo==5) {run=false;}
		}
		System.out.println("프로그램 종료");
	}
	// 메소드 선언
	// 접근제한자 키워드, 반환타입, 메소드명(매개변수, 배개변수2 ~) (실행코드 ; return}
	
	// 계좌생성하기[인수, 반환 X]
		// static 사용이유 : main에서 호출하기 위해[미사용시 : main 해당 메소드 사용불가]
	private static void createAccount() {
		// 1. 입력받은 정보를 변수에 저장
		System.out.println("---------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("---------------------------------------------");
		
		// 1. 입력받기 → 변수에 저장
		System.out.println(">> 계좌번호 : "); String ano = scanner.next();
		System.out.println(">> 계좌주 : "); String owner = scanner.next();
		System.out.println(">> 초기입금액 : "); int alance = scanner.nextInt();
		
		// 2. 객체생성[입력받은 변수 값을 객체 생성자에 넣어서 객체 만들
		Account account = new Account(ano, owner, alance);
		
		// 3. 배열저장[배열 내 빈공간(null)을 찾아서 빈공간 인덱스에 객체 저장
		for(int i=0; i<accountArray.length; i++) { // i번째 인덱스가 비어 있으면
			if(accountArray[i] == null) { // i번째 인덱스의 객체 넣기
				accountArray[i] = account;
				System.out.println("결과 : 계좌가 생성 되었습니다.");
				break; // 계정 생성시 반복문 종료
			}
		}
	}
	
	// 계좌목록보기[인수, 반환 X]
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		// 1. 배열 내 모든 인덱스를 호출(공백제외)
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) break;
			
			System.out.println(accountArray[i].getAno() + "\t"
			+ accountArray[i].getOwner() +"\t"
			+ accountArray[i].getBalance());
		}
	}
	// Account 배열에서 ano와 동일한 Account 객체찾기[[인수(String ano), 반환(Account 객체) O]
			// 예금하기
			private static Account findAccount(String ano) {
				Account account = null; // 임시객체
				
				for(int i=0; i<accountArray.length; i++) {
					if(accountArray[i] != null) {
					if(accountArray[i].getAno().equals(ano)) {
						// i번째 인덱스의 객체 내 계좌번호가 인수[입력받은 계좌번호] 와 같으면
						account = accountArray[i]; // 찾은 객체를 임시객체에 저장
						break;
					}
				}
			}
			return account; // 만약에 동일한 계좌번호 있으면 객체(찾은객체) 반환
			// 동일한 계좌번호가 없으면 객체(null) 반환
		}
	
	// 예금하기[인수, 반환 X]
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		//1. 입력받기
		System.out.println(">> 계좌번호 : "); String ano = scanner.next();
		System.out.println(">> 초기입금액 : "); int balance = scanner.nextInt();
		
		// 2. 입력받은 계좌번호 존재하는지 체크하는 메소드 호출
		Account account = findAccount(ano); // findAccount 반환 : 찾은 객체 혹은 null
		
		// 3.
		if(account == null) { // 반환이 null 일 경우
			System.out.println("결과 : 계좌가 존재하지 않습니다.");
			return; // 현재 메소드 강제 종료
		}
		// 4. // 기존 예금액 + 입력받은 입금액
		account.setBalance(account.getBalance()+balance));
		// 기존예금액 + 입력받은 입금액
		// set 메소드 : 필드에 값 대입 메소드
		// get 메소드 : 필드에 값 호출 메소드
		System.out.println("결과 : 예금이 성공 되었습니다.");
	}
	
	// 출금하기[인수x 반환x]
	private static void withdraw() {
		// 1. 입력받기
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		System.out.println(">> 계좌번호 : "); String ano = scanner.next();
		System.out.println(">> 출금액 : "); int balance = scanner.nextInt();
		
		// 2. 입력받은 계좌번호 존재하는지 체크하는 메소드 호출
		Account account = findAccount(ano); // ano=인수
		
		//3. 
		if(account == null) { System.out.println("결과 : 계좌가 존재하지 않습니다."); return; }
		if(account.getBalance() < balance) {
			// 출금액이 기존 예금액 보다 크면 출금 불가
			System.out.println("예금액보다 많은 금액을 출금 할 수 없습니다."); return;
		}
		// 4. 
		account.setBalance(account.getBalance() - balance);
		System.out.println("결과 : 출금이 성공되었습니다.");
	}
}
