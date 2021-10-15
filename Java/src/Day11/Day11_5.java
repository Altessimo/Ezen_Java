package Day11;

import java.io.IOException;

public class Day11_5 {
	
	/*
	 * 2021.10.14. 도서검색 프로그램
	 * 1. 조건 도서 목록 배열 선언
	 * [4개의 도서를 배열에 등록]
	 * 1. 된다! 네이버 블로그 & 포스트
	 * 2. 스프링 부트 실전 활용 마스터
	 * 3. Tucker의 Go 언어 프로그래밍
	 * 4. 혼자 공부하는 C언어
	 * 	1-1. scanner → System.in.read() 사용
	 * 	2. 검색기능 : 검색을 입력받아 검색한 단어가 포함된 도서를 모두 출력하기
	 * 	3. 수정기능 : 수정할 도서를 입력받아 선택 후 교체할 단어와 새로운 단어 입력받아 교체
	 */
	
	public static void main(String[] args) throws IOException {
		// 0. 준비물 
		String [] 도서목록 = {"된다! 네이버 블로그 & 포스트", "스프링 부트 실전활용 마스터",
	             "Tucker의 Go 언어 프로그래밍", "혼자 공부하는 C언어"};
	       
	       // 키보드로부터 바이트를 읽어올때 /r/n 포함 
	       
		// 메뉴
	       while(true) {
	          System.out.println("1. 검색 | 2. 수정");
	          
	          byte[] b = new byte[100];  // 키보드로부터 받을 바이트 배열 선언
	       // 입력[키보드=바이트] 받기 → 바이트 배열 // 넉넉히 100 바이트[영문이면 1바이트, 한글이면 2바이트]
	          int count = System.in.read(b); // 1. 무조건 예외 발생[1. 던지기, 2. try]
	             
	          	// 입력문자수 + 2[\n , \r ]
	            // 키보드로부터 바이트르 받아 배열에 저장
	          String ch = new String(b ,0, count-2); // 바이트 → 문자열
	                         // 0부터 입력한 문자수까지 변환
	          				// 100바이트 모두 문자열 변환
	          
	          if(ch.equals("1")) { // equals : 도서명 모두 일치했을 경우
	             System.out.println("검색 도서 : "); 
	             int count2 = System.in.read(b);
	                // 입력문자수 + 2[\n , \r ]
	                // 키보드로부터 바이트르 받아 배열에 저장
	             String book = new String(b , 0 , count2-2); // 바이트 → 문자열
	                            // 0부터 입력한 문자수까지 변환
	             // 도서검색[책장=배열] => 모든 책장 검색 => for
	             for(int i = 0 ; i<도서목록.length; i++) {
	                if(도서목록[i].contains(book)) { // contains 도서명이 포함된 경우
	                  System.out.println(i + "번  " + 도서목록[i]); 
	                }
	             }
	          } else if(ch.equals("2") ) {
	             System.out.println("검색 도서 : "); 
	             int count2 = System.in.read(b);
	                // 입력문자수 + 2[\n , \r ]
	                // 키보드로부터 바이트르 받아 배열에 저장
	             String book = new String(b , 0 , count2-2); // 바이트 → 문자열
	                            // 0부터 입력한 문자수까지 변환
	             // 도서검색[책장=배열] → 모든 책장 검색 → for
	             for(int i = 0 ; i<도서목록.length; i++) {
	                if(도서목록[i].contains(book)) {
	                  System.out.println(i + "번  " + 도서목록[i]); 
	                }
	             }
	             
	             // 수정할 도서번호 [ 인덱스 ]  e
	             System.out.println("수정 할 도서번호 : "); 

	             int count3 = System.in.read(b);
	             int index = Integer.parseInt(new String(b , 0 , count3-2));
	             
	             System.out.println("변경할 문자 : ");
	             count3 = System.in.read(b);
	             String oldbook = new String(b , 0 , count3-2); // 바이트 → 문자열
	             
	             System.out.println("새로운 문자 : ");
	             count3 = System.in.read(b);
	             String newbook = new String(b , 0 , count3-2); // 바이트 → 문자열
	             
	             // 치환(replace)
	             도서목록[index] = 도서목록[index].replace(oldbook, newbook);
	          }
	       }
	}
}

/*
 * ※ 중요 사실
 * 입력 받기[키보드=바이트] 받기
 * 입력문자수 + 2 [\n, \r ]
 * 
 */