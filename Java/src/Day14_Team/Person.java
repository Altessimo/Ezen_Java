package Day14_Team;

public class Person {
	// ��ü�� �ʵ� 
	
		// ȸ���� �̸� 
		private String name;
		// ȸ���� ���� 
		private int age;

		// ������ 
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return this.name;
		}

	}