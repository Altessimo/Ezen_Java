package Day03;

public class Day03_1 { // c s
	
	// ��ǻ��[0, 1] : ����
	// 1. ��ǻ��(Java) ��� / �Է�
	// 2. �޸�[����] ����, ���[����]
	
	// P.108 ��� : if(������), switch(����������)
			// ���� : ����� ���� ���� �ڵ�ó��
	// ��) �л����� 1,000���� �ְ� �ݶ� �ɺθ�
		// 1. ���� ����� ������ �� �ݶ� ���� ��� �� false
		// 2. ���� ����� ������  �� �ݶ� 1,200�� �� false
		// 3. ���� ����� ������  �� �ݶ� ���� �� true
			// If�� �پ��� �������� �������� ��� // ���� IF�� ������� �˾ƾ���.
		// if (A ������ == �ݶ� && �ݶ󰡰� �� 1,000 {����}
		// else if(B ������ == �ݶ� && �ݶ󰡰� �� 1000 {����}
		// else if(c ������ == �ݶ� && �ݶ󰡰� �� 1000 {����}
		// else { ���� }
	
	// ��) ���������� : ��ư[if(���࿡ ��ư�� ��������)]
	
	// IF : true, false�� ���� ���� // �񱳿�����, ���迬����
		// ����1 : if(��) true ���๮
		// ����2 : if(��) true ���๮
		// 		else false ���๮
		// ����3 : if(��) { ���๮; ����; }
		//		else { ���๮, ���� }
		// ����4 : if(��) {  }
		// 		else if(�� 2) {  }
		// 		else if(�� 3) {  }
		//		else if(�� 4) {  }
		//		else
	
	public static void main(String[] args) { // m s
		// ��1) true �̸� ���๮ ����
		if(3>1) System.out.println("��1) 3�� 1���� ũ��"); // If�� �� ������ ��Ʈ if(3>1)�� ;�� ���� ���� �ʴ´�
		
		// ��2) false �̸� ���� X
		if(3>5) System.out.println("��2) 3�� 5���� ũ��");
		
		// ��3) ture, false�̸� ���๮ ����
		if(3>5) System.out.println("��3) 3�� 5���� ũ��");
		else System.out.println("��3) 3�� 5���� �۴�");
		
		// ��4) { }�� ���Ǵ� ��� �� ���๮ 2�� �̻��ϋ�
		if(3>2) { // if s
		System.out.println("true�̸� ����Ǵ� �ڸ�");
		System.out.println("3�� 2���� ũ��");
		} // if e
		else { // if s
		System.out.println("false�̸� ����Ǵ� �ڸ�");
		System.out.println("3�� 2���� �۴�");
		} // if e
		
		// ��5) �پ��� ����� ���� ���� ����
		if(3>5) System.out.println("��5) 3�� 5���� ũ��");
		else if(3>4) System.out.println("��5) 3�� 4���� ũ��");
		else if(3>3) System.out.println("��5) 3�� 3���� ũ��");
		else if(3>2) System.out.println("��5) 3�� 2���� ũ��");
		else System.out.println("true���� ����"); // �ϳ��� T���� ��
		
		// ��5_2) 
		if(3>5) System.out.println("3�� 5���� ũ��");
		if(3>4) System.out.println("3�� 4���� ũ��");
		if(3>3) System.out.println("3�� 3���� ũ��");
		if(3>2) System.out.println("3�� 2���� ũ��");
		else System.out.println("true���� ����"); // 1�� ���ǿ� �ټ� ���
		
		// P. 109 ��
		int score = 93;
		// ������ 90���� ũ�� ������ ����
		if(score >= 90) { System.out.println("������ 90���� Ů�ϴ�"); System.out.println("����� A �Դϴ�"); }
		// ������ 90���� �̸��̱� ������ ����X
		if(score < 90) { System.out.println("������ 90���� �۽��ϴ�"); System.out.println("����� B �Դϴ�"); }
		
		// p.111 ��
		int score2 = 85;
		if(score2 >= 90) { System.out.println("������ 90���� Ů�ϴ�"); System.out.println("����� A �Դϴ�"); }
		else { System.out.println("������ 90���� �۽��ϴ�"); System.out.println("����� B �Դϴ�"); }
		
		// p.112 ��
		int score3 = 75;
		if(score3 >= 90) { System.out.println("������ 100~90 �Դϴ�"); System.out.println("����� A �Դϴ�"); }
		else if(score3 >= 80) { System.out.println("������ 80~89 �Դϴ�"); System.out.println("����� B �Դϴ�"); }
		else if(score3 >= 70) { System.out.println("������ 70~79 �Դϴ�"); System.out.println("����� C �Դϴ�"); }
		else { System.out.println("������ 70 �̸� �Դϴ�"); System.out.println("����� D �Դϴ�"); }
	} // m e

} // c e
