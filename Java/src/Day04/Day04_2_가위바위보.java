package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2_���������� {
	// ����������
		// 1. ����ڷκ��� ����[0], ����[1], ��[2] �� �ϳ��� �Է¹ޱ�
		// 2. ��ǻ�ʹ� �������� ����, ����, ��[0~2] �� �ϳ� ����
		// 3. �¸��� �÷��̾� ȣ��
		// +) ���࿡ ���Ḧ �Է��ϸ� ���� ����
		// +2) ���� ����[3]�� ���� ���� �����¸�[���� ���� �̱� �÷��̾� ȣ��]
		// ������������ ����, ���� �� �������� ������
	
	public static void main(String[] args) {
		// 1. �ʿ� ���� ���� 2. Ű����� �Է� 3. ���� ���� 4. ����
		Scanner scanner = new Scanner(System.in);
		
		int p; // �÷��̾�
		int c; // ��ǻ��
		int g = 0; // ���� ���� �����ϴ� ����[while���� �ݺ� ����]
		int pw = 0; int cw = 0;
		
		while(true) {
			// 1. ����ڷκ��� �Է¹ޱ�
			System.out.println("---------- [���������� ����] ----------");
			System.out.print("����[0], ����[1], ��[2] �� ���� : ");
			p = scanner.nextInt();
			
			// 4. 3�� �Է½� ��������
			if(p == 3) {
				System.out.println(">>>>>>>>>> [��������] : ����Ƚ�� : "+ g);
				if(pw > cw) {
					System.out.println(">>>>>>>>>> [�����¸���] : �÷��̾�" + pw);
				} else if(pw < cw) {
					System.out.println(">>>>>>>>>> [�����¸���] : ��ǻ��" + cw);
				} else {
					System.out.println(">>>>>>>>>> [�����¸���] : ���º�");
				}
				break; // ���� ����� �ݺ��� Ż��
			}
			
			// 5. 0~3 �� ���� �Է½�
			if(p < 0 || p > 3) {
				System.out.println(">>>>>>>>>> [�� �� ���� ��ȣ �Դϴ� : �ٽ� �Է�]");
				continue; // ���� ����� �ݺ��� �̵�
			}
			
			// 2. ��ǻ�ͷκ��� ���� ����
			System.out.println("~~~~~~~~~~ ��ǻ�� ���� �� ~~~~~~~~~~");
			Random random = new Random(); // ���� ��ü
			c = random.nextInt(3); // 0~2 ���� ����
			System.out.println(">>>>>>>>>> ��ǻ�Ͱ� �� �� : " + c);
			
			// 3. �¸��� �Ǵ�[�÷��̾�==���� && ��ǻ��==�� �̰ų� ����, ���� �̰ų� ��, ����]
			if ((p == 0 && c == 2) || (p == 1 && c == 0) || (p == 2 && c == 1)) { // �÷��̾ �̱�� ����� ��
				System.out.println(">>>>>>>>>> �÷��̾� �¸�");
			}
			else if ((p == 0 && c == 0) || (p == 1 && c == 1) || (p == 2 && c == 2)) {
				System.out.println(">>>>>>>>>> ���º�");
			}
			else { // ��ǻ�� �¸�
				System.out.println(">>>>>>>>>> ��ǻ�� �¸�");
			}
			g++; // ���� �� ����
			
		} // while end
	} // main end
} // class end
