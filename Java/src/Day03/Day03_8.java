package Day03;

import java.util.Scanner;

public class Day03_8 {
// 확인문제7 : Atm 프로그램
	public static void main(String[] args) {
		// 종료버튼 누르기 전까지 무한실행 프로그램 → while(true)
		boolean 실행 = true; // 무한루프 제어하는 변수
		int 예금액 = 0; //예금액
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		while(실행) { // [실행 true 무한루프 실행 // 실행변수가 false이면 무한루프 종료]
			System.out.println("          ATM             ");
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택 > "); int 선택 = scanner.nextInt();
			
			if(선택 == 1) {
			System.out.println("예금액>"); 예금액 += scanner.nextInt();
			System.out.println("[알림] 입금완료");
			}
			else if(선택 == 2) {
			System.out.println("출금액>"); int 출금액 = scanner.nextInt();
			
			if(예금액 < 출금액) {System.out.println("[알림] 잔고가 부족합니다");}
			else{예금액-=출금액; System.out.println("[알림] 출금완료");}
			}
			else if(선택 == 3) {
			System.out.println("잔고>"+예금액);
			}
			else if(선택 == 4) { // 만약에 4를 입력했을때
			실행=false; // 실행변수를 false 대입하여 무한루프[while] 종료
			System.out.println("[이용해주셔서 감사합니다]");
			}
			else { System.out.println("[경고] 알 수 없는 번호 입니다"); }
}
	}

}
