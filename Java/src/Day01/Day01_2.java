package Day01;

public class Day01_2 { // Ŭ���� ���� C S
	
	// public static void main(String[] args) { // main ���� ���� �Ұ�
	// main + ctrl + �����̽���
	public static void main(String[] args) { // M S
		
		// 1. ���
		// print(����� ����) : ���
		// println(����� ����) : ��� �� �ٹٲ�(���� �ٲ�)
		// f : format : ���
		// %d : ����
		// %f : �Ǽ�
		// %s : ���ڿ�
		// %c : ����
			// ����� P.34
			// \ : ���� ���� ��ȭ��ȣ \
			// \n : �ٹٲ�
			// \t : �� (�鿩���� 5ĭ)
			// \r : ����(�� ������ �̵�)
			// \\ : ���
		
		// �� 1 : syso + ctrl + �����̽���
		System.out.print("Java");
		System.out.print(12345); // ���� �̱� ������ ���ڿ��� ����ó�� X
		System.out.print("Java 10"); // ���� + ���� = ����
		// system : �̸� ������� �ý����̶�� Ŭ����
		// Out : ��� ��Ʈ��
		// print(�μ� : ����ϰ� ������) : ��� �Լ�
		// . : Ŭ���� �� �ɹ�(�Լ�, ����) ���� ������(Ư������ : +, - ��)
		// " " : Ű����(�̸� �ۼ��� ���), ���� �� ������ ��� ���ڿ��� ����ó��
		// ; : �� ���� �����ڵ� ��ħ(��)
		
		// Ctrl + f11 : ������
		
		// ���� 2
		System.out.println("Java");
		System.out.println(12345);
		System.out.println("Java 10");
		
		// ���� 3
		System.out.printf("%s", "Java");
		System.out.printf("%d", 12345);
		System.out.printf("%s", "Java 10");
		
		// print ����
		System.out.printf("���̴� %d �Դϴ� ", 20);
		System.out.println("���̴� " + 20 + "�Դϴ�");
		// + : ���� ������

		// �����
		System.out.print("\nJava\n"); // �� �ڷ� �ٹٲ�
		System.out.print("\t 12345 ");
		System.out.println("\r Java10");
		
		// ���� 1
		/* ��°��
		 * 				[[ �⼮�� ]]
		 * -------------------------------------
		 * �̸� 		1���� 	2���� 	3���� 	���
		 * ��ȣ��		�⼮		�Ἦ		�⼮
		 * ���缮		�⼮		�Ἦ		�⼮
		 * -------------------------------------
		 */
		
		System.out.println("\n\t\t[[ �⼮�� ]]");
		System.out.println("-------------------------------------");
		System.out.println("�̸�\t 1���� \t 2���� \t 3���� \t ���");
		System.out.println("��ȣ��\t �⼮ \t �Ἦ \t �⼮");
		System.out.println("���缮\t �⼮ \t �Ἦ \t �⼮");
		System.out.println("-------------------------------------");
		
		// ���� 2 : �����
		System.out.println("\\     /\\");
		System.out.println(" )   (  ')");
		System.out.println(" (  /  )");
		System.out.println("  \\(__)|"); // | : s
		
		// ���� 3 : ��
		System.out.println();
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\"\\"); // ����ó�� ������ = \" : "���
		System.out.println("|\"^\"-    |");
		System.out.println("||_/=\\\\__|");
		
	} // M E

} // Ŭ���� �� C E
