package Test;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	// private : ���� Ŭ���� ȣ��, static : ���α׷� ��������
	// main �� ȣ�� : ��� �޼ҵ忡�� ȣ�� ����
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-----------------------------------------------");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();
			if(selectNo==1) { createAccount();}
			else if(selectNo==2) {accountList();}
			else if(selectNo==3) {deposit();}
			else if(selectNo==4) {withdraw();}
			else if(selectNo==5) {run=false;}
		}
		System.out.println("���α׷� ����");
	}
	// �޼ҵ� ����
	// ���»����ϱ�
	public static void createAccount() {
		System.out.println("-----");
		System.out.println("���»���");
		System.out.println("-----");
		
		// 1. �Է¹ޱ�
		System.out.println(">>> ���¹�ȣ : "); String ano = scanner.next();
		System.out.println(">>> ������ : "); String owner = scanner.next();
		System.out.println(">>> �ʱ��Աݾ� : "); int balance = scanner.nextInt();
		
		// 2. ��ü����
		Account account = new Account(ano, owner, balance);
		
		// 3. �迭����
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) { // i���� �ε����� ���������
				accountArray[i] = account; // i��° �ε����� ��ü�ֱ�
				System.out.println("��� : ���°� �����Ǿ����ϴ�");
				break;
			}
		}
	}
	
	// ���¸�Ϻ���
	public static void accountList() {
		System.out.println("-----");
		System.out.println("���¸��");
		System.out.println("-----");
	}
	
	// Account �迭���� ano�� ������ Avvount ��üã��
		public static Account findAccount(String ano) {
			
		}
		
	// �����ϱ�
	public static void deposit() {
		
	}
	// ����ϱ�
	public static void withdraw() {
		
	}
}
