package Day14;

public class Day14_1 {

	public static void main(String[] args) {
		// 제네릭 : 타입변환 / 제네릭이 없는 경우
		Member<String, Integer> member = new Member();
		
		// P.660 : 제네릭 메소드
		Box<Integer> box1 = Util.<Integer>boxing(100);
		System.out.println(box1.getT());
		
		Box<String> box2 = Util.boxing("홍길동");
		System.out.println(box2.getT());
		
		
	}
}