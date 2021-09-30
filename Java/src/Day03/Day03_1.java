package Day03;

public class Day03_1 { // c s
	
	// 컴퓨터[0, 1] : 기계어
	// 1. 컴퓨터(Java) 출력 / 입력
	// 2. 메모리[변수] 저장, 계산[연산]
	
	// P.108 제어문 : if(논리제어), switch(데이터제어)
			// 목적 : 경우의 수에 따른 코드처리
	// 예) 학생에게 1,000원을 주고 콜라 심부름
		// 1. 가장 가까운 편의점 → 콜라가 없을 경우 → false
		// 2. 다음 가까운 편의점  → 콜라가 1,200원 → false
		// 3. 다음 가까운 편의점  → 콜라 구매 → true
			// If는 다양한 갈림길이 생겼을떄 사용 // 언제 IF를 사용할지 알아야함.
		// if (A 편의점 == 콜라 && 콜라가격 ← 1,000 {구매}
		// else if(B 편의점 == 콜라 && 콜라가격 ← 1000 {구매}
		// else if(c 편의점 == 콜라 && 콜라가격 ← 1000 {구매}
		// else { 복귀 }
	
	// 예) 엘리베이터 : 버튼[if(만약에 버튼을 눌렀을지)]
	
	// IF : true, false만 제어 가능 // 비교연산자, 관계연산자
		// 형태1 : if(논리) true 실행문
		// 형태2 : if(논리) true 실행문
		// 		else false 실행문
		// 형태3 : if(논리) { 실행문; 설명문; }
		//		else { 실행문, 설명문 }
		// 형태4 : if(논리) {  }
		// 		else if(논리 2) {  }
		// 		else if(논리 3) {  }
		//		else if(논리 4) {  }
		//		else
	
	public static void main(String[] args) { // m s
		// 예1) true 이면 실행문 실행
		if(3>1) System.out.println("예1) 3이 1보다 크다"); // If는 이 문장이 세트 if(3>1)의 ;은 집어 넣지 않는다
		
		// 예2) false 이면 실행 X
		if(3>5) System.out.println("예2) 3이 5보다 크다");
		
		// 예3) ture, false이면 실행문 실행
		if(3>5) System.out.println("예3) 3이 5보다 크다");
		else System.out.println("예3) 3이 5보다 작다");
		
		// 예4) { }가 사용되는 경우 → 실행문 2개 이상일떄
		if(3>2) { // if s
		System.out.println("true이면 실행되는 자리");
		System.out.println("3이 2보다 크다");
		} // if e
		else { // if s
		System.out.println("false이면 실행되는 자리");
		System.out.println("3이 2보다 작다");
		} // if e
		
		// 예5) 다양한 경우의 수의 따른 제어
		if(3>5) System.out.println("예5) 3이 5보다 크다");
		else if(3>4) System.out.println("예5) 3이 4보다 크다");
		else if(3>3) System.out.println("예5) 3이 3보다 크다");
		else if(3>2) System.out.println("예5) 3이 2보다 크다");
		else System.out.println("true값이 없다"); // 하나의 T값을 냄
		
		// 예5_2) 
		if(3>5) System.out.println("3이 5보다 크다");
		if(3>4) System.out.println("3이 4보다 크다");
		if(3>3) System.out.println("3이 3보다 크다");
		if(3>2) System.out.println("3이 2보다 크다");
		else System.out.println("true값이 없다"); // 1개 조건에 다수 출력
		
		// P. 109 예
		int score = 93;
		// 점수가 90보다 크기 때문에 실행
		if(score >= 90) { System.out.println("점수가 90보다 큽니다"); System.out.println("등급은 A 입니다"); }
		// 점수가 90보다 미만이기 때문에 실행X
		if(score < 90) { System.out.println("점수가 90보다 작습니다"); System.out.println("등급은 B 입니다"); }
		
		// p.111 예
		int score2 = 85;
		if(score2 >= 90) { System.out.println("점수가 90보다 큽니다"); System.out.println("등급은 A 입니다"); }
		else { System.out.println("점수가 90보다 작습니다"); System.out.println("등급은 B 입니다"); }
		
		// p.112 예
		int score3 = 75;
		if(score3 >= 90) { System.out.println("점수가 100~90 입니다"); System.out.println("등급은 A 입니다"); }
		else if(score3 >= 80) { System.out.println("점수가 80~89 입니다"); System.out.println("등급은 B 입니다"); }
		else if(score3 >= 70) { System.out.println("점수가 70~79 입니다"); System.out.println("등급은 C 입니다"); }
		else { System.out.println("점수가 70 미만 입니다"); System.out.println("등급은 D 입니다"); }
	} // m e

} // c e
