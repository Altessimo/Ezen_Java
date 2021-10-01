package Day03;

public class Day03_Q {

	public static void main(String[] args) {
		// ¹®Á¦ 5. 4x + 5y = 60
		for(int x = 1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x) + (5*y) == 60) {
			System.out.printf("(%d, %d) \n", x, y);
			}
		}
		}