package Day12;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day12_3 {

	public static void main(String[] args) {
// P.539
		// 1. Date Ŭ���� : �ý��� ��¥ / �ð�
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());

		// SimpleDateFormat : ��¥ ����(��� �ٹ̱�)
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");  // ���� ����
		// ���� ����					y : ����		 M : �� 		d : �� 		h : �� 		m : ��		 s : ��
		System.out.println(dateFormat.format(date));
		
		// P.540
		// Calendar Ŭ���� : �ü�� �ð����� ��¥/�ð��� ���� ����
		Calendar now = Calendar.getInstance(); // ������ �ִ� ��ü�� ��������
		System.out.println("���� : " + now.get(Calendar.YEAR));
		System.out.println("�� : " + (now.get(Calendar.MARCH)+1)); // 0~11[1��
							// + ���� ������ 			// + ���ϱ� ������
		System.out.println("�� : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("���� : " + now.get(Calendar.DAY_OF_WEEK));
						// 1 : ��, 2 : ��, 3 : ȭ, 4 : ��, 5 : ��, 6 : ��, 7 : ��
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strweek = null;
		switch(week) {
		case Calendar.SUNDAY : strweek = "��"; break;
		case Calendar.MONDAY : strweek = "��"; break;
		case Calendar.TUESDAY : strweek = "ȭ"; break;
		case Calendar.WEDNESDAY : strweek = "��"; break;
		case Calendar.THURSDAY : strweek = "��"; break;
		case Calendar.FRIDAY : strweek = "��"; break;
		case Calendar.SATURDAY : strweek = "��"; break;
		}
		System.out.println("���� : " + strweek);
		
		System.out.println("����/���� : " + now.get(Calendar.AM_PM)); // 0 : ����, 1 : ����
		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		if(ampm == Calendar.AM) {strampm = "����";}
		else {strampm = "����";}
		System.out.println("����/���� : " + strampm);
		System.out.println("�� : " + now.get(Calendar.HOUR));
		System.out.println("�� : " + now.get(Calendar.MINUTE));
		System.out.println("�� : " + now.get(Calendar.SECOND));
		
		// P.554 �����ð�
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("�����ð� �ð� : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� �ð� : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� �ð� : " + zonedDateTime);
	}
}