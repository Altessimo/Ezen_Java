package Day09;

public class KumhoTire extends Tire {
	// �ʵ� 
	// ������ 
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	// �޼ҵ� 
	@Override
	public boolean roll() {
		
		++accumultedRoration; 	// ���� ȸ���� ���� 
		if(accumultedRoration < maxRotation ) {	// �ִ�ȸ���� �� ũ�� 
			System.out.println(location + "KumhoTire ���� : "
					+(maxRotation-accumultedRoration)+"ȸ"); // ���� ���� ��� 
			return true; // true ������ ������ ǥ���ϴ� ��ȯ
		}else { // �ִ�ȸ������ �� ������
			System.out.println("*** " + location +" KumhoTire ��ũ *** ");
			return false; // false ������ ������ ǥ���ϴ� ��ȯ
		}
	
	}
}