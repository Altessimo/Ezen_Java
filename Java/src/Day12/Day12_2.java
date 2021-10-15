package Day12;

import java.util.Random;

public class Day12_2 {
// P.527
	
	public static void main(String[] args) {
		// Wrapper 포장 클래스 : 기본 자료형 → 객체화
		
		// P.531 문자열 → 기본타입
			// Integer.parseInt("문자열");
			// Double.parseDouble("문자열");
			// Bouble.parseDouble("문자열");
			// Byte.parseInt(), Short.parseInt(), Long.parseInt(), Float.parseInt()
		// 기본타입 → 문자열
			// 1. String.valueof(기본자료형);
			// 바이트 배열 → 문자열
			// 2. new 생성자(바이트 계열)
		
		int value1 = Integer.parseInt("10"); // "10" → 10
		double value2 = Double.parseDouble("3.14"); // "3.14" → 3.14
		boolean value3 = Boolean.parseBoolean("true"); // "true" → true
		
		// P.534 : Math 클래스 : 수학관련 메소드 제공
		// 1. Math.abs()
		System.out.println("절대값 : " + Math.abs(-5)); // 5
		System.out.println("절대값 : " + Math.abs(-3.14)); // 3.14
		// 2. Math.ceil() 
		System.out.println("올림값 : " + Math.ceil(5.3)); //6.9
		System.out.println("올림값 ㅣ " + Math.ceil(-5.3)); // -5.0
		
		// 3. Math.floor()
		System.out.println("버림값 : " + Math.floor(5.3)); // 5.0
		System.out.println("버림값 : " + Math.floor(-5.3)); // -6.0
		
		// 4. Math.max()
		System.out.println("최대값 : " + Math.max(5, 9)); // 9
		System.out.println("최대값 : " + Math.max(5.3, 2.5)); // 5.3
		
		// 5. Marh.min()
		System.out.println("최소값 : " + Math.min(5, 9)); // 5
		System.out.println("최소값 : " + Math.min(5.3, 2.5)); //2.5
		
		// 6. Math.random() : 0~1 사이의 난수 생성
		System.out.println("난수 : " + Math.random());
		
		// 7. Math.rint()
		System.out.println("가까운 정수의 실수값 : " + Math.rint(5.3)); // 5
		System.out.println("가까운 정수의 실수값 : " + Math.rint(5.7)); // 7
		
		// 8. Math.round() : 소수점 1의 자리 반올림
		System.out.println("반올림 : " + Math.round(5.3)); // 5
		System.out.println("반올림 : " + Math.round(5.7)); // 6
		// * 소수점 3의 자리 반올림[자리수 오릴고 반올림 자리수 내림]
		double value = 12.3456;
		double rvalue = Math.round(value*100) / 100.0; // 1234.56;
		// 연산자 우선 순위 : 상위 괄호 → 하위 대입
		// 1. value*100
		// 2. Math.round
		// 3. Math.round(value*100) / 100.0;
		// 4. 대입
		System.out.println(rvalue);
		
		// P.536 : 주사위[1~6]
		// int num = Math.random(); // 0 ~ 1
		// int num = Math.random()*6; // 0*6 ~ 1*6
		int num = (int)(Math.random()*6)+1; // 1*6+1 ~ 1*6+1 : 1~7
		System.out.println(num);
		
		// P.537 : Random 클래스
		Random random = new Random(); // Random클래스는 staric 메소드를 제공하지 않음
		// int num2 = random.nextInt(); // 0~int가 표현 할 수 있는 범위만큼 난수
		int num2 = random.nextInt(6)+1; // 1~6
		System.out.println(num2);
	}
}
