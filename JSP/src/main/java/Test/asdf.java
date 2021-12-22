package Test;

import java.util.Scanner;

public class asdf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시험점수를 입력하십시오");
				int test = scanner.nextInt();
				int sum=0;
					for(int i=1; i<=test; i++) {
						sum+=1;
					}
		System.out.println("시험점수의 합계는 "+test+" 입니다");

	}

}
