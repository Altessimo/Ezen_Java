package Day10;

public class Day10_6 {

	public static void main(String[] args) {
		Anonymous2 anonymous2 = new Anonymous2();
		anonymous2.field.run();
		anonymous2.method1();
		anonymous2.method2(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
			}
		}   // ���� �� 
	); // �޼ҵ� ȣ�� 
	}
}