package Day10;

public class SmartPhone extends Phone {
			// 추상클래스 : 상속 extends
	
	public SmartPhone(String owner) {
		// this.owner = owner; 빈생성자가 있어야함. 지금 있는 생성자가 있으면 안됌
		super(owner); // Super() : 슈퍼클래스의 생성자 호출
	}
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	@Override
	public void sound() {
		
	}
}