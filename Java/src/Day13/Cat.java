package Day13;

import java.awt.Toolkit;

public class Cat extends Thread {
	public Cat() {
		setName("�����");
	}
	
	@Override
	public void run() {
		
		for(int i=1; i<5; i++) {
			try {Thread.sleep(1000);}
			catch (InterruptedException e) { }
			
			System.out.println("����� �Ҹ�" + i);
	}
	}	
}