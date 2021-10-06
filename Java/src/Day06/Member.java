 package Day06;

public class Member {
// P.279 문제 13.
	String name;
	String id;
	String password;
	int age;
	
// 문제 14.
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
// 문제 15. 메소드(로그인, 로그아웃
	// 1. 로그인 메소드[인수 : id, password 변환 : true]
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("1234")) {
			return true; // 동일할경우 true 리턴
		} else {
			return false; // 동일하지 않을경우 fasle 리턴
		}
	}
	// 2. 로그아웃 메소드(인수 : id, 변환 X)
	void logout(String id) {
		System.out.println(id + "님 로그아웃 되었습니다");
	}
}
