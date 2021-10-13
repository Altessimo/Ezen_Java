package Day10;

public class Day10_1 {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		// P. 386 Ȯ�ι���
			
		printSound(new Cat());
		printSound(new Dog());
	
		dbwork(new OracleDao());
		dbwork(new MySqlDao());
		
		// 5. �͸� ���� ��ü
		// �������̽� �� ������ = new �������̽� ��(){����};
		Action action = new Action() { // new Action() �� Action �ڵ��ϼ� = Ctrl+�����̽���
			
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�");
			}
		}; // ���� ��
		// �������̽� ����
		action.work();
	}
}
