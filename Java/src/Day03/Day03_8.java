package Day03;

import java.util.Scanner;

public class Day03_8 {
// Ȯ�ι���7 : Atm ���α׷�
	public static void main(String[] args) {
		// �����ư ������ ������ ���ѽ��� ���α׷� �� while(true)
		boolean ���� = true; // ���ѷ��� �����ϴ� ����
		int ���ݾ� = 0; //���ݾ�
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		while(����) { // [���� true ���ѷ��� ���� // ���ຯ���� false�̸� ���ѷ��� ����]
			System.out.println("          ATM             ");
			System.out.println("---------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("---------------------------------");
			System.out.println("���� > "); int ���� = scanner.nextInt();
			
			if(���� == 1) {
			System.out.println("���ݾ�>"); ���ݾ� += scanner.nextInt();
			System.out.println("[�˸�] �ԱݿϷ�");
			}
			else if(���� == 2) {
			System.out.println("��ݾ�>"); int ��ݾ� = scanner.nextInt();
			
			if(���ݾ� < ��ݾ�) {System.out.println("[�˸�] �ܰ� �����մϴ�");}
			else{���ݾ�-=��ݾ�; System.out.println("[�˸�] ��ݿϷ�");}
			}
			else if(���� == 3) {
			System.out.println("�ܰ�>"+���ݾ�);
			}
			else if(���� == 4) { // ���࿡ 4�� �Է�������
			����=false; // ���ຯ���� false �����Ͽ� ���ѷ���[while] ����
			System.out.println("[�̿����ּż� �����մϴ�]");
			}
			else { System.out.println("[���] �� �� ���� ��ȣ �Դϴ�"); }
}
	}

}
