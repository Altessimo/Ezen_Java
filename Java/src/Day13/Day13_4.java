package Day13;

public class Day13_4 {

	public static void main(String[] args) {
		// �� ���׸� : ���׸��� �������
			// 1. Ÿ�� ��ȯ
		// 1. ��ü����
		Box box = new Box();
		// 2. ��ü �޼ҵ� ȣ��
		box.set("ȫ�浿"); // ȫ�浿[String] �� object[�ڵ� ����ȯ]
		String name = (String)box.get(); // object �� string[���� ����ȯ]
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
		// ���׸� : �� ��ȯ�� ���� ��ü Ŭ���� ����
		Box2<String> box2 = new Box2<>();
		// Ŭ������<�Ű�Ŭ����> ������ = new ������<>();
		box2.set("hello");
		String str = box2.get();
		
		Box2<Integer> box22 = new Box2<>();
		box22.set(6);
		int value = box22.get();
		
		// ��Ƽ ���׸�
		Product<Tv, String> Product1 = new Product<>();
		Product1.setKind(new Tv());
		Product1.setModel("����Ʈ Tv");
		Tv tv = Product1.getKind();
		String tvModel = Product1.getModel();
		
		Product<Car, String> Product2 = new Product<>();
		Product2.setKind(new Car());
		Product2.setModel("����");
		Car car = Product2.getKind();
		String carModel = Product2.getModel();
	}
}