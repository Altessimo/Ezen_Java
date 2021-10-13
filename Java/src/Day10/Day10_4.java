package Day10;

public class Day10_4 {

	public static void main(String[] args) {
		Button btn = new Button();
		// btn 객체 내 인터페이스 존재!
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		System.out.println("객체 내 인터페이스와 연결된 구현개체 변경");
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
