package Day15;

public class Coin {
	
	// �ʵ�
	private int value;
	
	// ������
	public Coin(int value) { // ���ڷ� �� ��� : String
		this.value = value;
	}
	
	// �޼ҵ�
	public int getValue() {
		return value;
	}
	
	// �������̵�(�޼ҵ�)
	@Override
		public String toString() {
			return this.value + "";
		}
}