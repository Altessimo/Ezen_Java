package Day10;

public class Day10_1 {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		// P. 386 확인문제
			
		printSound(new Cat());
		printSound(new Dog());
	
		dbwork(new OracleDao());
		dbwork(new MySqlDao());
		
		// 5. 익명 구현 객체
		// 인터페이스 명 병수명 = new 인터페이스 명(){구현};
		Action action = new Action() { // new Action() 의 Action 자동완성 = Ctrl+스페이스바
			
			@Override
			public void work() {
				System.out.println("복사를 합니다");
			}
		}; // 구현 끝
		// 인터페이스 실행
		action.work();
	}
}
