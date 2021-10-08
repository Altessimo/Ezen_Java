package Day08;

public class DmbCellPhone extends CellPhone {
	// extends : �����ϴ� / ��� 1��
		// �ڵ��� �⺻ ��� �� CellPhone ���
		// 1. �ʵ�
		int channel;
		// 2. ������
		public DmbCellPhone(String model, String color, int channel) {
			// this : ���� Ŭ���� �� �ɹ�
			// this.model = model; // �θ� Ŭ���� �� �ɹ� ���
			// this.color = color; // �θ� Ŭ���� �� �ɹ� ���
			// this.channel = channel; // ���� Ŭ���� �� �ɹ� ���
			
			// �θ� Ŭ������ ������ ������ �� super() Ű���带 �̿��� �θ� Ŭ���� ������ ȣ��
			super(model, color); // super() : �θ� Ŭ���� �� ������ ȣ��
			this.channel = channel;
		}
		// 3. �޼ҵ�
		void turnOnDmb() {
			System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
		}
		void changeChannelDmb(int channel) {
			this.channel = channel;
			// this.channel : �Ķ��� �� ���� Ŭ���� �� �ɹ�
			// channel : ������ �� �޼ҵ忡 �ܺηκ��� ���� ����[�μ�]
			System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
		}
		void turnOffDmb() {
			System.out.println("DMB ��� ������ ����ϴ�.");
			
			// �������̵�[�θ� Ŭ���� �� �޼ҵ� �� ����] : �ڵ��ϼ�
			@Override // ������ �� �ڵ庯�� // @ : ������̼�
			void powerOn() {
			// super.powerOn(); // �θ� �żҵ� ȣ��
			System.out.println("@���� �޼ҵ� ������ : DMB�� �մϴ�.");
			}
		}