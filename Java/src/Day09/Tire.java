package Day09;

public class Tire {
 // 필드
	public int maxRotation; // 최대 회전수[타이어 수정]
	public int accumultedRoration; // 누적회전수
	public String location; // 타이어 위치
	
	// 생성자 : 객체 초기값
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	// 메소드
	public boolean roll() { // 타이어 회전 메소드
		++accumultedRoration; // 누적 회전수 증가
		if(accumultedRoration < maxRotation) { // 최대 회전 수 더 크면
			System.out.println(location + "Tire 수명 : "
					+ (maxRotation-accumultedRoration) + "회"); // 남은 수면 출력
			return true; // true 수명이 남음을 표시하는 반환
		} else { // 최대 회전수가 더 적으면
			System.out.println("***" + location + "Tire 펑크 ***");
			return false; // false 수명이 없음을 표시하는 변환
		}
	}
}
