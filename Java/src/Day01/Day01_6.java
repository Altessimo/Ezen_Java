package Day01;

import java.util.Scanner;

public class Day01_6 {
/*
 * ���� 3 : �湮�� �Է� �޾� ����ϱ�
 * [�Է¹ޱ�]
 * ---------- �湮�� --------------------------
 * | 	����	|	�̸� 		| ���� 		| ��¥	|
 * | 	1	|	��ȣ��	| �ȳ��ϼ���	| 09-28	|
 * -----------------------------------------
 */
	public static void main(String[] args) {
		// 1. �Է°�ü
		Scanner scanner = new Scanner(System.in);
		System.out.println(" �̸� : "); String name = scanner.next();
		scanner.nextLine();
		System.out.println(" ���� : "); String contents = scanner.nextLine();
		// Scanner.nextLine(); // next �������� nextLine ���� ���� �߻�
		// �ذ��� : next�� nextLine ���̿� nextLine() �߰�
		System.out.println(" ��¥ : "); String data = scanner.next();
		
		// 2. ���
		System.out.println("---------------- �湮�� ---------------");
		System.out.println("| ���� | �̸� | ���� | ��¥ |");
		System.out.println("| 1   | "+name+" | " + contents + "\t |" + data +"|");
		System.out.println("--------------------------------------");
		

	}

}
