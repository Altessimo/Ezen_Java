package Day13;

import java.awt.Toolkit;

public class Cat extends Thread {
	public Cat() {
		setName("고양이");
	}
	
	@Override
	public void run() {
		
		for(int i=1; i<5; i++) {
			try {Thread.sleep(1000);}
			catch (InterruptedException e) { }
			
			System.out.println("고양이 소리" + i);
	}
	}	
}