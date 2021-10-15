package Day12;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {
// 1. 필드[메모리 = 저장]
	private String id;
	private String password;
	private String name;
	private String phone;
	// private 접근 제한자 : 필드를 보호 받기 위해[다른 클래스 내에서 접근 불가]
	
// 2. 생성자
	// 빈 생성자
	public Member() {	}
	
	// 모든 필드를 받는 생성자
	public Member(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
// 3. 메소드
	// 1. private 필드 사용시 get, set[외부 클래스가 접근]
	// 2. 로그인 메소드
	public void login() {
		
	}
	
	// 회원가입 메소드
	public void signup() {
		//0. 입력 객체 가져오기
		Scanner scanner = Day12_Team.scanner;
		
		// 1. 입력
		System.out.println("---------- 회원가입 페이지 ----------");
		System.out.println("아이디 : "); String id = scanner.next();
		System.out.println("비밀번호 : "); String password = scanner.next();
		System.out.println("이름 : "); String name = scanner.next();
		System.out.println("연락처 : "); String phone = scanner.next();
		
		// 2. 객체 생성
		Member member = new Member(id, password, name, phone);
		
		// * 배열에 저장
		for(int i = 0; i<Day12_Team.member.length; i++) {
			if(Day12_Team.member[i]==null) {
				Day12_Team.member[i] = member; break;
			}
		}
		
		// 3. 파일저장
			// 1. 회원별[\n], 필드별[ , ] 파일 저장
		// * 배열내 모든 객체를 파일 처리 
		try {
			for(Member temp : Day12_Team.member) {
				if(temp == null) break;
	// 1. 파일 출력 객체
		FileOutputStream fileOutputStream =
				new FileOutputStream("C:/Users/505/git/Ezen_Java/Java/src/Day12/MemberList.txt");
		// true를 쓰면 이어쓰기 = 반복문(for)을 안돌려도 O 
	// 2. 객체 내보내기[필드구분 (\n: 회원구분 , : 필드구분)]
		String outString = member.id+","+member.password+","+member.name+","+member.phone+"\n";
		fileOutputStream.write(outString.getBytes()); // 바이트 열 변환 후 쓰기
			}
			} catch(Exception e) {
		System.out.println("[알림] : 회원 DB 저장 실패 : " + e);
	}
	}
	
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
