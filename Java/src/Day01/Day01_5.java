package Day01;

import java.util.Scanner; //

public class Day01_5 {
// ���� 2 : 1���� ȸ������ ǥ �����
	/*
	 * [�Էº���]
	 * ���̵�, ��й�ȣ, ����, �̸��� �Է¹޾� ����ϱ�
	 * ���̵�		��й�ȣ	����		�̸���
	 * qwe		1234	���缮	indanja@kakao.com
	 */
	public static void main(String[] args) {
		// �Է°�ü �����
		Scanner �Է°�ü = new Scanner(System.in);
		// 2. �Է¹��� ���� ����/��ü ����(�ű��)
		System.out.println(" ȸ������ ���̵� : "); String ���̵� = �Է°�ü.next();
		System.out.println(" ȸ������ ��й�ȣ : "); String ��й�ȣ = �Է°�ü.next();
		System.out.println(" ȸ������ ���� : "); String ���� = �Է°�ü.next();
		System.out.println(" ȸ������ �̸��� : "); String �̸��� = �Է°�ü.next();
		
		// ���
		System.out.println(">>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� <<<<<<<<<");
		System.out.println("���̵�/t��й�ȣ/t����/t�̸���");
		System.out.println(���̵�+"\t"+��й�ȣ+"/t"+����+"\t"+�̸���);

	}

}
