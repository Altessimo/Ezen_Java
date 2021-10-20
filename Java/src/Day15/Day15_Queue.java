package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_Queue {
	
/*
 * 문제3 : 지하철 관제(Queue)
 * 조건 1 : 역 4개 (종점역 → 용산 → 서울 → 구로 → 종점역)
 * 조건 2 : 전철 3개 객체[종점역에서 3개 전철 대기]
 * 조건 3 : 출발 신호를 받아서 해당 역에서 출발해서 다음으로 도착
 * 조건 4 : 역 당 소요시간 2초
 * 
 * 메뉴 : 출발 신호 메뉴
 * 1. 종점 2. 용산 3. 서울 4. 구로
 * Ex1) 1번 선택시 종점역에 먼저 들어온 전철을 다음역으로 이동
 * Ex2) 만일 해당 역에 전철이 없으면 없다 출력
 * 
 * 출력 예
 * ------- 현 전철역 현황 -------
 * 종점역 : 전철3, 전철4
 * 용산역 : 전철2
 * 서울역 : 전철2
 * 구로역 : 
 * --------- 출발 신호 ---------
 * 1. 종점 2. 용산 3. 서울 4. 구로
 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Station> Stationlist = new LinkedList<Station>();
		
		try {
		Subway terminal = new Subway();
		terminal.Stationlist.offer(new Station("종점역"));
		terminal.Stationlist.offer(new Station("용산역"));
		terminal.Stationlist.offer(new Station("서울역"));
		terminal.Stationlist.offer(new Station("구로역"));
		System.out.println(terminal);
		
		} catch (Exception e) {
		}
		
		while(true) {
			System.out.println("--------- 출발 신호 ---------");
			System.out.println("1. 종점 2. 용산 3. 서울 4. 구로");
			int  ch = scanner.nextInt();
			if(ch==1) {} if(ch==2) {}
			if(ch==3) {} if(ch==4) {}
		}
	}
}