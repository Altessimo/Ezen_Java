package Day13;

import java.util.Scanner;

public class Day13_Q2 {
/*
 * ���� 2.
 * ���ѷ��� �޴�(������ 3�� �� ����, ����, ��ȭ)
 * 1. �������
 * 2. ��ȭ���
 * 
 * ���� 1) 1�� ���ý� 1�� �������� ������� ���
 * ���� 2) 2�� ���ý� 1�� �������� ��ȭ��� ���
 * ���� 3) ����, ��ȭ�� ���� �� ��ȣ�� �ٽ� ���� �ϸ� ��� ����[
 * 
 * ��� ��
 * 1. �������
 * 2. ��ȭ���
 * 1
 * �������
 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean sw = true; // ������θ� Ȯ�� �ϴ� ����
		boolean sw2 = true; // true�̸� ��������  false : �������
		
		while(true) {
			System.out.println("1. ������� 2. ��ȭ���");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				Thread thread = new Music(); // music Ŭ������ �̵��ؼ� ���� �Ǵ� ��θ� �˰� ��
				
				if(sw) {
					Music.musicstop(sw); // ������� Ȯ�� sw
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