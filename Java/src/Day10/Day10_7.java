package Day10;

public class Day10_7 {
// ����ó�� : 1. �Ϲݿ��� 2. ���� ����
	// ���� : �پ��� ������ �߻��� �� ���α׷� ����ȭ
	// *try{} �ȿ��� ���ܹ߻��ϸ� catch ����Ŭ���� ��ü�� ���� �߻� ������ �����ϰ� catch ����
	// ��, ���ܰ� ���� ��� try {} ������� �� catch {}�� ���� ����
	
	// try(���ܰ� �߻� �����ڵ�)
	// catch(����Ŭ������ ������) { ���� �߻��� ����Ǵ� �ڵ� }
	// finally {���� �ֵ�, ���� ������ ����Ǵ� �ڵ�}
	
	// ���� Ŭ����
	// * Exception : ���� ����Ŭ���� = ��� ���� ���尡��
	// 1. NullPointerException : null
	// 2. ArrayIndexOutOfBoundsException : �迭
	// 3. NumberFormatException : ����
	// ~ ��
	
	// ���� ������
		// ���� : �޼ҵ� ������ �߻��� ���ܸ� ȣ���� ������ �̵�(���� ���ϼ�)
	// 
	public static void main(String[] args) {
		// ���� 1) P. 423 : NullPointerException ����
		try {
		String data = null; // String ��ü�� null ����
		System.out.println(data.toString()); // to String() ��ü������ȯ
		} catch(Exception e) {
			System.out.println("���ܰ� �߻� �߽��ϴ�. [�����ڿ��� ����]");
			System.out.println("�������� : " + e);
		} finally {
			System.out.println("** ������ ����Ǵ� ��ġ");
		}
	
		// ���� 2) ArrayIndexOutOfBoundsException ����
		try {
		String[] ���ڿ��迭 = new String[2]; // String 2���� �����ϴ� �迭 ����
		���ڿ��迭[0] = "ȫ�浿"; ���ڿ��迭[1] = "���缮"; ���ڿ��迭[3] = "��ȣ��";
		} catch(Exception e) {
			System.out.println("�迭 �� �ڸ��� �����մϴ�. [�����ڿ��� ����]");
			System.out.println("�������� : " + e);
		} finally {
			System.out.println("** ������ ����Ǵ� ��ġ");
		}
		
		// ���� 3) P.426 NumberFormatException
		try {
		String data1 = "100"; // "100" �� 100 (����)
				String data2 = "a100"; // "a100" �� a100 (�Ұ���)
		System.out.println(Integer.parseInt(data1));
		System.out.println(Integer.parseInt(data2));
				// Integer : ���� ���� Ŭ����[���� ���� �޼ҵ� ����]
					// .parseInt(����) : ���ڸ� ���������� ��ȯ���ִ� �޼ҵ�
		} catch(Exception e) {
			System.out.println("���ڰ� ���� �� ���ڿ��� ������ ��ȯ�� �Ұ�. [�����ڿ��� ����]");
			System.out.println("�������� : " + e);
		} finally {
			System.out.println("** ������ ����Ǵ� ��ġ");
		}
	}

}
