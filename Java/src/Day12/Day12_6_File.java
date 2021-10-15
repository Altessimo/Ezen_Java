package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 파일 처리 클래스

public class Day12_6_File {
	// 메모리[주 기억장치=Ram] : 뱐수, 배열, 객체 등 : 프로그램 종료시 다 초기화
		// 주 기억장치 : 현재 실행중인 프로그램[명령어 집합] 기억 → 프로그램 끝나면 삭제
			// 전기 X 저장 O → 휘발성 메모리
	
		// 보조 기억장치 : [C, USB, 파일, DB 등]  외부
			// 전기 O 저장 O → 비 휘발성 메모리 → 클릭하면 삭제 되는 것
	
	// 파일 ← 스트림(단위 : 바이트) → Java 프로그램 / 문자1 → 바이트 → 문자2 → 문자1 
	
	public static void main(String[] args) throws Exception {
	// 1. FileOutputStream : 파일 출력 스트림[해당 파일이 없으면 파일 생성]
		// FileOutputStream 객체명 = new FileOutputStream("파일경로");
		// / : 경로
		// 1. write(바이트형) : 해당 파일에 쓰기
		// 이클립스(문자열) → (바이트 스트림) → 문자열
		
		// FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/Ezen_Java/Java/src/Day12/Test.txt");
		// 입출력 관련된 클래스 → 무조건 예외처리 실행
		String 문자열 = "이클립스에서 작성된 문서 입니다"; // 한글 14 *2 → 28 + 2(sp) = 30
		fileOutputStream.write(문자열.getBytes());
		
		// 2. FileInputStream : 파일 입력 스트림
		// FileInputStream 객체명 = new FileInputStream("파일경로/파일명.확장자");
		// 1. read(바이트배열) : 해당 파일을 바이트 배열에 읽기
		// FileInputStream fileInputStream = new FileInputStream("C:/java/test.txt");
		FileInputStream fileInputStream = new FileInputStream("C:/Users/505/git/Ezen_Java/Java/src/Day12/Test.txt");
		
		// 읽어온 바이트를 저장할 배열
		byte[] 바이트배열 = new byte[1024]; // 1bit[0,1] → 8bit[1byte] → 1024byte[1kb]
		fileInputStream.read(바이트배열); // 파일 읽어오기
		// System.in.read(); // 키보드 읽어오기
		// 바이트 → 문자열 변환
		String Strred = new String(바이트배열);
		System.out.println("현재 파일의 내용은 " + Strred);
	}
}