package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		
		// ���� 1 : 2���� ������ �Է¹޾� �� ū �� ���
				System.out.println("���� 1 ����1 : "); int ����1 = A.nextInt();
				System.out.println("���� 1 ����2 : "); int ����2 = A.nextInt();
				if(����1 > ����2) System.out.println("�� ū���� : " + ����1);
				else if(����1 < ����2) System.out.println(" �� ū���� : " + ����2);
				else System.out.println("�� ���� ����");
				
				// ���� 2 : 3���� ������ �Է¹޾� ���� ū �� ���
				System.out.println("���� 2 ����3 : "); int ����3 = A.nextInt();
				System.out.println("���� 2 ����4 : "); int ����4 = A.nextInt();
				System.out.println("���� 2 ����5 : "); int ����5 = A.nextInt();
				
				if(����3 > ����4 && ����3 > ����5) System.out.println("���� ū���� : " + ����3);
				else if(����4 > ����3 && ����4 > ����5) System.out.println("���� ū���� : " + ����4);
				else if(����5 > ����3 && ����5 > ����4) System.out.println("���� ū���� : " + ����5);
				else System.out.println("�� ������ ����");
				
				// ���� 3 : 4���� ������ �Է¹޾� ���� ū �� ���
				System.out.println("���� 3 ����6 : "); int ����6 = A.nextInt();
				System.out.println("���� 3 ����7 : "); int ����7 = A.nextInt();
				System.out.println("���� 3 ����8 : "); int ����8 = A.nextInt();
				System.out.println("���� 3 ����9 : "); int ����9 = A.nextInt();
				
				int max = ����6; // max ������ ù���� �� �ֱ� 
				if(max < ����7) max = ����7; // ���࿡ max ������ �ִ� ������ ũ�� max �� ����
				if(max < ����8) max = ����8;
				if(max < ����9) max = ����9;
				System.out.println("���� ū ���� : " + max);
				
				// ���� 4 : 4���� ������ �Է¹޾� ������������ ��� (ũ�� �ڷ�)
				System.out.println("���� 4 ����10 : "); int ����10 = A.nextInt();
				System.out.println("���� 4 ����11 : "); int ����11 = A.nextInt();
				System.out.println("���� 4 ����12 : "); int ����12 = A.nextInt();
				System.out.println("���� 4 ����13 : "); int ����13 = A.nextInt();
				
				int temp; // ��ȯ�� ���Ǵ� ���� ���� 
					// 1. 1���� ������ 2, 3, 4��° ���� �� = 3��
				if(����10 > ����11) {temp = ����10; ����10 = ����11; ����11 = temp;}
				if(����10 > ����12) {temp = ����10; ����10 = ����12; ����12 = temp;}
				if(����10 > ����13) {temp = ����10; ����10 = ����13; ����13 = temp;}
				
				// 2. 2���� ������ 3, 4��° ������ �� = 2��
				if(����11 > ����12) {temp = ����11; ����11 = ����12; ����12 = temp;}
				if(����11 > ����13) {temp = ����11; ����11 = ����13; ����13 = temp;}
				
				// 3. 3���� ������ 4��° ���� �� = 1��
				if(����12 > ����13) {temp = ����12; ����11 = ����13; ����13 = temp;}
				
				// 4. 4��° ������ �񱳸� 3�� ���߱� ������ �� x
				System.out.printf("�������� : %d %d %d %d \n" , ����10, ����11, ����12, ����13);
				
				// ���� 5 : 4���� ������ �Է¹޾� ��ħ�������� ���(������ �ڷ�)
				if(����10 < ����11 ) {temp = ����10; ����10 = ����11; ����11 = temp;}
				if(����10 < ����12 ) {temp = ����10; ����10 = ����12; ����12 = temp;}
				if(����10 < ����13 ) {temp = ����10; ����10 = ����13; ����13 = temp;}
				if(����11 < ����12 ) {temp = ����11; ����11 = ����12; ����12 = temp;}
				if(����11 < ����13 ) {temp = ����11; ����11 = ����13; ����13 = temp;}
				if(����12 < ����13 ) {temp = ����12; ����12 = ����13; ����13 = temp;}
				System.out.printf("�������� : %d  %d  %d  %d  \n", ����10, ����11, ����12, ����13);
				
				// ���� 6 : �α��� ������
					// [�Է�] : ���̵�� ��й�ȣ�� �Է¹ޱ�
					// [����] : ȸ�� ���̵� admin �̰� ��й�ȣ�� 1234 �� ��쿡�� �α��� ���� �ƴϸ� �α��� ���� ���
				System.out.println("�α��� ������");
				System.out.println("���̵� : "); String ���̵� = A.next();
				System.out.println("��й�ȣ : "); int ��й�ȣ = A.nextInt();
				
				if(���̵�.equals("Admin")) {
					// String �񱳽� equals �޼ҵ� ��� // ���̵� Admin ���
					if(��й�ȣ == 1234) {
						System.out.println("�α��� ����");
						return; // ���� ����� �޼ҵ�(�Լ�) ����
					} else {
					System.out.println("[�α��� ����] �н����尡 �ٸ��ϴ�.");
				}
				}
				else {
					System.out.println("[�α��� ����] �������� �ʴ� ���̵� �Դϴ�.");
	}
				
	}

}
