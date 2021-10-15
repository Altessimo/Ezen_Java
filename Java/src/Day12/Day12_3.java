package Day12;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day12_3 {

	public static void main(String[] args) {
// P.539
		// 1. Date 클래스 : 시스템 날짜 / 시간
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());

		// SimpleDateFormat : 날짜 형식(모양 꾸미기)
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");  // 형식 설정
		// 형식 적용					y : 연도		 M : 월 		d : 일 		h : 시 		m : 분		 s : 초
		System.out.println(dateFormat.format(date));
		
		// P.540
		// Calendar 클래스 : 운영체제 시간대의 날짜/시간에 대한 정보
		Calendar now = Calendar.getInstance(); // 기존에 있는 객체를 가져오기
		System.out.println("연도 : " + now.get(Calendar.YEAR));
		System.out.println("월 : " + (now.get(Calendar.MARCH)+1)); // 0~11[1열
							// + 연결 연산자 			// + 더하기 연산자
		System.out.println("일 : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 : " + now.get(Calendar.DAY_OF_WEEK));
						// 1 : 일, 2 : 월, 3 : 화, 4 : 수, 5 : 목, 6 : 금, 7 : 토
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strweek = null;
		switch(week) {
		case Calendar.SUNDAY : strweek = "일"; break;
		case Calendar.MONDAY : strweek = "월"; break;
		case Calendar.TUESDAY : strweek = "화"; break;
		case Calendar.WEDNESDAY : strweek = "수"; break;
		case Calendar.THURSDAY : strweek = "목"; break;
		case Calendar.FRIDAY : strweek = "금"; break;
		case Calendar.SATURDAY : strweek = "토"; break;
		}
		System.out.println("요일 : " + strweek);
		
		System.out.println("오전/오후 : " + now.get(Calendar.AM_PM)); // 0 : 오전, 1 : 오후
		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		if(ampm == Calendar.AM) {strampm = "오전";}
		else {strampm = "오후";}
		System.out.println("오전/오후 : " + strampm);
		System.out.println("시 : " + now.get(Calendar.HOUR));
		System.out.println("분 : " + now.get(Calendar.MINUTE));
		System.out.println("초 : " + now.get(Calendar.SECOND));
		
		// P.554 협정시계
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정시계 시간 : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 시간 : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간 : " + zonedDateTime);
	}
}