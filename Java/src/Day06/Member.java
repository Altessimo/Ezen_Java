 package Day06;

public class Member {
// P.279 ���� 13.
	String name;
	String id;
	String password;
	int age;
	
// ���� 14.
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
// ���� 15. �޼ҵ�(�α���, �α׾ƿ�
	// 1. �α��� �޼ҵ�[�μ� : id, password ��ȯ : true]
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("1234")) {
			return true; // �����Ұ�� true ����
		} else {
			return false; // �������� ������� fasle ����
		}
	}
	// 2. �α׾ƿ� �޼ҵ�(�μ� : id, ��ȯ X)
	void logout(String id) {
		System.out.println(id + "�� �α׾ƿ� �Ǿ����ϴ�");
	}
}
