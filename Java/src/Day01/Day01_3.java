package Day01;

import java.util.Scanner;

public class Day01_3 {

	
	// main �޼ҵ�(�Լ�)
	public static void main(String[] args) {
		// ��� Ŭ���� : System
		System.out.println("�Է� : "); // ��� �޼ҵ� ȣ��
		
		// �Է� Ŭ���� : Scanner : Ű����� ���� �Է¹��� ���� �޸�(������ġ)�� ��ü����
		// 1. Ű����� ���� �Է¹��� ���� �޸�(������ġ)�� ��ü����
		// 2. �ٸ� ������ �Է� �� �ű��
		// 3. ���ο� �Է� �� �ޱ�
		
		// 		�Է°�ü(�ٸ���)		Ű����
		Scanner scanner = new Scanner(System.in);
		// ��ü : Ŭ���� ������� ������ �޸� ����
		// ��ü ���� : Ŭ������, ��ü ��(����) = new ������(  )
			// new : �޸� �Ҵ� ������
		// system.out : ���
		// system.out : �з�
		// ��ü���� �������� [.next() : ��ü �� ����� ���ڿ� ȣ��] ���� X
		// nextint() : ��ü �� ����� ���� ȣ��
		// nextline() : ��ü �� ����� ���ڿ� ȣ��, ���� O
		
		String string1 = scanner.next();
		// ��ü �� ����� �Է� ���� ������ ����
		System.out.println("�Էµ� ���ڿ��� : " + string1);
		
		System.out.print("�Է�2 : ");
		// �ι�° �Է°� �ҷ�����
		String string2 = scanner.next();
		// ���
		System.out.println("�Էµ� �ι�° ���ڿ��� : " + string2);

	}

}
