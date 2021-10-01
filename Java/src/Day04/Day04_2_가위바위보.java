package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2_가위바위보 {
	// 가위바위보
		// 1. 사용자로부터 가위[0], 바위[1], 보[2] 중 하나를 입력받기
		// 2. 컴퓨터는 랜덤으로 가위, 바위, 보[0~2] 중 하나 선택
		// 3. 승리한 플레이어 호출
		// +) 만약에 종료를 입력하면 게임 종료
		// +2) 게임 종료[3]시 게임 수와 최종승리[가장 많이 이긴 플레이어 호출]
		// 가위바위보를 숫자, 문자 중 무엇으로 받을지
	
	public static void main(String[] args) {
		// 1. 필요 변수 개수 2. 키보드로 입력 3. 난수 생성 4. 제어
		Scanner scanner = new Scanner(System.in);
		
		int p; // 플레이어
		int c; // 컴퓨터
		int g = 0; // 게임 수를 저장하는 변수[while문의 반복 변수]
		int pw = 0; int cw = 0;
		
		while(true) {
			// 1. 사용자로부터 입력받기
			System.out.println("---------- [가위바위보 게임] ----------");
			System.out.print("가위[0], 바위[1], 보[2] 중 선택 : ");
			p = scanner.nextInt();
			
			// 4. 3번 입력시 게임종료
			if(p == 3) {
				System.out.println(">>>>>>>>>> [게임종료] : 게임횟수 : "+ g);
				if(pw > cw) {
					System.out.println(">>>>>>>>>> [최종승리자] : 플레이어" + pw);
				} else if(pw < cw) {
					System.out.println(">>>>>>>>>> [최종승리자] : 컴퓨터" + cw);
				} else {
					System.out.println(">>>>>>>>>> [최종승리자] : 무승부");
				}
				break; // 가장 가까운 반복문 탈출
			}
			
			// 5. 0~3 와 숫자 입력시
			if(p < 0 || p > 3) {
				System.out.println(">>>>>>>>>> [알 수 없는 번호 입니다 : 다시 입력]");
				continue; // 가장 가까운 반복문 이동
			}
			
			// 2. 컴퓨터로부터 난수 생성
			System.out.println("~~~~~~~~~~ 컴퓨터 선택 중 ~~~~~~~~~~");
			Random random = new Random(); // 난수 객체
			c = random.nextInt(3); // 0~2 사이 난수
			System.out.println(">>>>>>>>>> 컴퓨터가 낸 수 : " + c);
			
			// 3. 승리자 판단[플레이어==가위 && 컴퓨터==보 이거나 바위, 가위 이거나 보, 바위]
			if ((p == 0 && c == 2) || (p == 1 && c == 0) || (p == 2 && c == 1)) { // 플레이어가 이기는 경우의 수
				System.out.println(">>>>>>>>>> 플레이어 승리");
			}
			else if ((p == 0 && c == 0) || (p == 1 && c == 1) || (p == 2 && c == 2)) {
				System.out.println(">>>>>>>>>> 무승부");
			}
			else { // 컴퓨터 승리
				System.out.println(">>>>>>>>>> 컴퓨터 승리");
			}
			g++; // 게임 수 증가
			
		} // while end
	} // main end
} // class end
