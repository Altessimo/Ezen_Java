package Day11;

public class Day11_2 {
public static void main(String[] args) {
// API : 어떤 틀을 짜논것
	// 라이브러리 : 만들어진 클래스, 인터페이스
// object 클래스
	// 1. equals() : 객체 비교
	
	Member obj1 = new Member("blue");
	Member obj2 = new Member("blue");
	Member obj3 = new Member("red");
	
	if(obj1.equals(obj2)) {
		System.out.println("1. 두 객체는 동등합니다.");
	} else {
		System.out.println("1. 두 객체는 다릅니다.");
	}
	if(obj1.equals(obj3)) {
		System.out.println("2. 두 객체는 동등합니다.");
	} else {
		System.out.println("2. 두 객체는 다릅니다.");
	}
	// 2. toString() : 객체 정보
		// 객체의 주소값 [자료형들은 값 호출]
	System.out.println(obj1.toString());
	System.out.println(obj2.toString());
	System.out.println(obj3.toString());
	String 문자열 = "홍길동";
	System.out.println(문자열.toString());
	
	// 3. clone() : 객체 복제
		// 1. 얇은 복제 : 배열 객체는 복제 불가(주소만 복사)
		// 2. 깊은 복제 : 배열 객체도 복제 가능
	Member2 original = new Member2("blue", "홍길동", "12345", 25, true);
	
	//2. 
	Member2 cloned = original.getMember2();
	cloned.password = "67890";
	System.out.println("---------- 복제된 객체 정보");
	cloned.toString();
	System.out.println("---------- 원본 객체 정보");
	cloned.toString();
	
	// 3-1 깊은 복제
	// 1. 객체 생성
	Member3 original2 = new Member3("홍길동",25, new int[] {90,90}, new Car("소나타"));
	
	// 2. 깊은 복제
	Member3 cloned = original2.getMember3();
	cloned2.scpres[0] = 100;
	cloned2.car.model="그랜저";
	
	System.out.println("---------- 원본 객체");
	original2.toString();
	System.out.println("---------- 깊은 복제 객체");
	cloned2.toString();
}
}
