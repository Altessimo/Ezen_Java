package Day03;

public class Day03_6 {

	public static void main(String[] args) {
		// for(초기값; 조건문; 증감식) {실행문}
		// 초기값
		// while(조건문) {
		// 설명문
		// 증감식
		// }
		
		// P.125 예1
		int i = 1; // 1. while은 밖에다가 초기값
		while(i<=10) { // 2. 조건문
			System.out.print(i + " "); // 실행문
			i++; // 증감식
			}
		System.out.println("\n ----------------------------");
		// for 차이
		for(int j = 1; j<=10; j++) {
			System.out.print(j + " ");
		}
		System.out.println("\n ----------------------------");
		// P.125 예2
		int sum = 0;
		int h = 1; // 초기값
		while(h<=100) { sum+=h; h++; }
		System.out.println("1~100까지 누적합계 : " + sum);
		
		// for의 차이
		int sum2 = 0;
		for(int k=1; k<=100; k++) { sum2+=k; }
		System.out.println("1~100 까지 누적합계 : " + sum2);
		
		// 무한루프 → while(true)
		while(true) {System.out.println("계속 실행 중"); }
	}

}
