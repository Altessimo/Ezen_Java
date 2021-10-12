package Day09;

public class Television implements RemoteControl {
	// extends : ���赵 ����
	// implements : (�߻�޼ҵ带 ����, ���� �϶�) �����ϴ�
	// Ŭ���� : ���δٸ� Ŭ������ ���Ǵ� �ٸ�.
	
	// 1. �ʵ�
	private int volume;
	
	// 2. ������
	// 3. �޼ҵ�
		// ����� �������̽��� �߻� �޼ҵ� �����ϱ�
	public void turnOn() {
		System.out.println("Tv�� �մϴ�.");
	}
	// Ctrl + �����̽��� : ������ �߻� �޼ҵ� ���
	@Override // ��������
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			// ���� ������ �ִ� �������� Ŀ����
			this.volume = RemoteControl.MAX_VOLUME; 
			// �ִ� �������� �����ϱ�[���� ������ �ִ� �������� Ŀ������ ����]
		} else if(volume<RemoteControl.MIN_VOULUME) {
			// ��������� �ּҼ���[0]���� ������
			this.volume = RemoteControl.MIN_VOULUME;
			// �ּҼ������� �����ϱ�[��������� ������ �� �� ����]
		} else {
			this.volume = volume;
		}
		System.out.println("���� Tv ���� : "+ volume);
	}
}
