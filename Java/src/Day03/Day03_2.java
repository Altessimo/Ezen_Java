package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		
		// 문제 1 : 2개의 정수를 입력받아 더 큰 수 출력
				System.out.println("문제 1 정수1 : "); int 정수1 = A.nextInt();
				System.out.println("문제 1 정수2 : "); int 정수2 = A.nextInt();
				if(정수1 > 정수2) System.out.println("더 큰수는 : " + 정수1);
				else if(정수1 < 정수2) System.out.println(" 더 큰수는 : " + 정수2);
				else System.out.println("두 수는 같다");
				
				// 문제 2 : 3개의 정수를 입력받아 가장 큰 수 출력
				System.out.println("문제 2 정수3 : "); int 정수3 = A.nextInt();
				System.out.println("문제 2 정수4 : "); int 정수4 = A.nextInt();
				System.out.println("문제 2 정수5 : "); int 정수5 = A.nextInt();
				
				if(정수3 > 정수4 && 정수3 > 정수5) System.out.println("가장 큰수는 : " + 정수3);
				else if(정수4 > 정수3 && 정수4 > 정수5) System.out.println("가장 큰수는 : " + 정수4);
				else if(정수5 > 정수3 && 정수5 > 정수4) System.out.println("가장 큰수는 : " + 정수5);
				else System.out.println("세 정수는 같다");
				
				// 문제 3 : 4개의 정수를 입력받아 가장 큰 수 출력
				System.out.println("문제 3 정수6 : "); int 정수6 = A.nextInt();
				System.out.println("문제 3 정수7 : "); int 정수7 = A.nextInt();
				System.out.println("문제 3 정수8 : "); int 정수8 = A.nextInt();
				System.out.println("문제 3 정수9 : "); int 정수9 = A.nextInt();
				
				int max = 정수6; // max 변수에 첫번쨰 값 넣기 
				if(max < 정수7) max = 정수7; // 만약에 max 변수에 있는 값보다 크면 max 값 변경
				if(max < 정수8) max = 정수8;
				if(max < 정수9) max = 정수9;
				System.out.println("가장 큰 수는 : " + max);
				
				// 문제 4 : 4개의 정수를 입력받아 오름차순으로 출력 (크면 뒤로)
				System.out.println("문제 4 정수10 : "); int 정수10 = A.nextInt();
				System.out.println("문제 4 정수11 : "); int 정수11 = A.nextInt();
				System.out.println("문제 4 정수12 : "); int 정수12 = A.nextInt();
				System.out.println("문제 4 정수13 : "); int 정수13 = A.nextInt();
				
				int temp; // 교환시 사용되는 임의 변수 
					// 1. 1번쨰 변수와 2, 3, 4번째 변수 비교 = 3번
				if(정수10 > 정수11) {temp = 정수10; 정수10 = 정수11; 정수11 = temp;}
				if(정수10 > 정수12) {temp = 정수10; 정수10 = 정수12; 정수12 = temp;}
				if(정수10 > 정수13) {temp = 정수10; 정수10 = 정수13; 정수13 = temp;}
				
				// 2. 2번쨰 변수와 3, 4번째 변수와 비교 = 2번
				if(정수11 > 정수12) {temp = 정수11; 정수11 = 정수12; 정수12 = temp;}
				if(정수11 > 정수13) {temp = 정수11; 정수11 = 정수13; 정수13 = temp;}
				
				// 3. 3번쨰 변수와 4번째 변수 비교 = 1번
				if(정수12 > 정수13) {temp = 정수12; 정수11 = 정수13; 정수13 = temp;}
				
				// 4. 4번째 변수는 비교를 3번 당했기 때문에 비교 x
				System.out.printf("오름차순 : %d %d %d %d \n" , 정수10, 정수11, 정수12, 정수13);
				
				// 문제 5 : 4개의 정수를 입력받아 내침차순으로 출력(작으면 뒤로)
				if(정수10 < 정수11 ) {temp = 정수10; 정수10 = 정수11; 정수11 = temp;}
				if(정수10 < 정수12 ) {temp = 정수10; 정수10 = 정수12; 정수12 = temp;}
				if(정수10 < 정수13 ) {temp = 정수10; 정수10 = 정수13; 정수13 = temp;}
				if(정수11 < 정수12 ) {temp = 정수11; 정수11 = 정수12; 정수12 = temp;}
				if(정수11 < 정수13 ) {temp = 정수11; 정수11 = 정수13; 정수13 = temp;}
				if(정수12 < 정수13 ) {temp = 정수12; 정수12 = 정수13; 정수13 = temp;}
				System.out.printf("내림차순 : %d  %d  %d  %d  \n", 정수10, 정수11, 정수12, 정수13);
				
				// 문제 6 : 로그인 페이지
					// [입력] : 아이디와 비밀번호를 입력받기
					// [조건] : 회원 아이디가 admin 이고 비밀번호가 1234 일 경우에는 로그인 성공 아니면 로그인 실패 출력
				System.out.println("로그인 페이지");
				System.out.println("아이디 : "); String 아이디 = A.next();
				System.out.println("비밀번호 : "); int 비밀번호 = A.nextInt();
				
				if(아이디.equals("Admin")) {
					// String 비교시 equals 메소드 사용 // 아이디가 Admin 사용
					if(비밀번호 == 1234) {
						System.out.println("로그인 성공");
						return; // 가장 가까운 메소드(함수) 종료
					} else {
					System.out.println("[로그인 실패] 패스워드가 다릅니다.");
				}
				}
				else {
					System.out.println("[로그인 실패] 존재하지 않는 아이디 입니다.");
	}
				
	}

}
