package Day06;

public class Car5 {
// 1. 필드 [데이터 저장]
	String model;
	int speed;
// 2. 생성자 [데이터 초기값]
	public Car5(String model) {
		// 외부로부터 들어온 데이터 : 인수를 내부 변수에 저장
		// model = model;// [내부인수 == 인수변수] : 충돌!! /컴퓨터가 스스로 인식을 못함
		this.model = model; // [this.내부변수=인수변수]
		// 인수는 내부변수와 이름을 동일하게 선언
	}
// 3. 메소드 [데이터 행동]
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		for(int i = 10; i<=50; i+=10) {
			this.setSpeed(i); // 내부 클래스에는 메소드 바로 호출 가능
			System.out.println(this.model+"가 달립니다.(시속 : "+ this.speed + "km/h)");
		}
	}
}
