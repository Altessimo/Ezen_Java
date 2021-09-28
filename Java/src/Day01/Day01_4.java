package Day01;

import java.util.Scanner;

public class Day01_4 { // c s

	public static void main(String[] args) {
		// 1. 입력객체 : 키보드로부터 입력값으 저장하는 객체
		Scanner 입력객체 = new Scanner(System.in);
		// 객체선언 : 클래스명 객체명[임의] = new 생성차();
		// 2. 입력받은 값 꺼내와서 변수(저장상자)에 저장
		// 변수는 값을 저장 할 수 있는 메모리 [기억장치]
		System.out.println("첫번째 입력 : ");
		String 첫번째입력 = 입력객체.next();
		// String : 문자열 클래스 : 문자열을 저장하는 객체
		
		System.out.print("두번째 입력 : ");
		int 두번째입력 = 입력객체.nextInt();
		// int : 정수형(숫자) 자료형 : 정수를 저장하는 변수 선언
		
		// 3. 변수, 출력
		System.out.println("첫번째 입력 값은 : " + 첫번째입력);
		System.out.println("두번째 입력 값은 : " + 두번째입력);
		
		/*
		 * 문제 1
		 * 학생 1명의 이름과 1~3교시의 출석 여부를 입력받아 입력 받은 값을 아래와 같이 출력
		 * 4번째 
		 * 츨력결과
		 * [[ 출석부 ]]
		 * -------------------------------------
		 * 이름 		1교시 	2교시 	3교시 	비고
		 * -------------------------------------
		 */
		
		System.out.print(" 학생명 입력 : "); String 이름 = 입력객체.next();
		System.out.print(" 1교시 출력 : "); String 1_교시 = 입력객체.next();
		System.out.print(" 2교시 출력 : "); String 2_교시 = 입력객체.next();
		System.out.print(" 3교시 출력 : "); String 3_교시 = 입력객체.next();
		
		//출력하기
		System.out.println("\t\t[[ 출석부 ]]");
		System.out.println("-------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println( 이름+"\t"+1_교시+"\t"+2_교시+\"\t"+3_교시);
						// "제어문자" + 변수 + "제어문자" + 객체명 : 변수나 객체명은 문자
		System.out.println("-------------------------------------");
	}

} // c e
