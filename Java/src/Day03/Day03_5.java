package Day03;

import java.util.Scanner;

public class Day03_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �ݺ����� ����� ���
		
		// ���� 1. �Է¹��� ������ŭ �� ��� [ i�� 1���� �Է¹��� �������� 1�� ���� ]
		System.out.println("�� ���� : ");  int s = scanner.nextInt();
		for(int i = 1; i <=s; i++) { System.out.println("* "); }
		System.out.println("\n ----------------------------");
		
		// ���� 2. �Է¹��� ������ŭ �� ��� // 5������(5���) �� �ٲ�
		System.out.println("�� ���� : ");  int s2 = scanner.nextInt();
		for(int i = 1; i <= s2; i++) {
			System.out.println("* ");
			if(i%5 == 0) System.out.println();
		}
		System.out.println("\n ----------------------------");
		
		// ���� 3.
		System.out.println("����3) �� �� : ");  int line3 = scanner.nextInt();
		// �ټ��� 1���� �Է¹��� �� ��(line) ���� 1�� �����ϸ鼭 ������
		for(int i = 1; i<=line3; i++) {
			// �� �ٲ� �ϱ����� �����
			for(int s3 = 1; s3<=i; s3++) { System.out.print("*"); }
			// �ٹٲ�
			System.out.println();
		}
		System.out.println("\n ----------------------------");
		
		// ���� 4.
System.out.print("����4) �� �� : "); int line4 = scanner.nextInt();
		
		for(int i = 1; i<=line4; i++) {
			// ����� 
			for(int s4 = 1; s4<=line4-i+1; s4++) { System.out.print("*"); }
			// �ٹٲ�
			System.out.println();
		}
		
	System.out.println("\n ----------------------------");	
		// ����5)
		System.out.print("����5) �� �� : "); int line5 = scanner.nextInt();
		for(int i = 1; i<=line5; i++) {
			// ������� 
			for(int b = 1; b<=line5-i; b++) { System.out.print(" "); }
			// ����� 
			for(int s5 = 1; s5<=i; s5++) { System.out.print("*");}
			// �ٹٲ�
			System.out.println();
		}
		
		// ����6)
		System.out.print("����6) �� �� : "); int line6 = scanner.nextInt();
		for(int i = 1; i<=line6; i++) {
			// �������
			for(int b = 1; b<=i-1; b++) { System.out.println(" ");}
			// �����
			for(int s6 = 1; s6<=line6-i+1; s6++) { System.out.println("*");}
			// �ٹٲ�
			System.out.println();
		}
			System.out.println("\n ----------------------------");
			
		// ����7)
			System.out.print("����7) �� �� : "); int line7 = scanner.nextInt();
			for(int i = 1; i<=line7; i++) {
				//�������
				for(int b = 1; b<=line7-i; b++) {System.out.print(" ");}
				//����� 
				for(int s6 = 1; s6<=i*2-1; s6++) {System.out.print("*");}
				//�ٹٲ�
				System.out.println();
			}
			System.out.println("\n ----------------------------");
			
		// ����8)
			System.out.print("����8) �� �� : "); int line8 = scanner.nextInt();
			for(int i = 1; i<=line8; i++) {
				//�������
				for(int b = 1; b<=line8-i; b++) { System.out.print(" "); }
				//����� 
				for(int s7 = 1; s7<=i*2-1; s7++) { System.out.print(i); }
				//�ٹٲ�
				System.out.println();
			}
			System.out.println("\n ----------------------------");
			
		// ����9)
			System.out.print("����9) �� �� : "); int line9 = scanner.nextInt();
			for(int i = 1; i<=line9; i++) {
				for(int b = 1 ; b<=i-1 ; b++) { System.out.print(" "); }
				for(int s8 = 1 ; s8<=line9*2-(i*2-1); s8++) { System.out.print("*"); }
				System.out.println();
	}
			System.out.println("\n ----------------------------");
}
	}