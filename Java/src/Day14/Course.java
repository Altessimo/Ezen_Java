package Day14;

public class Course<T> {
	
// 1. 필드
private String name;
private T[] students;

// 생성자
public Course(String name, int capacity) {
	this.name = name;
	students = (T[])new Object[capacity]; // T = 외부로 부터 받은 매개값
	// 제네릭 자체적으로 NEW 연산자 불가 
	// object 으로 배열 선언후 제네릭으로 형변환
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
