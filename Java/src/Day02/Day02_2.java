package Day02;

public class Day02_2 {
// ���� : �ϳ��� ���� ���� �� �� �ִ� �޸� ����
	// �޸�[�� �����ġ(RAM)] : ���� ��������  ���α׷� ���
	// ���α׷� �� ���μ���[������] �� ��ɾ�[�ڵ�] ����
	// ���� ���� ���� �� �뷮 ���� �� �ӵ� ����
	// ���� ȿ���� �� �ڷ���
// ���� ����
	// �ڷ��� ������[����]
	// int age;
// ������ ��Ģ
	// ���ڷ� ���� X // ��ҹ��� ���� // 
// ������ ����[������ ���� ���ʿ� ���� : ���Կ����� =]
	// int score; // ���� ����
	// score = 90; // ������ 90 �� ����
	
	// ������ ����� ��� �������� ��� �����ϴ�[��ȣ ������ �̵� ���� // ��ȣ ������ �̵� �Ұ�]
	public static void main(String[] args) {
		int value = 10; // int�� �ڷ��� value �������� ���� ���� ����� ���ÿ� 10�� ���� // �ڷ��� int 10
		
		int result = value + 10; // ������ ������ ����
		
		System.out.println("��� : " + result);
		
		// p. 38 �ڷ��� 
		// �ڷ��� ��� ���� : �޸� ȿ����[������ ���]
		// ��ǻ�ʹ� ���� ��� [0, 1] ���� : bit �� 0 Ȥ�� 1
		// bit �� 8bit = 1����Ʈ [01010101  = 1����Ʈ(8ĭ)]
		// byte �� 1024byte = 1kbye
		/*
		 * [��]
		 * boolean 1��Ʈ true, false
		 * [����]
		 * char 2����Ʈ ����[�����ڵ�]
		 * [����]
		 * byte	1����Ʈ	+-127
		 * char 2����Ʈ	����
		 * short 2����Ʈ +-3������
		 * int 4����Ʈ	+-20������
		 * long 8����Ʈ +-29�� �̻�
		 * [�Ǽ�]
		 * float 4����Ʈ �Ҽ��� 8�ڸ� ǥ��
		 * double 8����Ʈ �Ҽ��� 18�ڸ� ǥ��
		 */
		
// P. 40 byte
		byte var1 = -128; System.out.println(var1);
		byte var2 = -30; System.out.println(var2);
		byte var3 = 30; System.out.println(var3);
		// byte var4 = 128; System.out.println(var4); // ����
		byte var4 ='J'; System.out.println(var4);
		
		// P. 43 : char[1���ڸ� ����]
		char c1 ='A'; System.out.println(c1);
		char c2 = 65; System.out.println(c2);
		char c3 = '\u0041'; System.out.println(c3);
		char c4 = '��'; System.out.println(c4);
		char c5 = 44032; System.out.println(c5);
		char c6 = '\uac00'; System.out.println(c6);
		// ��ǻ��[0, 1]�� ���ڸ� ��� ó��?
		// �ƽ�Ű�ڵ� : �̱�[���� �� ���� �� ����] 
		// �����ڵ�[Java] : �� ���� ��� ���� ǥ�� // �� ����Ʈ ���鶧�� ���
		
		// P.44~45 short[2����Ʈ], int[�⺻ ���� �ڷ��� / 4����Ʈ] Ÿ��
		short num1 = 30000; System.out.println(num1);
		// short num2 = 40000; System.out.println(num2);
		int num2 = 10; System.out.println(num2);
		int num3 = 012; System.out.println(num3); // 8����
		int num4 = 0xA; System.out.println(num4); // 16����
		// ���� ���� : ��ǻ�Ͱ� ǥ�� �� �� �ִ� ���� �Ѱ� �ذ�
		// 2���� [0~1] : ����
		// 8���� [0~7] : 	[0]
		// 10���� [0~9] : ���
		// 16���� [0~9, A, B, C, D, E, F] : �پ��� ǥ������	[0x ]
		
		// P.46 : long [8����Ʈ] : 20�� �̻�
		long num5 = 20000000l; System.out.println(num5);
		
		// P.47~48 : float[4����Ʈ], double[�⺻ �Ǽ� �ڷ��� / 8����Ʈ]
		double va1 = 3.14; System.out.println(va1);
		// float va2 = 3.14; System.out.println(va2);
		float va2 = 3.14f; System.out.println(va2);
		
		double va3 = 0.123456789123456789; System.out.println(va3);
		// �Ҽ��� 18�ڸ����� ǥ��
		float va4 = 0.123456789123456789f; System.out.println(va4);
		// �Ҽ��� 8�ڸ����� ǥ��
		
		// boolean : ��Ʈ[0(false), 1(true)]
		boolean bo1 = true;
		
		// P.49 : Ÿ�Ժ�ȯ
		// 1. �ڵ� Ÿ�� ��ȯ[ũ��� : ���� ���ڿ��� ū ���ڷ� �̵� ����]
		// byte �� short(char) �� int �� long �� float �� bouble
		// �ݴ�� �Ұ� // ū ���ڿ��� ���� ���ڷ� �̵� ����, ���� ���ڿ��� ū ���� �̵� �ұ�
		byte byteValue = 10;
		int intValue = byteValue; // �ڵ� Ÿ�Ժ�ȯ ����  byte �� int
		// byte byteValue int byteValue; // �Ұ� int �� byte
		
		// 2. ���� Ÿ�� ��ȯ[�޸� �ս� �� ������ �ս�]
		// �ڷ��� ������ = (�ڷ��) ������
		// P.54
		
		byte bytevalue2 = (byte)intValue;
	}

}
