package Day11;

public class Day11_2 {
public static void main(String[] args) {
// API : � Ʋ�� ¥���
	// ���̺귯�� : ������� Ŭ����, �������̽�
// object Ŭ����
	// 1. equals() : ��ü ��
	
	Member obj1 = new Member("blue");
	Member obj2 = new Member("blue");
	Member obj3 = new Member("red");
	
	if(obj1.equals(obj2)) {
		System.out.println("1. �� ��ü�� �����մϴ�.");
	} else {
		System.out.println("1. �� ��ü�� �ٸ��ϴ�.");
	}
	if(obj1.equals(obj3)) {
		System.out.println("2. �� ��ü�� �����մϴ�.");
	} else {
		System.out.println("2. �� ��ü�� �ٸ��ϴ�.");
	}
	// 2. toString() : ��ü ����
		// ��ü�� �ּҰ� [�ڷ������� �� ȣ��]
	System.out.println(obj1.toString());
	System.out.println(obj2.toString());
	System.out.println(obj3.toString());
	String ���ڿ� = "ȫ�浿";
	System.out.println(���ڿ�.toString());
	
	// 3. clone() : ��ü ����
		// 1. ���� ���� : �迭 ��ü�� ���� �Ұ�(�ּҸ� ����)
		// 2. ���� ���� : �迭 ��ü�� ���� ����
	Member2 original = new Member2("blue", "ȫ�浿", "12345", 25, true);
	
	//2. 
	Member2 cloned = original.getMember2();
	cloned.password = "67890";
	System.out.println("---------- ������ ��ü ����");
	cloned.toString();
	System.out.println("---------- ���� ��ü ����");
	cloned.toString();
	
	// 3-1 ���� ����
	// 1. ��ü ����
	Member3 original2 = new Member3("ȫ�浿",25, new int[] {90,90}, new Car("�ҳ�Ÿ"));
	
	// 2. ���� ����
	Member3 cloned = original2.getMember3();
	cloned2.scpres[0] = 100;
	cloned2.car.model="�׷���";
	
	System.out.println("---------- ���� ��ü");
	original2.toString();
	System.out.println("---------- ���� ���� ��ü");
	cloned2.toString();
}
}
