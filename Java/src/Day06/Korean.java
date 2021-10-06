package Day06;

public class Korean {
	
// 1. 필드
	String nation = "대한민국";
	String name;
	String ssn;
	//2. 생성자
	public Korean() {
	}
	
	public Korean(String name, String ssn) {
		// 객체 선언시 생성자로부터 n, s 값을 압력받기
		this.name = name; // 생성자로부터 들어온 n을 
		this.ssn = ssn;
		// this.내부변수
	}
	// 3. 메소드
}
