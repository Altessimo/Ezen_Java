package Day06;

public class Day06_3 {

	public static void main(String[] args) {
		// ��ä�����(������ ���� ������ ���� ��� �� ������)
		Calculator calculator = new Calculator();
		// ��ü�� ���� �޼ҵ� ȣ��
		calculator.powerOn();
		
		// ��ü�� ���� �޼ҵ� ȣ��(�μ��� ���� �ؼ� ���ϰ��� ������ ����)
		int result1 = calculator.plus(5, 6);
		System.out.println("�Լ� ����� : " + result1);
		
		byte x=10; byte y=4;
		double result2 = calculator.dicide(x, y);
		System.out.println("�Լ� ����� : " + result2);
		
		calculator.poweroff();
		
		// P.223
		Car4 car4; // ��ü
		car4 = new Car4();  // �ν��Ͻ�ȭ
		// 1. ��ü �� �ʵ忡 ���� �ʱ�ȭ �� �� �ִ� ���
		// - ��ü��.�ʵ�� = 10
		// - new Ŭ������(10)
		// - ��ü��.set�޼ҵ�(10)
		car4.setGas(5); // ���� 5�� ���� / setGas �޼ҵ� ȣ�� [ �μ��� 5 �ֱ� ]
		boolean gassState = car4.isLeftGas();// ���� Ȯ�� �޼ҵ� 
		if(gassState) {
			System.out.println("���");
			car4.run();
		}
		if(car4.isLeftGas()) {
			System.out.println("Gas ���� �� �ʿ䰡 �����ϴ�");
		} else {
			System.out.println("Gas �����ϼ���");
		}
	}
}
