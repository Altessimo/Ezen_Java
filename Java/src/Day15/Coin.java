package Day15;

public class Coin {
	
	// 필드
	private int value;
	
	// 생성자
	public Coin(int value) { // 문자로 할 경우 : String
		this.value = value;
	}
	
	// 메소드
	public int getValue() {
		return value;
	}
	
	// 오버라이드(메소드)
	@Override
		public String toString() {
			return this.value + "";
		}
}