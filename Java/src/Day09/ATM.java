package Day09;
 // 1. Atm 

public interface ATM {
// 1. ��� �ʵ�
	// 2. �߻� �޼ҵ�[���� �ϰ� �����ڵ� ���� X]
	public void ���µ��();
	public void ����();
	public void ���();
	public void �ܰ�();
	
	// 3. ����Ʈ �޼ҵ�
	default void ����() {System.out.println("Atm ���� �մϴ�");}
	
	// 4. ���� �޼ҵ�
}
