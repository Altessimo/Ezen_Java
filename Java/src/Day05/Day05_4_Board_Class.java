package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_4_Board_Class {
/* 1. ���� �ٸ� �ڷ����� �ϳ��� ����
 * 
 */
	public static void main(String[] args) {
		// 2. �ۼ��� Ŭ������ �迭 ����
		Board[] boards = new Board[100];
		
		// 1. ���ѷ���
				while(true) {
					System.out.println("\n\n - Ŀ�´�Ƽ -");
					System.out.printf("%2s \t %10s \t %5s \t %5s %3s\n","����","����", "�ۼ���", "�ۼ���", "��ȸ��");
					// �迭 �� ��� �ε��� ���
					for(int i=0; i<boards.length; i++) {
						if(boards[i] != null) { // �ش� �ε����� ��ü�� ������
							System.out.printf("%2d \t %10s \t %5s \t %5s %3s\n",
									i, boards[i].title, boards[i].writer,
							boards[i].Date, boards[i].count);
							// .�� ������ ��ü ������ ����
						}
					}
					System.out.println("-------------------------------------------------------");
					System.out.println("1. �۾��� 2. �� �� ���� >> ����"); int ch = scanner.nextInt();
					
					if(ch==1) {
						System.out.println(">>> �Խù� ���� <<<");
						scanner.nextLine(); // nextLine�� ��������
						System.out.println("���� : "); String title = scanner.nextLine();
						System.out.println("���� : "); String contents = scanner.nextLine();
						System.out.println("�ۼ��� : "); String writer = scanner.nextLine();
						
						// ���� ��¥ Ŭ����
						Date now = new Date(); //  ���� �ý����� ��¥, �ð� ��ü
						// ��¥ ���� Ŭ����(��¥ ���� �����ϱ�)
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd"); // �� d �빮�ڷ� �ϸ� �� ������ ����
						String date = dateFormat.format(now); // ���� ��¥
						
						// ��ȸ��
						// String count = "1";
						
						// ��� ������ ����� �迭�� ����
						for(int i=0; i<boards.length; i++) {
							
							if(boards[i]==null) { // �ش� �ε����� ��ü�� ������
								Board board = new Board(); // �Խù� ��ü ����
								// �Խù� ��ü ���� ä���
								board.title=title; board.contents = contents;
								board.writer = writer; board.date = date; board.count = 1;
								
								boards[i] = board; // �ش� �ε����� �Խù� �ʿ� �ֱ�
								break;
							}
						}
					}
					if(ch==2) {
						System.out.println(">>> �Խù� ��ȣ ���� : "); int ch2 = scanner.nextInt();
						boards[ch2].count++;
						
						System.out.println("- �Խù� �������� -");
						System.out.println(">>> ���� : " + boards[ch2].title);
						System.out.println(">>> �ۼ��� : " + boards[ch2].writer +
								"\t �ۼ��� : "+ boards[ch2].Date + "\t ��ȸ�� : " + boards[ch2].contents);
						System.out.println(">>> ���� : " + boards[ch2].contents);
						System.out.println("------------------------------------------------------");
					}
				}
	}

}
