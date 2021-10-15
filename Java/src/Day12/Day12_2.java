package Day12;

import java.util.Random;

public class Day12_2 {
// P.527
	
	public static void main(String[] args) {
		// Wrapper ���� Ŭ���� : �⺻ �ڷ��� �� ��üȭ
		
		// P.531 ���ڿ� �� �⺻Ÿ��
			// Integer.parseInt("���ڿ�");
			// Double.parseDouble("���ڿ�");
			// Bouble.parseDouble("���ڿ�");
			// Byte.parseInt(), Short.parseInt(), Long.parseInt(), Float.parseInt()
		// �⺻Ÿ�� �� ���ڿ�
			// 1. String.valueof(�⺻�ڷ���);
			// ����Ʈ �迭 �� ���ڿ�
			// 2. new ������(����Ʈ �迭)
		
		int value1 = Integer.parseInt("10"); // "10" �� 10
		double value2 = Double.parseDouble("3.14"); // "3.14" �� 3.14
		boolean value3 = Boolean.parseBoolean("true"); // "true" �� true
		
		// P.534 : Math Ŭ���� : ���а��� �޼ҵ� ����
		// 1. Math.abs()
		System.out.println("���밪 : " + Math.abs(-5)); // 5
		System.out.println("���밪 : " + Math.abs(-3.14)); // 3.14
		// 2. Math.ceil() 
		System.out.println("�ø��� : " + Math.ceil(5.3)); //6.9
		System.out.println("�ø��� �� " + Math.ceil(-5.3)); // -5.0
		
		// 3. Math.floor()
		System.out.println("������ : " + Math.floor(5.3)); // 5.0
		System.out.println("������ : " + Math.floor(-5.3)); // -6.0
		
		// 4. Math.max()
		System.out.println("�ִ밪 : " + Math.max(5, 9)); // 9
		System.out.println("�ִ밪 : " + Math.max(5.3, 2.5)); // 5.3
		
		// 5. Marh.min()
		System.out.println("�ּҰ� : " + Math.min(5, 9)); // 5
		System.out.println("�ּҰ� : " + Math.min(5.3, 2.5)); //2.5
		
		// 6. Math.random() : 0~1 ������ ���� ����
		System.out.println("���� : " + Math.random());
		
		// 7. Math.rint()
		System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.3)); // 5
		System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.7)); // 7
		
		// 8. Math.round() : �Ҽ��� 1�� �ڸ� �ݿø�
		System.out.println("�ݿø� : " + Math.round(5.3)); // 5
		System.out.println("�ݿø� : " + Math.round(5.7)); // 6
		// * �Ҽ��� 3�� �ڸ� �ݿø�[�ڸ��� ������ �ݿø� �ڸ��� ����]
		double value = 12.3456;
		double rvalue = Math.round(value*100) / 100.0; // 1234.56;
		// ������ �켱 ���� : ���� ��ȣ �� ���� ����
		// 1. value*100
		// 2. Math.round
		// 3. Math.round(value*100) / 100.0;
		// 4. ����
		System.out.println(rvalue);
		
		// P.536 : �ֻ���[1~6]
		// int num = Math.random(); // 0 ~ 1
		// int num = Math.random()*6; // 0*6 ~ 1*6
		int num = (int)(Math.random()*6)+1; // 1*6+1 ~ 1*6+1 : 1~7
		System.out.println(num);
		
		// P.537 : Random Ŭ����
		Random random = new Random(); // RandomŬ������ staric �޼ҵ带 �������� ����
		// int num2 = random.nextInt(); // 0~int�� ǥ�� �� �� �ִ� ������ŭ ����
		int num2 = random.nextInt(6)+1; // 1~6
		System.out.println(num2);
	}
}
