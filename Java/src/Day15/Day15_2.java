package Day15;

import java.util.Iterator;
import java.util.HashSet;

public class Day15_2 {

	public static void main(String[] args) {
		// P.737 : MashSet
		HashSet<String> set = new HashSet<>();
		set.add("java");
		set.add("jdbc");
		set.add("servlet/jsp");
		set.add("java"); // �ߺ��߻�[set�� �ڵ������� �ߺ� ����]
		set.add("ibatis");
		
		// 3. set ���[��¼����� ����]
		System.out.println(set);
		System.out.println(set.size());
		
		// 4. Iterator : �������̽��� �̿��� set�� ��üȣ��[�ε����� �����ϱ� �ʱ⶧����]
		// Iterator : (��������) set�� ��ü �ϳ��� ��ȭ�ϴ� �ݺ���
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			// .hasNext() : ���� ��ü�� �����ϸ� true �ƴϸ� false
			String element = iterator.next(); // ���� ��ü ��������
			System.out.println("\t" + element);
		}
		// 4.
		for(String temp : set) {
			System.out.println("\t" + temp);
		}
		set.remove("jdbc");
		set.remove("ibatis");
		
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}
}
