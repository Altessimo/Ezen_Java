package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_7_로또판별기 {
/*
 * 1. 로또 판별기
 * 	[조건1] : 1~45 사이의 수를 5개 입력받아 배열에 저장 // 사용자 6개 입력하고 
 *  	// 단, 중복 불가 : 1~45 사이만 가능
 *  [조건2] : 추첨번호는 난수 생성 1~45 사이의 숫자 6개 생성하여 배열에 저장 // 컴퓨터가 6개 입력
 *  [조건3] : 두 배열 내 동일 한 숫자가 몇개 있는지 체크하여 등수 출력
 *  [출력] : 몇개가 동일한지 출력하고 등수 출력
 *  	6개 모두 동일하면 1등, 5개 동일하면 2등, 4개 동일하면 3등, 5개 동일하면 4등, 그 외 꽝
 */
	public static void main(String[] args) {
		// 0. 입력객체
		Scanner scanner = new Scanner(System.in);
		// 0. 배열 [배열선언 : 자료형[] 배열명 = new 자료형[길이]]
		int[] number = new int[6]; // int형 6개 변수를 저장 할 수 있는 배열
		int[] random = new int[6];
		
		// 1. 사용자로부터 6개 수를 입력받아 배열에 저장
		for(int i = 0; i<6; i++) {
			System.out.print(i+"번째 번호(1~45) 선택 :");
			
			int num = scanner.nextInt();
			if(num < 1 || num > 45) { // 0~45 사이가 아닐경우
				System.out.println("[알림] : 0~45 사이만 입력 가능 합니다 : 다시입력");
				i--; // 정상적인 입력이 아니기 때문에 i를 차감
				continue;
			}
			
			Boolean chack = true; // 중복이 없을 경우 : true, 중복이 있을 경우 : false
			// 중복체크! : 만약에 입력한 값이 배열 내 동일한 값이 존재하면 다시 입력
			for(int j = 0; j<6; j++) {
				if(num == number[j]) { // 중복찾기 성공
					System.out.println("[알림] : 0~45 사이만 입력 가능 합니다 : 다시입력");
					i--; // 정상적인 입력이 아니기 떄문에 i 차감
					chack = false; // 중복이 있는경우 
					break; // 중복을 찾았기 때문에 반복문 종료 
				}
		}
			// 1~45 사이 수 이면서 중복수가 아니면 i번째 배열에 저장
			number[i] = num;
		}
	// 2. 출력
		System.out.print("사용자가 선택 한 수 : ");
		for(int i = 0; i<6; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		// 3. 6개의 난수를 생성해서 배열에 저장[중복체크]
		for(int i = 0; i<6; i++) {
			Random random2 = new Random(); // 난수 객체 생성
			int num = random2.nextInt(45)+1; // 난수 객체에서 1~45사이의 난수 가져오기
			
			Boolean check = true; // 중복 확인 체크
			for(int j = 0; j<6; j++) { // 반복이면서 배열 내 중복값찾기
				if(num == number[j]) { // 만약에 난수가 기존 배열 내 값과 동일하면
					i--;
					check = false;
				break;
				}
			}
			if(check) random[i] = num; // 중복값이 없을경우 i번째에 난수 넣기
		}
		
		// 4. 출력 
		System.out.print("이번주 추첨 번호 : ");
		for(int i = 0; i<6; i++) {
			System.out.print(random[i] + " ");
		}
		System.out.println();
		
		int count = 0; // 맞은 수 변수
		// 5. 두 배열 내 동일 한 수 체크
		for(int i = 0; i<6; i++) { // i는 number 배열의 인덱스
			for(int j=0; j<6; j++) { // j는 random 배열의 인덱스  => 36번 비교 [ i 1개당 j는 6번씩 비교 ]
				if(number[i] == random[j]) { // 만약에 동일하면
					count++; // 맞은 수 변수를 1증가
				}
			}
	}
		System.out.println(">>> 추첨결과 : " + count);
	} // m e
} // c e
