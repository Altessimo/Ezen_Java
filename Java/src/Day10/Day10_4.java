package Day10;

public class Day10_4 {

	public static void main(String[] args) {
		Button btn = new Button();
		// btn ��ü �� �������̽� ����!
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		System.out.println("��ü �� �������̽��� ����� ������ü ����");
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
