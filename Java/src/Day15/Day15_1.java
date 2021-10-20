package Day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.List;

public class Day15_1 {
	
	// �ϱ��ؾ��Ұ�
	
// �÷��� : [�迭���� ����] �ڷᱸ�� �������� ��ü�� �߰�, ����, �˻�
	
// 1. List : ����(�ε���)�� �����ϰ� ���� / �迭�� ���� / �ߺ� ���� ����
	// 1. ArrayList, 2. Vector 3. LinkedList
		// 1. ����Ʈ��.add(��ü��) : �ش� ��ü�� ����Ʈ�� ����
		// 2. ����Ʈ��.contains(��ü��) : �ش� ��ü�� ����Ʈ�� ���� ����(true, false)
		// 3. ����Ʈ��.IndexOf(��ü�� : �ش� ��ü�� �ε��� ��ȣ
		// 4. ����Ʈ��.get(�ε���) : �ش� �ε����� ��ü ȣ��
		// 5. ����Ʈ��.isEmpty() : ����Ʈ�� ����ִ��� Ȯ��(true, false)
		// 6. ����Ʈ��.size() : ����Ʈ �� ��ü ��
		// 7. ����Ʈ��.clear() : ����Ʈ �ʱ�ȭ[��� ��ü ����]
		// 8. ����Ʈ��.remove(�ε��� or ��ü��) : �ش� �ε��� Ȥ�� ��ü ����
	
	//2. ����
		// 1. ArrayList : ���Ͻ�����(����ȭX), �˻� ����
		// 2. Vector : ��Ƽ������(����ȭ)
		// 3. LinkedList : �߰��� ����/���� ����
	
// 2. Set : ������ �����ϰ� ���� / �ߺ� ���� �Ұ�
	// 1. HashSet, TreeSet
	// 1. set��.add(��ü��) : �ش� ��ü�� set�� ����
	// 2. set��.contains(��ü��) : �ش� ��ü�� set�� ���翩��Ȯ��(true, false)
	// 3. set��.isEmpty() : set�� ����ִ��� Ȯ��(true, false)
	// 4. set��.Iterator() : ����� ��ü�� �ϳ��� �������� �ݺ��� ����
		// 1. hasNext() : ���� ��ü�� �����ϸ� true ������ false
		// 2. next() : ��ü ��������
		// 3. remove() : ��ü ����
	// 5. set��.size() : set�� ��ü��
	// 6. set��.clear() : set �ʱ�ȭ
	// 7. set��.remove(��ü) : �ش� �ε��� ��ü����
	
// 3. Map : Ű/������ �ѽ����� ���� / Ű�� �ߺ� ���� �Ұ�(���� ����)
	// 1. HashMap, 2. Hashtable, 3. TreeMap, 4. Properties
		// 1. map��.put(Ű, ��)
		// 2. map��.containsKey(Ű) : Ű ���� ���� Ȯ��
		// 3. map��.containsValue(��) : �� ���� ���� Ȯ��
		// 4. map��.entyset() : �ش� ��Ʈ�� set�� ����
		// 5. map��.get(Ű) : �ش� Ű�� ���� ȣ��
		// 6. map��.isEmpty() : map�� ����ִ��� Ȯ��
		// 7. map��.Keyset() : �ش� Ű�� set�� ����
		// 8. map��.size() : map �� Ű�� ��
	// 2. ���� 
		// HashMap : ���� ������[����ȭ X]
		// Hashtable : ��Ƽ ������[����ȭ O]
	
	public static void main(String[] args) {
		// P.729
		// ArrayList : ����ȭ X �� ���Ͻ�����
		// Vector : ����ȭ O �� ��Ƽ������(��Ƽ�̵�� ���α׷���) Ex) ä��
		
		// 1. ����Ʈ ����[����Ʈ �ȿ� ���� �ڷ��� ����(���׸�)]
		Vector<Board> boards = new Vector<>(); 
		// <���׸�> : ����Ʈ �ȿ� �� �ڷ���
		// 2. ����Ʈ ��ü �ֱ�
			// 1.
		boards.add(new Board("����1", "����1", "�۾���1"));
			// 2.
			Board board = new Board("����2", "����2", "�۾���2");
		boards.add(board);
		boards.add(new Board("����3", "����3", "�۾���3"));
		boards.add(new Board("����4", "����4", "�۾���4"));
		boards.add(new Board("����5", "����5", "�۾���5"));
		
		System.out.println(boards);
		// ����
		boards.remove(2); // 2�� ��ü ���� �� �� 2�� �ڷ� 1ĭ�� �����
		boards.remove(3); // 3�� ��ü ���� �� �� 3�� �ڷ� 1ĭ�� �����
		
		// ���
		for(Board temp : boards) {
			// ����Ʈ �� ��ü�� �ϳ��� ���ʿ� ����
			System.out.println(temp.subject);
			System.out.println(temp.content);
			System.out.println(temp.writer);
		}
		// P.732
		// ArrayList : �߰�, �˻� ���� / �Ϲ����� ����Ʈ / ��Ƽ ������ : (������) Vector
		// LinkedList : ����, ���� ���� / 
		
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		// 1. ArrayList�� i�� 0�� �ε����� 10000�� ����
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("arraylist 10000 ���� �ð� : " + (endTime-startTime) + "ns");
		///////////////////////////////////////////////////////////////////////////////
		startTime=System.nanoTime();
		// 2. Linkedlist�� i�� 0�� �ε����� 10000�� ����
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
			endTime=System.nanoTime();
			System.out.println("arraylist 10000 ���� �ð� : " + (endTime-startTime) + "ns");
	}
}