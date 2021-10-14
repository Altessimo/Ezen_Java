package Day11;

public class Member {
public String id;
public Member(String id) {
	this.id=id;
}
// Object 클래스 내 메소드(equals) 오버라이딩
@Override
public boolean equals(Object obj) { // 비교할 객체 인수로 받을[비교대상]
	// String 오브젝트로 들어갈 수 있음(모든 객체를 인수로 받아냄)
if(obj instanceof Member) { // instanceof : 상속 관계 확인 키워드
	// Member 클래스에 obj 포함되어 있는지 확인[true, false]
}
	Member member = (Member)obj; // 형태 변환이 (강제)가능 / ※ 괄호는 강제 변환
	// 인수의 객체를 강제 형 변환
	if(id.equals(member.id)) {
		// 시켜서 현재 클래스 내 인수와 인수의 변수 비교
		return true;
	}
	return false;
}

@Override
	public String toString() {
		return "현재 객체 내 저장된 필드는 : " + this.id;
	}
}
