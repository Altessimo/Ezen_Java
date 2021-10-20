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
		set.add("java"); // 중복발생[set는 자동적으로 중복 제거]
		set.add("ibatis");
		
		// 3. set 출력[출력순서는 없음]
		System.out.println(set);
		System.out.println(set.size());
		
		// 4. Iterator : 인터페이스를 이용한 set내 객체호출[인덱스가 존재하기 않기때문에]
		// Iterator : (순서없는) set내 겍체 하나씩 순화하는 반복자
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			// .hasNext() : 다음 객체가 존재하면 true 아니면 false
			String element = iterator.next(); // 다음 객체 가져오기
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
