package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ���ѷ��� �� while �̿��� ���ѹݺ�
		// Ű���带 �̿��� ����ü��
		// ���ѷ��� ���� ��� : 1. ������ false 2. break
		while(true) {
			
			// ����[����] ����
			// 1. Random Ŭ���� // 2. Math Ŭ����
			// Random ��ü
			// .nextInt() : int�� ǥ���� �� �ִ� ������ŭ ���� ����
			// .nextInt(����) : 0~���� ������ ���� ����
			// .nextInt(10) + �ʱⰪ(1����, 2����) : �ʱⰪ~���ڱ����� ����
			
			Random random = new Random(); // ���� ��ü
			System.out.println(random.nextInt(10)+1);
			
			//System.out.println(random.nextInt());
			//System.out.println(random.nextDouble());
			//System.out.println(random.nextBoolean());
			
			//System.out.println("���ѷ���");
			//int ���� = Scanner.nextInt();
			//if(���� == 4) break;
		}
	}

}
