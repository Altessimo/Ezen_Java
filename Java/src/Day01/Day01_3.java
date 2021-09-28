package Day01;

import java.util.Scanner;

public class Day01_3 {

	
	// main 메소드(함수)
	public static void main(String[] args) {
		// 출력 클래스 : System
		System.out.println("입력 : "); // 출력 메소드 호출
		
		// 입력 클래스 : Scanner : 키보드로 부터 입력받은 값을 메모리(저장장치)에 객체저장
		// 1. 키보드로 부터 입력받은 값을 메모리(저장장치)에 객체저장
		// 2. 다른 변수로 입력 값 옮기기
		// 3. 새로운 입력 값 받기
		
		// 		입력개체(다르게)		키워드
		Scanner scanner = new Scanner(System.in);
		// 객체 : 클래스 기반으로 생성된 메모리 공간
		// 객체 선언 : 클래스명, 객체 명(임의) = new 생성기(  )
			// new : 메모리 할당 연산자
		// system.out : 출력
		// system.out : 압력
		// 객체에서 꺼내오기 [.next() : 개체 내 저장된 문자열 호출] 띄어쓰기 X
		// nextint() : 객체 내 저장된 정수 호출
		// nextline() : 객체 내 저장된 문자열 호출, 띄어쓰기 O
		
		String string1 = scanner.next();
		// 객체 내 저장된 입력 값을 변수에 저장
		System.out.println("입력된 문자열은 : " + string1);
		
		System.out.print("입력2 : ");
		// 두번째 입력값 불러오기
		String string2 = scanner.next();
		// 출력
		System.out.println("입력된 두번째 문자열은 : " + string2);

	}

}
