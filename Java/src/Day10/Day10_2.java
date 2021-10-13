package Day10;

public class Day10_2 {
// P. 332 추상 클래스 예제
public static void main(String[] args) {
	
	// Phone phone = new Phone("홍길동");
	// 1. 추상 클래스 만으로 객체생성 불가	
	
	SmartPhone smartPhone = new SmartPhone("홍길동");
	
	smartPhone.turnOn();
	smartPhone.internetSearch();
	smartPhone.turnOff();
}
}
