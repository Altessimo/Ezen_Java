package Day08;

public class Day08_1 {
// ����Ŭ���� �� main �޼ҵ�[������]
	// ��� :
	 // 1. extends : �����ϴ�[���赵 ����]
		// public class �ڽ� Ŭ���� �� extends �θ� Ŭ������{ }
	 // 2. super : �θ�Ŭ���� �� �ɹ� ����
		// 1. super() : �θ�Ŭ���� �� ������ ȣ��
		// 2. super.�ʵ��/�޼ҵ�� : �θ� Ŭ���� �� �ʵ�, �޼ҵ� ȣ��
	
	 // 3. @Override : �θ� Ŭ���� �� �޼ҵ� �� ����
	
	// 4. final
	// final class CellPhone : �θ�Ŭ������ ���Ұ�
	// final void CellPhone : �������̵� �Ұ�
	
	public static void main(String[] args) {
		// ���� Ŭ���� �̿��� ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		System.out.println("�� : " + dmbCellPhone.model); // �θ� �ɹ� / private ������ �ƴҰ�� �ɹ� ���� ����
		System.out.println("���� : " + dmbCellPhone.color); // �θ� �ɹ�
		
		System.out.println("ä�� : " + dmbCellPhone.channel); // ���� �ʵ�
		
		// �θ�޼ҵ�
		dmbCellPhone.powerOn(); // �θ� �޼ҵ� ����
		dmbCellPhone.bell(); // �θ� �޼ҵ� ����
		dmbCellPhone.sendVoice("�ȳ��ϼ���"); // �θ�޼ҵ�
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿 �ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		
		// ���� �޼ҵ�
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
