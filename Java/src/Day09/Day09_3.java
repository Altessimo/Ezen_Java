package Day09;

public class Day09_3 {
// �������̽� : ��ü�� ������� �����ϴ� Ÿ��
	// ���� : Ŭ�������� �����ؾ� �ϴ� ������ �����ϴµ� ���Ǵ� �߻��ڷ�
	// �߻� : 
	// Ex) ������
		// �������̽�[��ư] = �̵���ư, ���ݹ�ư, ����ư
		// Ŭ����[���ӵ�] = �������, ��ɰ���, RPG����
			// ������ �������� ���δٸ� Ŭ�������� ����
// implements : �����ϴ�
	// �߻�޼ҵ� : ���� �ִ� �޼ҵ� => ����� Ŭ���������� ���� 
	// �߻�޼ҵ� ����
	// �������̽��� ��ü
// �������̽� ���
	// 1. �������̽� �������̽��� = new Ŭ����()
		// �������̽� = (Ŭ����) ��ü
	// 2. �͸� ���� ��ü
		// �������̽� �� = new �������̽���() {
		// 		�߻�޼ҵ� �������̵�
		// };
	// extends : ���� X[����� �ѹ��� ����]
	// implements : ���� O[������ ������ ����]
	
// P.347 ~ 354
	public static void main(String[] args) {
		// 1. �������̽� ���� : RemoteControl
		// 2. Ŭ���� ���� : Television implements RemoteContro
		// 3. Ŭ���� ���� : Audio implements RemoteControl
		
// 1. ������ ����[�޸� �Ҵ� X]
		RemoteControl rc;
		
// 2. �������� �ڸ����� Ŭ���� ����
		rc = new Television(); // �ش� �������� �ڷ��������� ����
		// �ڷ����� ������ ���
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
// 3. �ڷ����� �������� ����� ���������� ����
		System.out.println("-- �������� ����� �������� �����մϴ�!");
		rc = new Audio();
		// ����� ������ ���
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(15);
		
		// P. 360
		rc.setMute(true); // ����Ʈ �޼ҵ� �� ����
		
		// P. 362
		RemoteControl.changeBattery(); // ���� �޼ҵ�� ��ü ���� ���
		
// P. 354 �͸� ���� ��ü ��� ���� : ��ȸ�� �ڵ�
		RemoteControl rc2 = new RemoteControl() {
			
			@Override
			public void turnOn() { }
			@Override
			public void turnOff() { }
			@Override
			public void setVolume(int volume) { }
		};
	}
}