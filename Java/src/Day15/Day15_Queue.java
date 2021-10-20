package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_Queue {
	
/*
 * ����3 : ����ö ����(Queue)
 * ���� 1 : �� 4�� (������ �� ��� �� ���� �� ���� �� ������)
 * ���� 2 : ��ö 3�� ��ü[���������� 3�� ��ö ���]
 * ���� 3 : ��� ��ȣ�� �޾Ƽ� �ش� ������ ����ؼ� �������� ����
 * ���� 4 : �� �� �ҿ�ð� 2��
 * 
 * �޴� : ��� ��ȣ �޴�
 * 1. ���� 2. ��� 3. ���� 4. ����
 * Ex1) 1�� ���ý� �������� ���� ���� ��ö�� ���������� �̵�
 * Ex2) ���� �ش� ���� ��ö�� ������ ���� ���
 * 
 * ��� ��
 * ------- �� ��ö�� ��Ȳ -------
 * ������ : ��ö3, ��ö4
 * ��꿪 : ��ö2
 * ���￪ : ��ö2
 * ���ο� : 
 * --------- ��� ��ȣ ---------
 * 1. ���� 2. ��� 3. ���� 4. ����
 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Station> Stationlist = new LinkedList<Station>();
		
		try {
		Subway terminal = new Subway();
		terminal.Stationlist.offer(new Station("������"));
		terminal.Stationlist.offer(new Station("��꿪"));
		terminal.Stationlist.offer(new Station("���￪"));
		terminal.Stationlist.offer(new Station("���ο�"));
		System.out.println(terminal);
		
		} catch (Exception e) {
		}
		
		while(true) {
			System.out.println("--------- ��� ��ȣ ---------");
			System.out.println("1. ���� 2. ��� 3. ���� 4. ����");
			int  ch = scanner.nextInt();
			if(ch==1) {} if(ch==2) {}
			if(ch==3) {} if(ch==4) {}
		}
	}
}