package Day06;

public class Day06_1 {
// P.195
	
	public static void main(String[] args) {
		// 1. 객체만들기 : 클래스 이용한 메모리 할당
		Student student = new Student();
		// 클래스명 객체명 = new 생성자();
			// 클래스명 == 생성자면
		System.out.println("student 변수가 Student 객체를 참조합니다");
		
		Student student2= new Student();
		System.out.println("student 변수가 또 다른 Student 객체를 참조합니다");
		
		System.out.println("객체이름 출력 : " + student);
		// 진수
		// 0, 1 : 2진수 [기계어]
		// 0 ~ 7 : 8진수
		// 0 ~ 9 : 10진수
		// 0 ~ 9 a(10) b c d e f : 16진수 / 더 많은 진수를 표현하기 위해
		
	// P.201
			// 1. 자동차 객체 만들기
		Car car = new Car();
		
		// 2. 객체내 맴버(필드) 호출
		System.out.println("제작회사 : " + car.compay);
		System.out.println("모델명 : " + car.model);
		System.out.println("색깔 : " + car.color);
		System.out.println("최고속도 : " + car.maxSpeed);
		System.out.println("현재속도 : " + car.speed);
		
		// 3. 객체 내 맴버(필드) 값 변경
		System.out.println(">>> 속도 증가");
		car.speed = 60;
		System.out.println("수정된 속도 : " + car.speed);
		
	// P.203 : 생성자
		Car2 car2 = new Car2("검정", 3000); // 생성자
		
	// P.207 : 생성자 → 필드 초기화
		Korean korean = new Korean("뱍자바", "011225-1234567");
		System.out.println("Korean1 name : " + korean.name);
		System.out.println("Korean1 ssn : " + korean.ssn);
		
		Korean korean2 = new Korean("김자바", "930525-0654321");
		System.out.println("Korean2 name : " + korean2.name);
		System.out.println("Korean2 ssn : " + korean2.ssn);
		
		// 비어있는 객체[빈생성자]
		Korean korean3 = new Korean();
		korean3.name = "박자바";
		korean3.ssn = "011225-1234567";
		System.out.println("korea3 name : " + korean.name);
		System.out.println("koran3 ssn : " + korean.ssn);
	}
}
