
// �ּ� : ����ޱ� �� ������[�����] ����

package Day02; // ���� Ŭ������ ���� ��Ű�� ��

import java.util.Scanner;

// java�� 100% ��ü���� ���!

public class Day02_1 { // Class start
	// public : ����������
	// class : Ŭ���� ����� ���Ǵ� Ű����[�̸� ������� �ܾ�]
		// Ŭ������[����] : ù ���ڸ� �빮��(����)
	// { : ����  } : �� 

	
	// �ڵ��ϼ� ����Ű : Ctrl + �����̽���
	// main + �ڵ��ϼ�
	public static void main(String[] args) { // main start
		// main �޼ҵ忡�� main ������ ����[������ : �ڵ带 �о��ִ� ����]
		// main �޼ҵ� ��ȣ �ۿ� �ִ� �ڵ�� ���� �Ұ�
		// syos + �ڵ��ϼ�
		System.out.println("Java");
		
		// 1. �Է°�ü ����[Ű����κ��� �Է¹��� ���� �����ϴ� ��ü]
		Scanner A = new Scanner(System.in);
		// 2. next() �޼ҵ带 �̿��� ��ü �� �Է� �� ������
		String ���ڿ� = A.next();
		// 3. ���[+ : ���� ������(����+���� ����)]
		System.out.println("�Է� ���� : " + ���ڿ�);
		// " " : ����ó�� : Ű����[�̸� ������� �ܾ�], ��ü, Ŭ������, ����, ���� �� ����

	} // main start

} // class end
