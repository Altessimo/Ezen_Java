package Day01;

public class Day01_2 { // 클래스 시작 C S
	
	// public static void main(String[] args) { // main 없이 실행 불가
	// main + ctrl + 스페이스바
	public static void main(String[] args) { // M S
		
		// 1. 출력
		// print(출력할 문구) : 출력
		// println(출력할 문구) : 출력 후 줄바꿈(라인 바꿈)
		// f : format : 모양
		// %d : 정수
		// %f : 실수
		// %s : 문자열
		// %c : 문자
			// 제어문자 P.34
			// \ : 엔터 위에 원화기호 \
			// \n : 줄바꿈
			// \t : 탭 (들여쓰기 5칸)
			// \r : 리턴(맨 앞으로 이동)
			// \\ : 출력
		
		// 예 1 : syso + ctrl + 스페이스바
		System.out.print("Java");
		System.out.print(12345); // 기계어 이기 때문에 숫자에는 문자처리 X
		System.out.print("Java 10"); // 문자 + 숫자 = 문자
		// system : 미리 만들어진 시스템이라는 클래스
		// Out : 출력 스트림
		// print(인수 : 출력하고 싶은말) : 출력 함수
		// . : 클래스 내 맴버(함수, 변수) 접근 연산자(특수문자 : +, - 등)
		// " " : 키워드(미리 작성된 언어), 변수 등 제외한 모든 문자에는 문자처리
		// ; : 한 줄의 실행코드 마침(끝)
		
		// Ctrl + f11 : 컴파일
		
		// 예제 2
		System.out.println("Java");
		System.out.println(12345);
		System.out.println("Java 10");
		
		// 예제 3
		System.out.printf("%s", "Java");
		System.out.printf("%d", 12345);
		System.out.printf("%s", "Java 10");
		
		// print 장점
		System.out.printf("나이는 %d 입니다 ", 20);
		System.out.println("나이는 " + 20 + "입니다");
		// + : 연결 연산자

		// 제어문자
		System.out.print("\nJava\n"); // 앞 뒤로 줄바꿈
		System.out.print("\t 12345 ");
		System.out.println("\r Java10");
		
		// 문제 1
		/* 출력결과
		 * 				[[ 출석부 ]]
		 * -------------------------------------
		 * 이름 		1교시 	2교시 	3교시 	비고
		 * 강호동		출석		결석		출석
		 * 유재석		출석		결석		출석
		 * -------------------------------------
		 */
		
		System.out.println("\n\t\t[[ 출석부 ]]");
		System.out.println("-------------------------------------");
		System.out.println("이름\t 1교시 \t 2교시 \t 3교시 \t 비고");
		System.out.println("강호동\t 출석 \t 결석 \t 출석");
		System.out.println("유재석\t 출석 \t 결석 \t 출석");
		System.out.println("-------------------------------------");
		
		// 문제 2 : 고양이
		System.out.println("\\     /\\");
		System.out.println(" )   (  ')");
		System.out.println(" (  /  )");
		System.out.println("  \\(__)|"); // | : s
		
		// 문제 3 : 개
		System.out.println();
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\"\\"); // 문자처리 연산자 = \" : "출력
		System.out.println("|\"^\"-    |");
		System.out.println("||_/=\\\\__|");
		
	} // M E

} // 클래스 끝 C E
