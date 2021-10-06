package Day06;

public class Car3 {
	
	// 1. 필드
	String company="현대자동차";
	String model; String color; int maxSpeed;
	// 2. 생성자 : 
	// 2-1. 하나 필드를 받는 생성자
	public Car3() {
	}
	// 2-2 : 하나 필드를 받는 생성자
	public Car3(String model) {
		this.model = model;
		this.color = color;
	}
	// 2-3 : 2개의 필드를 받는 생성자
	public Car3(String model, String color) {
		this.model = model;
		this.color = color;
	}
	// 2-4
	public Car3(String model, String color, int maxSpeed) {
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
}
	// 3. 메소드
}
