package Day14;

public class Course<T> {
	
// 1. �ʵ�
private String name;
private T[] students;

// ������
public Course(String name, int capacity) {
	this.name = name;
	students = (T[])new Object[capacity]; // T = �ܺη� ���� ���� �Ű���
	// ���׸� ��ü������ NEW ������ �Ұ� 
	// object ���� �迭 ������ ���׸����� ����ȯ
} 

public String getName() {return name;}
public T[] getStudents() {return students;}

public void add(T t) {
	for(int i=0; i<students.length; i++) {
		if(students[i]!=null) {
			students[i] = t; break;
		}
	}
}
}
