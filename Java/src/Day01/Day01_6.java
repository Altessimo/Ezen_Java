package Day01;

import java.util.Scanner;

public class Day01_6 {
/*
 * 문제 3 : 방문록 입력 받아 출력하기
 * [입력받기]
 * ---------- 방문록 --------------------------
 * | 	순번	|	이름 		| 내용 		| 날짜	|
 * | 	1	|	강호동	| 안녕하세요	| 09-28	|
 * -----------------------------------------
 */
	public static void main(String[] args) {
		// 1. 입력객체
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 이름 : "); String name = scanner.next();
		scanner.nextLine();
		System.out.println(" 내용 : "); String contents = scanner.nextLine();
		// Scanner.nextLine(); // next 다음으로 nextLine 사용시 문제 발생
		// 해결방법 : next와 nextLine 사이에 nextLine() 추가
		System.out.println(" 날짜 : "); String data = scanner.next();
		
		// 2. 출력
		System.out.println("---------------- 방문록 ---------------");
		System.out.println("| 순번 | 이름 | 내용 | 날짜 |");
		System.out.println("| 1   | "+name+" | " + contents + "\t |" + data +"|");
		System.out.println("--------------------------------------");
		

	}

}
