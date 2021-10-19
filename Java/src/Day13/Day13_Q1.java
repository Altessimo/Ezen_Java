package Day13;

public class Day13_Q1 {

	/*
	 * 문제 1.
	 * 3개 스레드 선언하여 3개의 출력을 동시에 출력, 스레드 이름과 출력
	 *  1. 강아지 소리 스레드[1초간격으로 5번 출력]
	 *  2. 고양이 소리 스레드
	 *  3. 호랑이 소리 스레드
	 *  
	 *  출력 예
	 *  강아지 소리 × 5
	 *  스레드 1 이름 : 강아지 소리 스레드
	 *  고양이 소리 × 5
	 *  스레드 2 이름 : 고양이 소리 스레드
	 *  호랑이 소리 × 5
	 *  스레드 3 이름 : 호랑이 소리 스레드
	 */
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		
		dog.start();
		cat.start();
		tiger.start();
		
		try { Thread.sleep(6000); }
		catch (Exception e) { }
		
		System.out.println("강아지 스레드 : " + dog.getName());
		System.out.println("고양이 스레드 : " + cat.getName());
		System.out.println("호랑이 스레드 : " + tiger.getName());
		}
	}