package Day05;

import java.util.Scanner;

public class Day05_2 {
// P 181 확인문제
	// 1.
		// 힙 : 변수 내 실제 값
		// 스택 : 변수 이름 저장 / ex) int name = 100 스택 / 100은 힙이라는 주소에 저장
		// 3) ==, != 주소값 비교 [객체내용을 비교 X]
			// .equals[겍체 내용을 비교 O]
	// 2.
		// 1. 프로그램 종료시 메모리 초기화
		// 3. 참조되지 않는 객체는 자동소멸
	// 3.
		// 2. 문자열 동일해도 객체가 다를 수 있기 떄문에  = 는 사용하면 X
	// 5. boolean 타입 배열의 초기값은 false
		// 정수 = 0, 실수 = 0.0, 논리 = false, 문자열[객체] = null
	// 6. 배열명.length : 행길이, 배열명[행].length : 해당 행의 열 길이
	
	public static void main(String[] args) {
		// 7.배열 내 모든 인덱스에 접근하기 위해서 for 활용
		int max=0;
		int[] array = {1,5,3,8,2};
		for(int i=0; i<array.length; i++) { // i는 인덱스 0부터 4까지 1씩 증가하면서 반복
			if(array[i] > max) max = array[i] // i번째 인덱스 값이 max 보다 크면 max에 1번째 인덱스 값 넣기
		}
		System.out.println("max : " + max);

		// 8. 배열 내 모든 인덱스에 접근하기 위해서 for 활용
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum=0;
		double avg=0.0;
		
		int count = 0; // 점수 갯수
		// 행 i 반복
		for(int i=0; i<array.length; i++) {
			// 열 j 반복
			for(int j=0; j<array[j].length; j++) {
				// 해당 인덱스 값 가져와서 sum 누적 합계 더하기
				sum += array[i][j];
			}
			count+=array[i].length; // 2+3+5
		}
		avg = (double)sum / count;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		// 9.
		boolean run = true; // while문 무한루프 제어 변수
		int studentNum=0; // 학생 수 → 배열의 길이
		int[] scores=null; // 학생점수 배열(초기값은 null 공백)
		Scanner scanner = new Scanner(System.in); // 입력객체
		// 자료형은 선언시(만들때)에 사용
				
		// while(true) → 변수, while(run) → 
				while(run) { // 무한루프 5번 입력하면 무한루프 종료
					System.out.println("--------------------------------------------------");
					System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
					System.out.println("--------------------------------------------------");
					System.out.println("선택> ");
					
					int selectNo = scanner.nextInt();
					
					if(selectNo==1) {
						System.out.println("학생수 : "); studentNum=scannre.nextInt();
						scores = new int[studentNum]; // 입력받은 정수만큼 배열길이 할당
					} else if(selectNo==2) {
						// 배열 내 할당한 모든 인덱스에 값 넣기 → for
						for(int i=0; i<studentNum; i++) {
							System.out.println("Scores[" + i + "] :");
							scores[i] = scanner.nextInt(); // 입력받은 값을 i번째에 저장 
						}
					} else if(selectNo==3) {
						for(int i=0; i<studentNum; i++) {
							System.out.println("Scores[" + i + "] :" + scores[i]); // i번째 인덱스 값 출력 
						}
					} else if(selectNo==4) {
						int max =0; int sum=0; double avg = 0.0;
						for(int i=0; i<studentNum; i++) {
						if(scores[i] > max) max = scores[i]; // i번째 인덱스 값이 max 보다 크면 max에 i번째 인덱스 값 넣기
								sum+=scores[i]; // i번째 인덱스 값을 sum 에 누적합계 
					}
					avg=(double)sum/studentNum;
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
				}
					else if(selectNo==5) {
						run = false;
					} 
				}
				System.out.println("프로그램 종료");
	}
}
