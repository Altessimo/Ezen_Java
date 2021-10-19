package Day13;

import java.util.Scanner;

public class Day13_Q2 {
/*
 * 문제 2.
 * 무한루프 메뉴(스레드 3개 → 메인, 음악, 영화)
 * 1. 음악재생
 * 2. 영화재생
 * 
 * 조건 1) 1번 선택시 1초 간격으로 음악재생 출력
 * 조건 2) 2번 선택시 1초 간격으로 영화재생 출력
 * 조건 3) 음악, 영화가 실행 중 번호를 다시 선택 하면 재생 종료[
 * 
 * 출력 예
 * 1. 음악재생
 * 2. 영화재생
 * 1
 * 음악재생
 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean sw = true; // 재생여부를 확인 하는 변수
		boolean sw2 = true; // true이면 중지상태  false : 실행상태
		
		while(true) {
			System.out.println("1. 음악재생 2. 영화재생");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				Thread thread = new Music(); // music 클래스로 이동해서 시작 되는 경로를 알게 함
				
				if(sw) {
					Music.musicstop(sw); // 재생여부 확인 sw
				thread.start();
				sw=false;
				} else {
					Music.musicstop(sw);
					sw=true;
				}
				
			} else if(ch==2) {
				Thread thread = new Movie();
				
				if(sw2) {
					Movie.moviestop(sw2);
					thread.start();
					sw2=false;
				} else {
					Movie.moviestop(sw2);
					sw2=true;
				}
			}
		}
	}
}