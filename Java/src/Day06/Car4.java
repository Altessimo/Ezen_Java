package Day06;

public class Car4 {
	// 1. 필드
	int gas;
	
	// 2. 생성자
	
	// 3. 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("Gas가 없습니다");
			return false;
		}
		System.out.println("Gas가 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
			System.out.println("달립니다.(Gas잔량 : " + gas + ")");
			gas-=1;
		} else {
			System.out.println("멈춥니다.(Gas잔량 : " + gas + ")");
			return;
		}
	}
	}
	// 메소드 오버로딩 : 메소드 명이 동일할 경우 인수 구분[이름, 개수, 순서]
		// void run();
		void run(int x) {
		}
		
		// 내부 클래스 호툴
		void start() {
			run();
		}
}