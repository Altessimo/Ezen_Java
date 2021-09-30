package Day03;

import java.util.Scanner;

public class Day03_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 반복으로 별모양 찍기
		
		// 문제 1. 입력받은 정수만큼 별 출력 [ i는 1부터 입력받은 정수까지 1씩 증가 ]
		System.out.println("별 개수 : ");  int s = scanner.nextInt();
		for(int i = 1; i <=s; i++) { System.out.println("* "); }
		System.out.println("\n ----------------------------");
		
		// 문제 2. 입력받은 정수만큼 별 출력 // 5개마다(5배수) 줄 바꿈
		System.out.println("별 개수 : ");  int s2 = scanner.nextInt();
		for(int i = 1; i <= s2; i++) {
			System.out.println("* ");
			if(i%5 == 0) System.out.println();
		}
		System.out.println("\n ----------------------------");
		
		// 문제 3.
		System.out.println("문제3) 줄 수 : ");  int line3 = scanner.nextInt();
		// 줄수는 1부터 입력받은 줄 수(line) 까지 1씩 증가하면서 내려감
		for(int i = 1; i<=line3; i++) {
			// 줄 바꿈 하기전에 별찍기
			for(int s3 = 1; s3<=i; s3++) { System.out.print("*"); }
			// 줄바꿈
			System.out.println();
		}
		System.out.println("\n ----------------------------");
		
		// 문제 4.
System.out.print("문제4) 줄 수 : "); int line4 = scanner.nextInt();
		
		for(int i = 1; i<=line4; i++) {
			// 별찍기 
			for(int s4 = 1; s4<=line4-i+1; s4++) { System.out.print("*"); }
			// 줄바꿈
			System.out.println();
		}
		
	System.out.println("\n ----------------------------");	
		// 문제5)
		System.out.print("문제5) 줄 수 : "); int line5 = scanner.nextInt();
		for(int i = 1; i<=line5; i++) {
			// 공백찍기 
			for(int b = 1; b<=line5-i; b++) { System.out.print(" "); }
			// 별찍기 
			for(int s5 = 1; s5<=i; s5++) { System.out.print("*");}
			// 줄바꿈
			System.out.println();
		}
		
		// 문제6)
		System.out.print("문제6) 줄 수 : "); int line6 = scanner.nextInt();
		for(int i = 1; i<=line6; i++) {
			// 공백찍기
			for(int b = 1; b<=i-1; b++) { System.out.println(" ");}
			// 별찍기
			for(int s6 = 1; s6<=line6-i+1; s6++) { System.out.println("*");}
			// 줄바꿈
			System.out.println();
		}
			System.out.println("\n ----------------------------");
			
		// 문제7)
			System.out.print("문제7) 줄 수 : "); int line7 = scanner.nextInt();
			for(int i = 1; i<=line7; i++) {
				//공백찍기
				for(int b = 1; b<=line7-i; b++) {System.out.print(" ");}
				//별찍기 
				for(int s6 = 1; s6<=i*2-1; s6++) {System.out.print("*");}
				//줄바꿈
				System.out.println();
			}
			System.out.println("\n ----------------------------");
			
		// 문제8)
			System.out.print("문제8) 줄 수 : "); int line8 = scanner.nextInt();
			for(int i = 1; i<=line8; i++) {
				//공백찍기
				for(int b = 1; b<=line8-i; b++) { System.out.print(" "); }
				//별찍기 
				for(int s7 = 1; s7<=i*2-1; s7++) { System.out.print(i); }
				//줄바꿈
				System.out.println();
			}
			System.out.println("\n ----------------------------");
			
		// 문제9)
			System.out.print("문제9) 줄 수 : "); int line9 = scanner.nextInt();
			for(int i = 1; i<=line9; i++) {
				for(int b = 1 ; b<=i-1 ; b++) { System.out.print(" "); }
				for(int s8 = 1 ; s8<=line9*2-(i*2-1); s8++) { System.out.print("*"); }
				System.out.println();
	}
			System.out.println("\n ----------------------------");
}
	}