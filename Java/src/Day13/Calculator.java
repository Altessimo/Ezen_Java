package Day13;

public class Calculator {
private int memory;

public int getMemory() {
	return memory;
}

public void setMemory(int memory) {
	this.memory = memory;
	// 1. 2초간 스레드 일시정지
	try { Thread.sleep(2000);} catch (Exception e) { }
	System.out.println("스레드명 : "+Thread.currentThread().getName()+" : "+this.memory);
}
}