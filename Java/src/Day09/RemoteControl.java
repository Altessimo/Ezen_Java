package Day09;

public interface RemoteControl {
 // Class : Ŭ���� ����� ���Ǵ� Ű����
// interface : �������̽� ����� ���Ǵ� Ű����
	// ���� ���̽�
	
	// 1. ��� �ʵ�[�ݵ�� �ʱⰪ ����, ���� �Ұ�]
	public int MAX_VOLUME = 10; // �ִ� ����
	public int MIN_VOULUME = 0; // �ּ� ��
	
	// 2. �߻� �޼ҵ�[�޼ҵ� ���� / �����ڵ�� ���� X �� ���� : ȣȯ��ų����]
	// public void turnOn() { }; [X]
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 3. ����Ʈ �޼ҵ�[�޼ҵ� ����� �����ڵ� ���� O] : �߰�ȣ ����
	default void setMute(boolean mute) {
		if(mute) {System.out.println("���� ó�� �մϴ�.");}
		else {System.out.println("���� ���� �մϴ�.");}
	}
	
	// 4. ���� �޼ҵ�[��ü ���� ���� ���Ǵ� �޼ҵ�]
	static void changeBattery() {
		System.out.println("�������� ��ȯ �մϴ�.");
	}
}