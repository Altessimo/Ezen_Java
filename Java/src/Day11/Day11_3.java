package Day11;

public class Day11_3 {
// System 클래스[모든 맴버가 static이기 때문에 객체 필요없음]
// System.out.println(); static(객체 없이 사용되는 언어)
	
	public static void main(String[] args) {
		/* 1. exit : 프로그램 종료
		System.setSecurityManager(new SecurityManager() {
		@Override
		public void checkExit(int status) {
			if(status !=5) {
				throw new SecurityException();
				// i는 0일 떄 static = 0 true → 예외 발생
				// i는 1일 떄 static = 1 true → 예외 발생
				// ~
				// i가 5일 떄 static = 5 false → 예외 발생 X
			}
		}
		});
		
		for(int i = 0; i<10; i++) { // i는 0~9까지 i씩 증가
			System.out.println(i); // 출력
			try {
				System.exit(i); // i를 exit() 넣기[i가 5일떄 예외가 없기 때문에 exit 실행]
			} catch(Exception e) { }
		}
		*/
		
		// 2. for문이 1000000회 실행 했을때 걸리는 시간
		// 1. 시작시간
		long time1 = System.nanoTime();
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum+=1;
		}
		// 2. 끝나는 시간
		long time2 = System.nanoTime();
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("걸린시간 : "+(time2-time1)+" 나노초 ");
		System.out.println(System.nanoTime());
		
		// 3. 시스템 정보 읽기[System.getProperty("호출키")]
		System.out.println("Pc Os : " + System.getProperty("os.name"));
		System.out.println("Pc 사용자 이름 : " + System.getProperty("user.name"));
		System.out.println("Pc 사용자 폴더 위치 : " + System.getProperty("user.home"));
		
		
	}
}
