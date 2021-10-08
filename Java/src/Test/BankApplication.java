package Test;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	// private : 현재 클래스 호출, static : 프로그램 수명유지
	// main 밖 호출 : 모든 메소드에서 호출 가능
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			if(selectNo==1) { createAccount();}
			else if(selectNo==2) {accountList();}
			else if(selectNo==3) {deposit();}
			else if(selectNo==4) {withdraw();}
			else if(selectNo==5) {run=false;}
		}
		System.out.println("프로그램 종료");
	}
	// 메소드 선언
	// 계좌생성하기
	public static void createAccount() {
		System.out.println("-----");
		System.out.println("계좌생성");
		System.out.println("-----");
		
		// 1. 입력받기
		System.out.println(">>> 계좌번호 : "); String ano = scanner.next();
		System.out.println(">>> 계좌주 : "); String owner = scanner.next();
		System.out.println(">>> 초기입금액 : "); int balance = scanner.nextInt();
		
		// 2. 객체생성
		Account account = new Account(ano, owner, balance);
		
		// 3. 배열저장
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) { // i번쨰 인덱스가 비어있으면
				accountArray[i] = account; // i번째 인덱스의 객체넣기
				System.out.println("결과 : 계좌가 생성되었습니다");
				break;
			}
		}
	}
	
	// 계좌목록보기
	public static void accountList() {
		System.out.println("-----");
		System.out.println("계좌목록");
		System.out.println("-----");
	}
	
	// Account 배열에서 ano와 동일한 Avvount 객체찾기
		public static Account findAccount(String ano) {
			
		}
		
	// 예금하기
	public static void deposit() {
		
	}
	// 출금하기
	public static void withdraw() {
		
	}
}
