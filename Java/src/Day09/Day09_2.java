package Day09;

public class Day09_2 {

	public static void main(String[] args) {
		// 1. 자동차 객체 생성
		Car car = new Car();
		
		// 2. 자동차 5번 전진
		for(int i = 1; i<=5; i++) {
			int problemLocation=car.run();
			// Car 하면 메소드 호출해서 반환을 변수에 저장
			switch(problemLocation) {
			case 1 :
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.forontLeftTire = new HankookTire(15, "앞왼쪽");
				break;
				
			case 2 :
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire(13, "앞오른쪽");
				break;
				
			case 3 :
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire(14, "뒤왼쪽");
				break;
				
			case 4 :
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire(17, "뒤오른쪽");
				break;
			}
			System.out.println("------------------------------------");
		}
	}

}