package Day13;

public class Day13_Q1 {

	/*
	 * ���� 1.
	 * 3�� ������ �����Ͽ� 3���� ����� ���ÿ� ���, ������ �̸��� ���
	 *  1. ������ �Ҹ� ������[1�ʰ������� 5�� ���]
	 *  2. ����� �Ҹ� ������
	 *  3. ȣ���� �Ҹ� ������
	 *  
	 *  ��� ��
	 *  ������ �Ҹ� �� 5
	 *  ������ 1 �̸� : ������ �Ҹ� ������
	 *  ����� �Ҹ� �� 5
	 *  ������ 2 �̸� : ����� �Ҹ� ������
	 *  ȣ���� �Ҹ� �� 5
	 *  ������ 3 �̸� : ȣ���� �Ҹ� ������
	 */
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		
		dog.start();
		cat.start();
		tiger.start();
		
		try { Thread.sleep(6000); }
		catch (Exception e) { }
		
		System.out.println("������ ������ : " + dog.getName());
		System.out.println("����� ������ : " + cat.getName());
		System.out.println("ȣ���� ������ : " + tiger.getName());
		}
	}