package Day10;

public class SmartPhone extends Phone {
			// �߻�Ŭ���� : ��� extends
	
	public SmartPhone(String owner) {
		// this.owner = owner; ������ڰ� �־����. ���� �ִ� �����ڰ� ������ �ȉ�
		super(owner); // Super() : ����Ŭ������ ������ ȣ��
	}
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	@Override
	public void sound() {
		
	}
}