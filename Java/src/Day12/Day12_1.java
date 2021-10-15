package Day12;

import java.util.Arrays; // import : �ٸ� ��Ű���κ��� Ŭ���� ��������
import java.util.Collections;
// java.lang : ��Ű���� ����

public class Day12_1 {
// P.521
	
	public static void main(String[] args) {
		// 1. Arrays Ŭ����
			// copyOf(���翭 �迭, �������) : �迭 ����
		
		char[] arr1 = {'J', 'A', 'V', 'A'};
		// char : �⺻ �ڷ��� ['����']
		// String : Ŭ����["���ڿ�"]
		
		// �迭 ���� = �迭��.length : �ʵ�
		// ���ڿ� ���� = ���ڿ�.length() : �޼ҵ�
		
		// ���1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		// ���� Ŭ�������� �ٸ� Ŭ���� �� �޼ҵ� ȣǮ�ϴ� ���
			// . : ���� �����ڸ� ���� �޼ҵ� ȣ��
			// 1. ��ü�� ���� �޼ҵ��� ȣ��
				// Ŭ������ ��ü�� = new ������()
				// ��ü��.�޼ҵ��()
			// 2. static �޼ҵ� ��ü���� ȣ��
				// Ŭ������.�޼ҵ��()
		
		// Arrays.toString(�迭) : �ε��� ������ ������ ���
		System.out.println(Arrays.toString(arr2));
		// 3. copyOfRange(���翭 �迭, ���� �ε���, �� �ε���)
		
		// ���2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // [1] ~ [2] ����
		System.out.println(Arrays.toString(arr3));
		// 4. System.arraycopy(���� �迭, ���� �ε���, Ÿ�ٹ迭, Ÿ�� ���� �ε���, ���簳��)
		
		// ���3
		char[] arr4 = new char[arr1.length]; // �迭1�� ���̸�ŭ �迭4 ����
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		
// P.522
		// 5. Arrays.equals(�迭1, �迭2) : 1���� �迭
		// 6. Arrays.deepEquals(�迭1, �迭2) : 2���� �迭 ��
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println("1�� �迭 �� : " + Arrays.equals(arr1, arr2));
		// System.out.println("2�� �̻� �迭 �� : " + Arrays.deepEquals(arr1, arr2));
		
		// 7. Arrays.sort(�迭��) : �ش� �迭 �� ���� // sort�� �������� ����
		Arrays.sort(arr1);
		System.out.println("�迭 �ּ� ���� : " + arr1.toString());
		System.out.println("�迭 �� ������ ���� : " + Arrays.toString(arr1));
		
		// 8. Arrays.sort(�迭��, Collections.reverseOrder()) : �迭 �� ��������
			// * ����! : �ش� �迭�� �⺻ �ڷ����� ��� �Ұ�
		// Arrays.sort(arr1, Collections.reverseOrder()); // Character ���
		
// P.526
		// 9. Arrays.binarySearch(�迭��, ������) : �ش� �������� �ε��� ��ȣ
		// * ���� : ��������(sort �Ŀ� ���) ���� �� ���
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println(index);
		System.out.println(Arrays.binarySearch(arr1, 'J'));
	}
}