package Day04;

import java.util.Scanner;

public class Day04_Q2_ȸ�����湮�� {
	/*
	 * 2. ȸ���� �湮�� ���α׷�
	 *  [����1] : �ִ� 100���� ������ �� �ִ� ȸ�� �迭[���̵�, ��й�ȣ]
	 *  [����2] : �ʱ�޴�
	 *   	1. �α���
	 *   	2. ȸ������
	 *  [ȸ�������� �������� ��]
	 *  	1. ���̵�� ��й�ȣ�� �Է¹޾� �迭�� ����
	 *  	2. ���̵� �ߺ� �Ұ�[�迭�� ���� ���̵� �����ϸ� ȸ������ ����]
	 *  [�α����� ���� ���� ��]
	 *  	1. ���̵�� ��й�ȣ�� �Է¹޾� �迭 �� �����ϸ� �α��� ���� // �ƴϸ� ����
	 *  [�α��� ������ �޴�]
	 *  	1. �湮�� ����
	 *  	2. ��� �湮�� Ȯ��
	 *  	3. �α׾ƿ�
	 *  [�湮�� ����� ����������]
	 *  	������ �Է¹޾� �迭�� ����(����� �ۼ��� ���̵� ����)
	 *  	���� �Է� �� �� ���� �湮�� ��� ���
	 *  [�α׾ƿ�]
	 *  	�ʱ�޴��� ���ư���
	 */
	public static void main(String[] args) {
		// 0. �Է°�ü
		Scanner scanner = new Scanner(System.in);
		
		// 1. ȸ�� 100��[ID, PW]�� �����ϴ� ��� ����
		String[][] ȸ����� = new String[100][2]; // 2���� �迭 ��� / 100�� * 2�� �� 200ĭ / 100�� ID, 2�� Pw
		// 1-1. �湮�� 100��(contents, writer) �����ϴ� ��� ����
		String[][] �湮�� = new String[100][2];
		
		// 2. �޴� �� �޴��� ��� �ݺ����� : ���ѷ���(while)
		while(true) {
			System.out.println("\n\n\t ~ ȸ���� �湮�� ���α׷� ~");
			System.out.println("--------------------------------------");
			System.out.print("[ 1. ȸ������ 2. �α��� ���� : ");
			int ch = scanner.nextInt();
			
			//3. �Է¿� ���� �� ����
			switch(ch) { // if�ε� ������
			case 1 :
				System.out.println("- ȸ������ ������");
				System.out.println("ID : "); String id = scanner.next();
				System.out.println("Password : "); String pw = scanner.next();
				
				// Id �ߺ�üũ(��� �迭 �� �ε����� �����ؼ� ������ ���̴ٰ� �ִ��� Ȯ��)
				boolean idchck = true; // �ߺ�üũ ����
				for(int i = 0; i<ȸ�����.length; i++) {
								// ȸ�����.length : �迭�� ���α��� = 100 / new String[100][2]; 100���� �����߱� ����
					if(ȸ�����[i][0] != null && ȸ�����[i][0].equals(id)) { // i��° id�� �����ϸ�
						System.out.println("[�˸�] : �ߺ��� ���̵� ���� �մϴ�.");
						idchck = false;
						break; // �ߺ�ã�� for ����
					}
			}
			// �ߺ�üũ ������ true�̸� �迭 �� �� ������ ã�Ƽ� ����
				// �迭�� ����
			if(idchck) {
				for(int i=0; i<ȸ�����.length; i++) {
					if(ȸ�����[i][0] == null) { // i��°�� �����̸� 
						ȸ�����[i][0] = id; ȸ�����[i][1] = pw;
						System.out.println("[�˸�] : ȸ�������� �Ǿ����ϴ�");
						break;
					}
					}
			}
			case 2 :
				System.out.println("- �α��� ������");
				// 1. �Է� �� ����
				System.out.println("ID : "); String logid = scanner.next();
				System.out.println("Password : "); String logpw = scanner.next();
				// 2. �迭 ������ �Է��� ���̵�� �н����尡 �����ϴ��� Ȯ�� �� �����ϸ� �α��� ����
				// for���� �̿��� ��� �ε����� �����ؼ� �ϳ��� ��
				
				boolean logincheck = true;
				for(int i=0; i<ȸ�����.length; i++) {
					if(ȸ�����[i][0] != null &&
							ȸ�����[i][0].equals(logid) &&
							ȸ�����[i][1].equals(logpw)) {
						System.out.println("[�˸�] : �α��� ����");
						// �α��� ������ �޴� ��
						while(true) { // ȸ���޴� ���ѷ���
							System.out.println("\n\n\t ~ ȸ����� ~");
							System.out.print("[ 1. �湮�� 2. �α׾ƿ� ���� : ");
							int ch2 = scanner.nextInt();
							
							if(ch2==1) {
								scanner.nextLine(); // nextLine ���� �ذ�
								System.out.println("�湮�� ���� :");
								String contents = scanner.nextLine(); // nextInt�� nextLine�� "scanner.nextLine();" ������ �Բ� �νĵ�
								// �湮�� �迭 �� �� ������ ã�Ƽ� ����� �α��� �� ���̵� ����
								for(int j=0; j<�湮��.length; j++) { 
									if(�湮��[j][0] == null) { // i��° �ε����� ���� ����(null) �̸�
										�湮��[j][0] = contents; �湮��[j][1] = logid;
										System.out.println(">>>>> �湮�� ���");
										break;
									}
								}
							}
							else if(ch2==2) {
								System.out.println("---------- �湮�� ��� ----------");
								System.out.printf("%10s \t %s \n", "�ۼ���", "�湮����");
								// �迭 �� ������ ������ ��� ���� ���
								for(int j=0; j<�湮��.length; j++) {
									if(�湮��[j][0] == null) { break;}
									System.out.printf("%10s \t %s \n", �湮��[j][1], �湮��[j][0]); // "%10s �湮��[j][1], 
								}
							}
							else if(ch2==3) {
								System.out.println("[�˸�] �α׾ƿ� �Ǿ����ϴ�");
								break;
							}
							else System.out.println("[�˸�] �� �� ���� �ൿ�Դϴ�");
						}
						//// �α��� ������ �޴� ��
						logincheck = false;
						break;
					}
				}
				// �α��� ���н�
				if(logincheck) System.out.println("[�˸�] : �α��� ����(������ ȸ�������� �����ϴ�)");
				break;
				
				default :
					System.out.println("[�˸�] : �� �� ���� ��ȣ �Դϴ�.");
			}
		}
	}
}
