package Day13;

public class Music extends Thread {
	static boolean stop = true;
	
	public static void musicstop(boolean sw) { // sw : ������θ� Ȯ�� �ϴ� ����
		stop = sw;
		if(stop) {System.out.println("~ ���� ���� ~");}
		else {System.out.println("~ ���� ���� ~");}
	}
	
	@Override
	public void run() {
	while(stop) { // stop�� true�� ��쿡�� ���� / �ƴϸ� ���� X
		System.out.println("~ ���ǽ����� ~");
		
		try {Thread.sleep(1000);}
		catch (Exception e) { }
	}
}
	}
