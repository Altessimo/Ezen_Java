package Day13;

public class Movie extends Thread {
	
static boolean stop = true;
	
	public static void moviestop(boolean sw) { // sw : 재생여부를 확인 하는 변수
		stop = sw;
		if(stop) {System.out.println("~ 영화 시작 ~");}
		else {System.out.println("~ 영화 종료 ~");}
	}
	
	@Override
	public void run() {
	while(stop) {  // stop이 true인 경우에만 실행 / 아니면 실행 X
		System.out.println("~ 영화실행중 ~");
		
		try {Thread.sleep(1000);}
		catch (Exception e) { }
	}
}
	}