package Day14;

public class Util {
public static <T> Box<T> boxing(T t){ // T = Integer
		// <���׸�> ��ȯŸ�� �޼ҵ��(����)
	Box<T>box = new Box<>();
	box.setT(t);
	return box;
}
}
