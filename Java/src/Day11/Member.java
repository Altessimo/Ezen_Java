package Day11;

public class Member {
public String id;
public Member(String id) {
	this.id=id;
}
// Object Ŭ���� �� �޼ҵ�(equals) �������̵�
@Override
public boolean equals(Object obj) { // ���� ��ü �μ��� ����[�񱳴��]
	// String ������Ʈ�� �� �� ����(��� ��ü�� �μ��� �޾Ƴ�)
if(obj instanceof Member) { // instanceof : ��� ���� Ȯ�� Ű����
	// Member Ŭ������ obj ���ԵǾ� �ִ��� Ȯ��[true, false]
}
	Member member = (Member)obj; // ���� ��ȯ�� (����)���� / �� ��ȣ�� ���� ��ȯ
	// �μ��� ��ü�� ���� �� ��ȯ
	if(id.equals(member.id)) {
		// ���Ѽ� ���� Ŭ���� �� �μ��� �μ��� ���� ��
		return true;
	}
	return false;
}

@Override
	public String toString() {
		return "���� ��ü �� ����� �ʵ�� : " + this.id;
	}
}
