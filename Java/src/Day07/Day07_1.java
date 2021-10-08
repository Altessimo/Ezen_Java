package Day07; // 현재 클래스의 패키지 위치

// 다른 패키지로부터 클래스 가져오기
import java.util.Random;
import java.util.Scanner;
import Day06.Student; // import 패키지 명.클래스

public class Day07_1 {
	// Day06 : 클래스[설계도 : 자료형 만들기]
	// 1. 맴버(선택사항 O 필수 X)
		// - 필드 : 데이터 저장[메모리 할당(변수, 객체)]
		// - 생성자 : 데이터 초기값[객체 필드 초기값]
		// - 메소드 : 데이터 동장, 행동
		// 반환타입(int) 메소드명(인수1, 인수2, 인수3 ~) {return 반환값}
	
	// 2. 객체(클래스의 인스턴스) 생성
		// 클래스명 객체명 (아무거나 사용 가능)
			// 객체명 = new 생성자(); ← 인스턴스
		// 객체가 맴버 접근[객체명 . 맴버(필드, 생성자, 메소드)접근연산자]
	
	public static void main(String[] args) {
		// P.236
		
		// P.238
		double result = 10*10*Calculator.p1;
				// 해당 클래스의 맴버 접근 방법
					// 1. 객체 생성[해당 클래스로부터 메모리 할당]
					// 2. static[정적변수] : 프로그램 시작시 메모리 할당[main 실행보다 우선]
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result2);
		
		// P.245
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation+" "+p1.ssn+" "+p1.name+" ");
		
		// 필드 수정[final 필드는 수정불가 → 상수만들기]
		// p1.nation = "usa";
		// p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
		
		// P.253 import : 다른 페이지로부터 클래스 가져오기 키워드
		// 1. import 패키지명.클래스명 [클래스 외부에 작성]
		// 2. 패키지명. 클래스명 객체명; [클래스 내부에 작성]
	}
}
