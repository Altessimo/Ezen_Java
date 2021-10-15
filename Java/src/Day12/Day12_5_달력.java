package Day12;

import java.util.Calendar;
import java.util.Scanner;

public class Day12_5_달력 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도 : "); int year = scanner.nextInt();
		System.out.println("월 : "); int month = scanner.nextInt();
		
		// 메소드 호출
		달력보기(year, month);
		}
	
	// 메소드 선언 : 접근 제한자 키워드 변환 타입 메스드 명 (인수1, 인수2, ~) { }
	public static void 달력보기 (int year, int month) {
		// 1. 캘린더 객체 선언 → new[X], 클래스 내 객체 호출
				Calendar calendar = Calendar.getInstance(); // 현재 달력
				
				// 2. 연도, 월, 일
				// int year = calendar.get(Calendar.YEAR);
				//int month = calendar.get(Calendar.MONTH)+1; // 0 : 1월 ~ 11 : 12월
				// int day = calendar.get(Calendar.DAY_OF_MONTH);
				
				// * 사용자 정의 캘린더 설정
				calendar.set(year, month-1, 1);
				
				// 해당 월의 1일 요일 찾기
				int sweek = calendar.get(calendar.DAY_OF_WEEK); // 금요일 기준으로 6
				// 해당 월의 마지막 일 찾기 : getActualMaximum(필드) : 해당 필드의 최대 값
				int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
				
				//3. 달력 출력
				System.out.println("--------------------" + year +"년 " + month + "월 --------------------");
				System.out.println("일 \t 월 \t 화 \t 수 \t 목 \t 금 \t 토");
				
				// 4. 현대 월 1일의 위치 옆에 공백 채우기
				for(int i=1; i<sweek; i++) {
					System.out.print(" \t");
				}
				
				// 5. 1일부터 마지막 날까지 출력
				for(int i=1; i<=eday; i++) {
					System.out.print(i+"\t");
					// 요일이 토요일 마다 줄마꿈[sweek가 7의 배수마다 증가]
					if(sweek % 7 == 0) System.out.println();
					sweek++; // 요일증가
					
				}
			}
	}