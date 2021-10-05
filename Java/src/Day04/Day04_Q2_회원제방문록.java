package Day04;

import java.util.Scanner;

public class Day04_Q2_회원제방문록 {
	/*
	 * 2. 회원제 방문록 프로그램
	 *  [조건1] : 최대 100명을 저장할 수 있는 회원 배열[아이디, 비밀번호]
	 *  [조건2] : 초기메뉴
	 *   	1. 로그인
	 *   	2. 회원가입
	 *  [회원가입을 선택했을 때]
	 *  	1. 아이디와 비밀번호를 입력받아 배열에 저장
	 *  	2. 아이디 중복 불가[배열에 기존 아이디가 존재하면 회원가입 실패]
	 *  [로그인을 선택 했을 때]
	 *  	1. 아이디와 비밀번호를 입력받아 배열 내 존재하면 로그인 성공 // 아니면 실패
	 *  [로그인 성공시 메뉴]
	 *  	1. 방문록 쓰기
	 *  	2. 모든 방문록 확인
	 *  	3. 로그아웃
	 *  [방문록 남기기 선택했을때]
	 *  	내용을 입력받아 배열에 저장(내용과 작성자 아이디 저장)
	 *  	내용 입력 후 → 기존 방문록 목록 출력
	 *  [로그아웃]
	 *  	초기메뉴로 돌아가기
	 */
	public static void main(String[] args) {
		// 0. 입력객체
		Scanner scanner = new Scanner(System.in);
		
		// 1. 회원 100명[ID, PW]을 저장하는 방법 선언
		String[][] 회원목록 = new String[100][2]; // 2차원 배열 사용 / 100명 * 2열 → 200칸 / 100은 ID, 2는 Pw
		// 1-1. 방문록 100개(contents, writer) 저장하는 방법 선언
		String[][] 방문록 = new String[100][2];
		
		// 2. 메뉴 → 메뉴는 계속 반복실행 : 무한루프(while)
		while(true) {
			System.out.println("\n\n\t ~ 회원제 방문록 프로그램 ~");
			System.out.println("--------------------------------------");
			System.out.print("[ 1. 회원가입 2. 로그인 선택 : ");
			int ch = scanner.nextInt();
			
			//3. 입력에 따른 값 제어
			switch(ch) { // if로도 가능함
			case 1 :
				System.out.println("- 회원가입 페이지");
				System.out.println("ID : "); String id = scanner.next();
				System.out.println("Password : "); String pw = scanner.next();
				
				// Id 중복체크(모든 배열 내 인덱스에 접근해서 동일한 아이다가 있는지 확인)
				boolean idchck = true; // 중복체크 변수
				for(int i = 0; i<회원목록.length; i++) {
								// 회원목록.length : 배열의 가로길이 = 100 / new String[100][2]; 100으로 선언했기 때문
					if(회원목록[i][0] != null && 회원목록[i][0].equals(id)) { // i번째 id가 동일하면
						System.out.println("[알림] : 중복된 아이디가 존재 합니다.");
						idchck = false;
						break; // 중복찾기 for 종료
					}
			}
			// 중복체크 변수가 true이면 배열 내 빈 공안을 찾아서 저장
				// 배열에 저장
			if(idchck) {
				for(int i=0; i<회원목록.length; i++) {
					if(회원목록[i][0] == null) { // i번째가 공백이면 
						회원목록[i][0] = id; 회원목록[i][1] = pw;
						System.out.println("[알림] : 회원가입이 되었습니다");
						break;
					}
					}
			}
			case 2 :
				System.out.println("- 로그인 페이지");
				// 1. 입력 → 저장
				System.out.println("ID : "); String logid = scanner.next();
				System.out.println("Password : "); String logpw = scanner.next();
				// 2. 배열 내에서 입력한 아이디와 패스워드가 존재하는지 확인 → 존재하면 로그인 성공
				// for문을 이용한 모든 인덱스에 접근해서 하나씩 비교
				
				boolean logincheck = true;
				for(int i=0; i<회원목록.length; i++) {
					if(회원목록[i][0] != null &&
							회원목록[i][0].equals(logid) &&
							회원목록[i][1].equals(logpw)) {
						System.out.println("[알림] : 로그인 성공");
						// 로그인 성공시 메뉴 ↓
						while(true) { // 회원메뉴 무한루프
							System.out.println("\n\n\t ~ 회원목록 ~");
							System.out.print("[ 1. 방문록 2. 로그아웃 선택 : ");
							int ch2 = scanner.nextInt();
							
							if(ch2==1) {
								scanner.nextLine(); // nextLine 오류 해결
								System.out.println("방문록 내용 :");
								String contents = scanner.nextLine(); // nextInt와 nextLine에 "scanner.nextLine();" 없으면 함께 인식됨
								// 방문록 배열 내 빈 공간을 찾아서 내용과 로그인 된 아이디를 저장
								for(int j=0; j<방문록.length; j++) { 
									if(방문록[j][0] == null) { // i번째 인덱스와 값이 공백(null) 이면
										방문록[j][0] = contents; 방문록[j][1] = logid;
										System.out.println(">>>>> 방문록 등록");
										break;
									}
								}
							}
							else if(ch2==2) {
								System.out.println("---------- 방문록 목록 ----------");
								System.out.printf("%10s \t %s \n", "작성자", "방문내용");
								// 배열 내 공백을 제외한 모든 내용 출력
								for(int j=0; j<방문록.length; j++) {
									if(방문록[j][0] == null) { break;}
									System.out.printf("%10s \t %s \n", 방문록[j][1], 방문록[j][0]); // "%10s 방문록[j][1], 
								}
							}
							else if(ch2==3) {
								System.out.println("[알림] 로그아웃 되었습니다");
								break;
							}
							else System.out.println("[알림] 알 수 없는 행동입니다");
						}
						//// 로그인 성공시 메뉴 ↑
						logincheck = false;
						break;
					}
				}
				// 로그인 실패시
				if(logincheck) System.out.println("[알림] : 로그인 실패(동일한 회원정보가 없습니다)");
				break;
				
				default :
					System.out.println("[알림] : 알 수 없는 번호 입니다.");
			}
		}
	}
}
