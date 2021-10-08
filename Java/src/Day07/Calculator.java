package Day07;

public class Calculator { // 클래스 선언 : 접근제한자 class 클래스명{ }
	
	// 1. 필드
	static double p1 = 3.14159;
	
	// 2. 생성자
	
	// 3. 메소드[인수(외부로 부터 들어옴) : int x, int y // 반환 : int x+y]
		// 메소드 생성
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
}
