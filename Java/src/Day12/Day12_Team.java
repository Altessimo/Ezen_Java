package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_Team {
/*
 * 로그인, 회원가입 프로그램[파일처리]
 * 조건 : 회원가입 시 회원정보 파일에 저장
 * 	회원클래스 : 아이디, 비밀번호, 성명, 연락처
 * 조건 : 로그인 시 파일 내 회원 정보가 존재하면 로그인 성공
 * 
 * 1. 입력 받기 → 2. 객체 생성 → 3. 파일쓰기[output] : 필드 
 * 주의! : 1. 회원구분 2. 회원 1명당 필드 구분
 * 
 * Scanner는 main에 만들기
 */

//0. 설정 [main 메스드 밖에 선언하는 이유 : 다른 클래스나 메소드가 접근 할 수 있도록]
	
public static Scanner scanner = new Scanner(System.in);
// [static을 사용하는 이유 : main 메소드처럼 메모리 우선 할당]
public static Member[] member = new Member[100];
	
	public static void main(String[] args) {
		
		// 파일에 저장된 회원 가져오기 → 배열에 저장
		
	while(true) {
		Member temp = new Member(); // 빈 공간을 쓰는 이유 : 메소드 호출 하기 위해서
		temp.signup();
}
	}
}
