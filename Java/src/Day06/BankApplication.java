package Day06;

import java.util.Scanner;

public class BankApplication {
	// ���� ������
			// public : ������Ʈ �� ��� ������ ȣ�� ����
			// private : ��ü���ϳ������� ȣ�Ⱑ��
			// dafult(����) : ������ ��Ű�� �������� ȣ�Ⱑ��
			// protected : ������ ��Ű�� �������� ȣ�Ⱑ��
	
// 100�� ���°�ü�� ���� �� �� �ִ� �迭 ����
	// main�޼ҵ� ��ü ����� : main �޼ҵ� �� ��� �޼ҵ忡�� ȣ�� ����
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	// private : ���� Ŭ���� �������� ȣ�� ����
	// static : �������� : ���α׷� ���ݿ� ���� ���� ����
		// main �޼ҵ�� ���� ���α׷� ���۽� �޸� �Ҵ�
		// ��� �޼ҵ忡 ���Ǵ� �ʵ忡 ����
		// ��=��  �������� : ����� {  } �ȿ����� ��� �� {} ������ ������ �ʱ�ȭ

	public static void main(String[] args) {
		// static ���� �迭 ȣ��
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-----------------------------------------------");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) { createAccount(); }
			else if(selectNo==2) {accountList();}
			else if(selectNo==3) {deposit();}
			else if(selectNo==4) {withdraw();}
			else if(selectNo==5) {run=false;}
		}
		System.out.println("���α׷� ����");
	}
	// �޼ҵ� ����
	// ���������� Ű����, ��ȯŸ��, �޼ҵ��(�Ű�����, �谳����2 ~) (�����ڵ� ; return}
	
	// ���»����ϱ�[�μ�, ��ȯ X]
		// static ������� : main���� ȣ���ϱ� ����[�̻��� : main �ش� �޼ҵ� ���Ұ�]
	private static void createAccount() {
		// 1. �Է¹��� ������ ������ ����
		System.out.println("---------------------------------------------");
		System.out.println("���»���");
		System.out.println("---------------------------------------------");
		
		// 1. �Է¹ޱ� �� ������ ����
		System.out.println(">> ���¹�ȣ : "); String ano = scanner.next();
		System.out.println(">> ������ : "); String owner = scanner.next();
		System.out.println(">> �ʱ��Աݾ� : "); int alance = scanner.nextInt();
		
		// 2. ��ü����[�Է¹��� ���� ���� ��ü �����ڿ� �־ ��ü ����
		Account account = new Account(ano, owner, alance);
		
		// 3. �迭����[�迭 �� �����(null)�� ã�Ƽ� ����� �ε����� ��ü ����
		for(int i=0; i<accountArray.length; i++) { // i��° �ε����� ��� ������
			if(accountArray[i] == null) { // i��° �ε����� ��ü �ֱ�
				accountArray[i] = account;
				System.out.println("��� : ���°� ���� �Ǿ����ϴ�.");
				break; // ���� ������ �ݺ��� ����
			}
		}
	}
	
	// ���¸�Ϻ���[�μ�, ��ȯ X]
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("���¸��");
		System.out.println("--------------");
		// 1. �迭 �� ��� �ε����� ȣ��(��������)
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) break;
			
			System.out.println(accountArray[i].getAno() + "\t"
			+ accountArray[i].getOwner() +"\t"
			+ accountArray[i].getBalance());
		}
	}
	// Account �迭���� ano�� ������ Account ��üã��[[�μ�(String ano), ��ȯ(Account ��ü) O]
			// �����ϱ�
			private static Account findAccount(String ano) {
				Account account = null; // �ӽð�ü
				
				for(int i=0; i<accountArray.length; i++) {
					if(accountArray[i] != null) {
					if(accountArray[i].getAno().equals(ano)) {
						// i��° �ε����� ��ü �� ���¹�ȣ�� �μ�[�Է¹��� ���¹�ȣ] �� ������
						account = accountArray[i]; // ã�� ��ü�� �ӽð�ü�� ����
						break;
					}
				}
			}
			return account; // ���࿡ ������ ���¹�ȣ ������ ��ü(ã����ü) ��ȯ
			// ������ ���¹�ȣ�� ������ ��ü(null) ��ȯ
		}
	
	// �����ϱ�[�μ�, ��ȯ X]
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("����");
		System.out.println("--------------");
		
		//1. �Է¹ޱ�
		System.out.println(">> ���¹�ȣ : "); String ano = scanner.next();
		System.out.println(">> �ʱ��Աݾ� : "); int balance = scanner.nextInt();
		
		// 2. �Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ��
		Account account = findAccount(ano); // findAccount ��ȯ : ã�� ��ü Ȥ�� null
		
		// 3.
		if(account == null) { // ��ȯ�� null �� ���
			System.out.println("��� : ���°� �������� �ʽ��ϴ�.");
			return; // ���� �޼ҵ� ���� ����
		}
		// 4. // ���� ���ݾ� + �Է¹��� �Աݾ�
		account.setBalance(account.getBalance()+balance));
		// �������ݾ� + �Է¹��� �Աݾ�
		// set �޼ҵ� : �ʵ忡 �� ���� �޼ҵ�
		// get �޼ҵ� : �ʵ忡 �� ȣ�� �޼ҵ�
		System.out.println("��� : ������ ���� �Ǿ����ϴ�.");
	}
	
	// ����ϱ�[�μ�x ��ȯx]
	private static void withdraw() {
		// 1. �Է¹ޱ�
		System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		
		System.out.println(">> ���¹�ȣ : "); String ano = scanner.next();
		System.out.println(">> ��ݾ� : "); int balance = scanner.nextInt();
		
		// 2. �Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ��
		Account account = findAccount(ano); // ano=�μ�
		
		//3. 
		if(account == null) { System.out.println("��� : ���°� �������� �ʽ��ϴ�."); return; }
		if(account.getBalance() < balance) {
			// ��ݾ��� ���� ���ݾ� ���� ũ�� ��� �Ұ�
			System.out.println("���ݾ׺��� ���� �ݾ��� ��� �� �� �����ϴ�."); return;
		}
		// 4. 
		account.setBalance(account.getBalance() - balance);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
	}
}
