package Day06;

import java.util.Scanner;

public class Q20_Main {
private static Q20_1[] qArray = new Q20_1[100];
private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----");
			System.out.println("선택> ");
			
			int selectNo=scanner.nextInt();
			
			if(selectNo==1) {createAccount();}
			else if(selectNo==2) {accountList();}
			else if(selectNo==3) {deposit();}
			else if(selectNo==4) {withdraw();}
			else if(selectNo==5) {run=false;}
		}
	}
	System.out.println("프로그램 종료");
}
private static void createAccount() {
	System.out.println("------");
	System.out.println("계좌생성");
	System.out.println("------");
	
	// 1. 입력받기
	System.out.println(">> 계좌번호 : "); String ano = scanner.next();
	System.out.println(">> 계좌주 : "); String owner = scanner.next();
	System.out.print(">> 초기입금액 : ");int balance = scanner.nextInt();
	
	// 2. 객체 생성 [ 입력받은 변수값을 객체 생성자에 넣어서 객체 만들기 ] 
	Account account = new Account(ano, owner, balance);
	
	// 3. 배열저장 [ 배열내 빈공간[null] 을 찾아서 빈공간 인덱스에 객체 저장 ] 
	for( int i = 0 ; i<accountArray.length ; i++ ) {
		if( accountArray[i] == null ) { // i번째 인덱스가 비어 있으면 
			accountArray[i] = account; // i번째 인덱스의 객체 넣기 
			System.out.println("결과 : 계좌가 생성되었습니다. ");
			break; // 계좌생성시 반복문 종료 
		}
	}
}	
// 계좌목록보기 [ 인수x 반환x ] 
private static void accountList() {
	System.out.println("--------------");
	System.out.println("계좌목록");
	System.out.println("--------------");
	
	// 1. 배열내 모든 인덱스를 호출 [ 공백 제외 ]
	for( int i = 0 ; i<accountArray.length ; i++ ) {
		if( accountArray[i]==null ) break;
		
		System.out.println( accountArray[i].getAno() + "\t" 
				+ accountArray[i].getOwner() +"\t"
				+ accountArray[i].getBalance() );
	}	
}
// Account 배열에서 ano와 동일한 Account객체찾기 메소드 [ 인수o( String ano ) 반환o ( Account 객체 ) ] 
private static Account findAccount( String ano ) {
	Account account = null; // 임시객체
	for( int i = 0 ; i<accountArray.length ; i++ ) {
		if( accountArray[i] != null ) { // i번째 인덱스가 공백이 아니면서 
			 
			if( accountArray[i].getAno().equals(ano) ) {
				// i번째 인덱스의 객체내 계좌번호가 인수[입력받은 계좌번호]와 같으면 
				account = accountArray[i]; // 찾은 객체를 임시객체에 저장
				break;
			}
		}
	}
	return account; // 만약에 동일한 계좌번호 있으면 객체[찾은객체] 반환 
					// 동일한 계좌번호가 없으면 객체[null] 반환
}
// 예금하기  [ 인수x 반환x ] 
private static void deposit() { 
	System.out.println("--------------");
	System.out.println("예금");
	System.out.println("--------------");
	// 1. 입력받기 
	System.out.println(">>> 계좌번호 : ");	String ano = scanner.next();
	System.out.println(">>> 예금액 : ");	 	int balance = scanner.nextInt();
	// 2. 입력받은 계좌번호 존재하는지 체크하는 메소드 호출 
	Account account = findAccount(ano); // findAccount 반환 : 찾은 객체 혹은 null 
	// 3. 
	if( account == null ) { // 반환이 null 일경우 
		System.out.println("결과 : 계좌가 존재하지 않습니다. ");
		return; // 현재 메소드 강제 종료 
	}
	// 4.  // 기존예금액  + 입력받은 입금액 
	account.setBalance(  account.getBalance() + balance ) ;	
		// account.balance = account.getBalance() + balance ; // private 필드 에서는 불가 
		// set메소드 : 필드에 값 대입 메소드  // get메소드 : 필드의 값 호출 메소드 
	System.out.println("결과 : 예금이 성공되었습니다. ");
}
// 출금하기 [ 인수x 반환x ] 
private static void withdraw() {
	// 1. 입력받기 
	System.out.println("--------------");
	System.out.println("출금");
	System.out.println("--------------");
	
	System.out.println(">>> 계좌번호 : ");	String ano = scanner.next();
	System.out.println(">>> 출금액 : ");	 	int balance = scanner.nextInt();
	
	// 2. 입력받은 계좌번호 존재하는지 체크하는 메소드 호출 
	Account account = findAccount( ano );
	// 3.
	if( account == null ) { System.out.println("결과 : 계좌가 존재하지 않습니다. "); return; }
	if( account.getBalance() < balance  ) {
		// 출금액이 기존예금액 보다 크면 출금불가 
		System.out.println("예금액보다 많은 금액을 출금할 수 없습니다. "); return; 
	}		
	// 4.  기존예금액 - 출금액  
	account.setBalance( account.getBalance() - balance );
	System.out.println("결과 : 출금이 성공되었습니다. ");	
}
}
