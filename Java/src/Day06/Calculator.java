package Day06;

public class Calculator {
// �ʵ�
// ������
	// �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	// �μ� O, ��ȯ O
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	// �μ� O, ��ȯ O
	double dicide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	// �μ� X, ��ȯX(void)
	void poweroff() {
		System.out.println("������ ���ϴ�");
	}
}
