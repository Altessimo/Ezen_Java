package Day11;

public class Day11_1 {
	//p. 449
	// 6. 10 → 숫자로 변환 할수 없음
		// 순서도 
		// 1. main 메소드 실행 
		// 2. 03줄 / 04줄 : 배열선언 / 변수 선언 
		// 3. 05줄 : for문실행  [i는 0부터 2까지 1씩증가]
				// i = 0 일때
				// value = Integer.parseInt(strArray[0]) → 10 → 예외 발생x
		// 4. 12줄 : finally
				// 출력 10
				// i = 1 일때
				// value = Integer.parseInt( strArray[1] ) → a10 → 예외 발생o
		// 5. 10줄 : 형식 예외 캐치
				// 숫자로 변환 할수 없음
		// 6. 12줄 : finally 
				// 출력 10 [value 기존값] 
				// i = 2 일때 
				// value = Integer.parseInt(strArray[2]) → 인덱스 없음 → 예외발생 
		// 7. 08줄 : 인덱스 예외 캐치 
				// 인덱스를 초과했음 
		// 8. 12줄 : finally 
				// 출력 10 [value 기존값] 
		// 9. 반복문 종료 
	
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "54321");
		} catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
	
	// 로그인 메소드 
	//public static void login( String id , String password ) throws Exception {
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordExcption {
		if(!id.equals("blue")) {
			// ! : 부정연산자 : true → false / false → true
			throw new NotExistIDException("아이디가 존재하지 않습니다");
	} if(!password.equals("12345")) {
		throw new WrongPasswordExcption("패스워드가 다릅니다.");
	}
}
}
