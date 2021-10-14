package Day11;

public class Day11_3 {
// System Ŭ����[��� �ɹ��� static�̱� ������ ��ü �ʿ����]
// System.out.println(); static(��ü ���� ���Ǵ� ���)
	
	public static void main(String[] args) {
		/* 1. exit : ���α׷� ����
		System.setSecurityManager(new SecurityManager() {
		@Override
		public void checkExit(int status) {
			if(status !=5) {
				throw new SecurityException();
				// i�� 0�� �� static = 0 true �� ���� �߻�
				// i�� 1�� �� static = 1 true �� ���� �߻�
				// ~
				// i�� 5�� �� static = 5 false �� ���� �߻� X
			}
		}
		});
		
		for(int i = 0; i<10; i++) { // i�� 0~9���� i�� ����
			System.out.println(i); // ���
			try {
				System.exit(i); // i�� exit() �ֱ�[i�� 5�ϋ� ���ܰ� ���� ������ exit ����]
			} catch(Exception e) { }
		}
		*/
		
		// 2. for���� 1000000ȸ ���� ������ �ɸ��� �ð�
		// 1. ���۽ð�
		long time1 = System.nanoTime();
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum+=1;
		}
		// 2. ������ �ð�
		long time2 = System.nanoTime();
		System.out.println("1~1000000������ �� : " + sum);
		System.out.println("�ɸ��ð� : "+(time2-time1)+" ������ ");
		System.out.println(System.nanoTime());
		
		// 3. �ý��� ���� �б�[System.getProperty("ȣ��Ű")]
		System.out.println("Pc Os : " + System.getProperty("os.name"));
		System.out.println("Pc ����� �̸� : " + System.getProperty("user.name"));
		System.out.println("Pc ����� ���� ��ġ : " + System.getProperty("user.home"));
		
		
	}
}
