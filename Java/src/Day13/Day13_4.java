package Day13;

public class Day13_4 {

	public static void main(String[] args) {
		// 비 제네릭 : 제네릭이 없을경우
			// 1. 타입 변환
		// 1. 겍체생성
		Box box = new Box();
		// 2. 객체 메소드 호출
		box.set("홍길동"); // 홍길동[String] → object[자동 형변환]
		String name = (String)box.get(); // object → string[강제 형변환]
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
		// 제네릭 : 형 변환이 많은 객체 클래스 사용시
		Box2<String> box2 = new Box2<>();
		// 클래스명<매개클래스> 변수명 = new 생성자<>();
		box2.set("hello");
		String str = box2.get();
		
		Box2<Integer> box22 = new Box2<>();
		box22.set(6);
		int value = box22.get();
		
		// 멀티 제네릭
		Product<Tv, String> Product1 = new Product<>();
		Product1.setKind(new Tv());
		Product1.setModel("스마트 Tv");
		Tv tv = Product1.getKind();
		String tvModel = Product1.getModel();
		
		Product<Car, String> Product2 = new Product<>();
		Product2.setKind(new Car());
		Product2.setModel("디젤");
		Car car = Product2.getKind();
		String carModel = Product2.getModel();
	}
}