package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// ���� ó�� Ŭ����

public class Day12_6_File {
	// �޸�[�� �����ġ=Ram] : ����, �迭, ��ü �� : ���α׷� ����� �� �ʱ�ȭ
		// �� �����ġ : ���� �������� ���α׷�[��ɾ� ����] ��� �� ���α׷� ������ ����
			// ���� X ���� O �� �ֹ߼� �޸�
	
		// ���� �����ġ : [C, USB, ����, DB ��]  �ܺ�
			// ���� O ���� O �� �� �ֹ߼� �޸� �� Ŭ���ϸ� ���� �Ǵ� ��
	
	// ���� �� ��Ʈ��(���� : ����Ʈ) �� Java ���α׷� / ����1 �� ����Ʈ �� ����2 �� ����1 
	
	public static void main(String[] args) throws Exception {
	// 1. FileOutputStream : ���� ��� ��Ʈ��[�ش� ������ ������ ���� ����]
		// FileOutputStream ��ü�� = new FileOutputStream("���ϰ��");
		// / : ���
		// 1. write(����Ʈ��) : �ش� ���Ͽ� ����
		// ��Ŭ����(���ڿ�) �� (����Ʈ ��Ʈ��) �� ���ڿ�
		
		// FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/Ezen_Java/Java/src/Day12/Test.txt");
		// ����� ���õ� Ŭ���� �� ������ ����ó�� ����
		String ���ڿ� = "��Ŭ�������� �ۼ��� ���� �Դϴ�"; // �ѱ� 14 *2 �� 28 + 2(sp) = 30
		fileOutputStream.write(���ڿ�.getBytes());
		
		// 2. FileInputStream : ���� �Է� ��Ʈ��
		// FileInputStream ��ü�� = new FileInputStream("���ϰ��/���ϸ�.Ȯ����");
		// 1. read(����Ʈ�迭) : �ش� ������ ����Ʈ �迭�� �б�
		// FileInputStream fileInputStream = new FileInputStream("C:/java/test.txt");
		FileInputStream fileInputStream = new FileInputStream("C:/Users/505/git/Ezen_Java/Java/src/Day12/Test.txt");
		
		// �о�� ����Ʈ�� ������ �迭
		byte[] ����Ʈ�迭 = new byte[1024]; // 1bit[0,1] �� 8bit[1byte] �� 1024byte[1kb]
		fileInputStream.read(����Ʈ�迭); // ���� �о����
		// System.in.read(); // Ű���� �о����
		// ����Ʈ �� ���ڿ� ��ȯ
		String Strred = new String(����Ʈ�迭);
		System.out.println("���� ������ ������ " + Strred);
	}
}