package Day13;

public class Tiger extends Thread {
	public Tiger() {
		setName("ȣ����");
	}
	
	@Override
	public void run() {
		for(int i=1; i<5; i++) {
			try {Thread.sleep(1000);}
			catch (InterruptedException e) { }
			
			System.out.println("ȣ���� �Ҹ�" + i);
	}
	}	
}
