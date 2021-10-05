package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_4_Board_Class {
/* 1. 서로 다른 자료형을 하나로 묶기
 * 
 */
	public static void main(String[] args) {
		// 2. 작성한 클래스로 배열 선언
		Board[] boards = new Board[100];
		
		// 1. 무한루프
				while(true) {
					System.out.println("\n\n - 커뮤니티 -");
					System.out.printf("%2s \t %10s \t %5s \t %5s %3s\n","순번","제목", "작성자", "작성일", "조회수");
					// 배열 내 모든 인덱스 출력
					for(int i=0; i<boards.length; i++) {
						if(boards[i] != null) { // 해당 인덱스의 객체가 없으면
							System.out.printf("%2d \t %10s \t %5s \t %5s %3s\n",
									i, boards[i].title, boards[i].writer,
							boards[i].Date, boards[i].count);
							// .을 찍으면 객체 접근이 가능
						}
					}
					System.out.println("-------------------------------------------------------");
					System.out.println("1. 글쓰기 2. 글 상세 보기 >> 선택"); int ch = scanner.nextInt();
					
					if(ch==1) {
						System.out.println(">>> 게시물 쓰기 <<<");
						scanner.nextLine(); // nextLine의 문제보안
						System.out.println("제목 : "); String title = scanner.nextLine();
						System.out.println("내용 : "); String contents = scanner.nextLine();
						System.out.println("작성자 : "); String writer = scanner.nextLine();
						
						// 현재 날짜 클래스
						Date now = new Date(); //  현재 시스템의 날짜, 시간 객체
						// 날짜 형식 클래스(날짜 형식 변경하기)
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd"); // ※ d 대문자로 하면 월 구분이 없음
						String date = dateFormat.format(now); // 현재 날짜
						
						// 조회수
						// String count = "1";
						
						// 모든 변수를 빈공간 배열에 저장
						for(int i=0; i<boards.length; i++) {
							
							if(boards[i]==null) { // 해당 인덱스의 객체가 없으면
								Board board = new Board(); // 게시물 객체 생성
								// 게시물 객체 내용 채우기
								board.title=title; board.contents = contents;
								board.writer = writer; board.date = date; board.count = 1;
								
								boards[i] = board; // 해당 인덱스에 게시물 쪽에 넣기
								break;
							}
						}
					}
					if(ch==2) {
						System.out.println(">>> 게시물 번호 선택 : "); int ch2 = scanner.nextInt();
						boards[ch2].count++;
						
						System.out.println("- 게시물 상세페이지 -");
						System.out.println(">>> 제목 : " + boards[ch2].title);
						System.out.println(">>> 작성자 : " + boards[ch2].writer +
								"\t 작성일 : "+ boards[ch2].Date + "\t 조회수 : " + boards[ch2].contents);
						System.out.println(">>> 내용 : " + boards[ch2].contents);
						System.out.println("------------------------------------------------------");
					}
				}
	}

}
