package Day10;

public class Day10_7 {
// 예외처리 : 1. 일반예외 2. 실행 예외
	// 목적 : 다양한 오류가 발생시 → 프로그램 정상화
	// *try{} 안에서 예외발생하면 catch 예외클래스 객체에 오류 발생 정보를 저장하고 catch 실행
	// 단, 예외가 없을 경우 try {} 정상실행 후 catch {}는 실행 안함
	
	// try(예외가 발생 가능코드)
	// catch(예외클래스명 변수명) { 예외 발생시 실행되는 코드 }
	// finally {예외 있든, 없든 무조건 실행되는 코드}
	
	// 예외 클래스
	// * Exception : 예외 슈퍼클래스 = 모든 예외 저장가능
	// 1. NullPointerException : null
	// 2. ArrayIndexOutOfBoundsException : 배열
	// 3. NumberFormatException : 문자
	// ~ 등
	
	// 예외 던지기
		// 목적 : 메소드 내에서 발생한 예외를 호출한 곳으로 이동(예외 통일성)
	// 
	public static void main(String[] args) {
		// 예제 1) P. 423 : NullPointerException 예외
		try {
		String data = null; // String 객체에 null 대입
		System.out.println(data.toString()); // to String() 객체정보변환
		} catch(Exception e) {
			System.out.println("예외가 발생 했습니다. [관리자에게 문의]");
			System.out.println("예외정보 : " + e);
		} finally {
			System.out.println("** 무조건 실행되는 위치");
		}
	
		// 예제 2) ArrayIndexOutOfBoundsException 예외
		try {
		String[] 문자열배열 = new String[2]; // String 2개를 저장하는 배열 선언
		문자열배열[0] = "홍길동"; 문자열배열[1] = "유재석"; 문자열배열[3] = "강호동";
		} catch(Exception e) {
			System.out.println("배열 내 자리가 부족합니다. [관리자에게 문의]");
			System.out.println("예외정보 : " + e);
		} finally {
			System.out.println("** 무조건 실행되는 위치");
		}
		
		// 예제 3) P.426 NumberFormatException
		try {
		String data1 = "100"; // "100" → 100 (가능)
				String data2 = "a100"; // "a100" → a100 (불가능)
		System.out.println(Integer.parseInt(data1));
		System.out.println(Integer.parseInt(data2));
				// Integer : 정수 관련 클래스[정수 관련 메소드 제공]
					// .parseInt(문자) : 문자를 정수형으로 변환해주는 메소드
		} catch(Exception e) {
			System.out.println("문자가 포함 된 문자열은 정수로 변환이 불가. [관리자에게 문의]");
			System.out.println("예외정보 : " + e);
		} finally {
			System.out.println("** 무조건 실행되는 위치");
		}
	}

}
