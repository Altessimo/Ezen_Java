package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6_틱택토게임 {
// 배열을 이용한 틱택토 게임 프로그램
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	// 1. 게임판 생성[9칸 생성]
		// String 객체 9개를 저장하는 배열 선언
	String[] 게임판 = { "[ ]", "[ ]", "[ ]",
					"[ ]", "[ ]",  "[ ]",
					"[ ]",  "[ ]", "[ ]", };
	
	String winner = " "; // 승리 말을 담을 변수
	int count = 0; // 현재 말 수
	
	while(true) {
		// 2. 게임판 출력[인덱스가 0번부터 시작하기 때문에 for 초기값을 0부터 시작]
		for(int i = 0; i<게임판.length; i++) {
			System.out.print(게임판[i]);
			
			// 3칸마다 줄 바꿈
			if(i%3 == 2) System.out.println();
		}
		
		// 6. 승리자가 나왔을때 게임 종료
		if(winner.equals("[0]")) {
			System.out.println(">>>> [플레이어 승리]");
			break;
		} else if (winner.equals("[X]")) {
			System.out.println(">>>> [컴퓨터 승리]");
			break;
		}
		
		// 3. 플레이어가 위치를 선택하여 말[O] 두기
		while(true) {
		System.out.println(">> [플레이어 순서] 위치 선택 : ");
		int index = scanner.nextInt();
		
		// 선택한 위치에 이미 말이 있었을 경우에 다시 입력받기
		if(게임판[index].equals("[ ]")) {
			게임판[index]="[O]"; // 해당 위치 게임판 모양 변경
			count++; // 현재 말 개수 1증가
			break;
		} else {
			System.out.println(">> [이미 둔 자리 입니다] : 다시 선택");
		}
	}
	
		// 7. 9칸 말이 모두 존재
		if(count ==9 ) {
			// 2. 게임판 출력[인덱스가 0번부터 시작하기 때문에 for 초기값을 0부터 시작]
			for(int i = 0; i<게임판.length; i++) {
				System.out.print(게임판[i]);
				
				// 3칸마다 줄 바꿈
				if(i%3 == 2) System.out.println();
			}
			
			System.out.println(">>>> [무승부]");
			break;
		}
		
	// 4. 컴퓨터[0~8 사이 난수를 생성해서 말 두기
	System.out.println(">> [컴퓨터 순서] 위치 선택 중");
	while(true) {
	Random random = new Random();
	int index = random.nextInt(9); // 0~8 사이의 난수 생성
	if(게임판[index].equals("[ ]")) {
		count++; // 현재 말 개수 1증가
		게임판[index] = "[X]"; break;
	}
	}
	
	//5. 승리자 판단
	// 1. 0 1 2 	3 4 5 	6 7 8 모양이 같을경우 해당 모양 승리
	for (int i = 0; i<=6; i+=3) {
		if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) {
			if(!게임판[i].equals("[ ]")) {
				// ! : 부정[ true → false]
				winner = 게임판[i];
			}
		}
	}
	// 2. 0 3 6 	3 4 7 	2 5 6 모양이 같을경우 해당 모양 승리
	for(int i = 0; i<=2; i++) {
		if(게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])) {
			if(!게임판[i].equals("[ ]")) {
				// ! : 부정[ true → false]
				winner = 게임판[i];
		}
	}
	}
	// 3. 0 4 5 	2 4 6		   [대각선로 이기는수]모양이 같을경우 해당 모양 승리
		if(게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8]) ||
				게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) {
		if(!게임판[0].equals("[ ]")) {
			// ! : 부정[ true → false]
			winner = 게임판[0];
		}
		}
	}
	} // m e
} // c e
