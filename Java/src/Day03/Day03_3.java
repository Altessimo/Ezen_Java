package Day03;

import java.util.Scanner;

public class Day03_3 {
// if(논리제어), switch(데이터제어)
	// 경우의 수가 정해져 있는 경우 → sWitch(속도 빠름)
	// 경우의 수가 정해져 있지 않는 경우 → if(논리)
	/* 형태 : switch(key : 검사대상 {
	 * 		case 검사 : 실행문;
	 * 		case 검사 : 실행문;
	 * 		case 검사 : 실행문;
	 * 		default : 실행문;
	 */
	// break; : switch 혹은 반복문을 탈출시 사용되는 키워드 {가장 가까은 중활호를 1번 탈출할때} → switch에서 거의 사용댐
	
	
	public static void main(String[] args) {
		// 예 1)
		int 점수 = 80;
		switch(점수) { // 정수는 검사!
		// 점수가 90 이면
		case 90 : System.out.println("A등급 입니다"); break;
		// 점수가 80 이면
		case 80 : System.out.println("B등급 입니다"); break;
		// 점수가 70 이면
		case 70 : System.out.println("C등급 입니다"); break;
		// 그 외
		default : System.out.println("탈락 입니다");
		}
		///////////////////////////////////////////////////////////
		if(점수 == 90 ) System.out.println(" A등급 입니다 ");
		else if(점수 == 80 ) System.out.println(" B등급 입니다 ");
		else if(점수 == 70 ) System.out.println(" C등급 입니다 ");
		else System.out.println("탈락 입니다");
		//////////////////////////////////////////////////////////
		
		// 예 2)
		int 버튼 = 3;
		switch(버튼) {
		case 1 : System.out.println("1층으로 이동"); break;
		case 2 : System.out.println("2층으로 이동"); break;
		case 3 : System.out.println("3층으로 이동"); break;
		default : System.out.println("정지");
		}
		// P.118 char, switch 문
		char grade = 'B';
			switch(grade) {
			case 'A' :
			case 'a' : System.out.println("우수 회원 입니다"); break;
			case 'B' :
			case 'b' : System.out.println("일반 회원 입니다"); break;
			default : System.out.println("손님 입니다");
			}
		// P.119 String, switch 문
		String position = "과장";
			switch(position) {
			case "부장" : System.out.println("700만원"); break;
			case "과장" : System.out.println("500만원"); break;
			default : System.out.println("300만원");
					}
		// 문제 1 : [switch] 국어, 영어, 수학 점수 입력받아 평균이 90점 이상이면 "A등급" 80점이상이면 "B" 나머지 탈락
		Scanner A = new Scanner(System.in);
		System.out.println("국어 : "); int 국어 = A.nextInt();
		System.out.println("영어 : "); int 영어 = A.nextInt();
		System.out.println("수학 : "); int 수학 = A.nextInt();
		int 평균 = (국어 + 영어 + 수학) / 3;
		
		switch(평균 / 10) { // 1의 자리를 생략
			case 10 :
			case 9 : System.out.println("A등급"); break;
			case 8 : System.out.println("B등급"); break;
			default : System.out.println("탈락");
		}
	}

}
