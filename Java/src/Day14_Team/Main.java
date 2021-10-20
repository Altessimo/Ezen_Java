package Day14_Team;

public class Main {
	/*
	 * ��� ���α׷�
	 * ���� 1. �޴�(���ѷ���)
	 *	   1. ����߰�
	 * 	   2. ������
	 * ���� 2. �Ƹ�, ����, �Է¹޾� �Ʒ����ǿ� ���� ��� ���
	 * ���� 3. ���̰� 8�� �̸� �̸� ���� ��� ���
	 * 		  ���̰� 20�� �̸��̸� û�ҳ� ��� ���
	 * 		  �� �ܴ� ���� ��� ���
	 * ���� 3. ��� ��½� ��ܺ� �ο����� ��� �̸� ���
	 * ���� 4. ����, û�ҳ�, ���� �� ������κ��� ���
	 */
	
	public static void main(String[] args) {
		// Course ��ü ���� -> �̸��� �迭ũ�⸦ �޾Ƽ� �ν��Ͻ� ����
				Course<Person> generalCourse = new Course<>("[�Ϲ� ����]", 10);
				Course<Person> childCourse = new Course<>("[���� ����]", 10);
				Course<Person> teenCourse = new Course<>("[û�ҳ� ����]", 10);

				boolean run = true;

				while (run) {

					try {
						Scanner scanner = new Scanner(System.in);
						System.out.println("1. ��� ��� | 2. ��� ��� | 3. ���� : ");
						int ch = scanner.nextInt();

						if (ch == 1) {
							System.out.println("������ �̸�, ���̸� �Է��ϼ���. ");
							// ��� �Է�
							System.out.print("�̸� : ");
							String name = scanner.next();
							System.out.print("���� : ");
							int age = scanner.nextInt();

							if (age < 8 && age > 0) {
								System.out.println("���� ���� ��������մϴ�. ");
								childCourse.add(new Person(name, age));
							} else if (age >= 8 && age < 20) {
								System.out.println("û�ҳ� ���� ��������մϴ�. ");
								teenCourse.add(new Person(name, age));
							} else if (age > 20) {
								System.out.println("�Ϲ� ���� ��������մϴ�. ");
								generalCourse.add(new Person(name, age));
							}

						} else if (ch == 2) {
							// ��� ���
							registerCourse(childCourse);
							registerCourse(teenCourse);
							registerCourse(generalCourse);

						} else if (ch == 3) {
							System.out.println("[���α׷� ����]");
							run = false;
						}
					} catch (Exception e) {
						System.out.println("[�����߻�] ��ȿ���� ���� �Է��Դϴ�. " + e);
					}

				}

			}

			public static void registerCourse(Course<?> course) {

				System.out.println(course.getName() + " [������] : ");
				System.out.println("---------------------------------------------------");

				for (int i = 0; i < course.getStudents().length; i++) {
					if (course.getStudents()[i] != null) {
						System.out.print((course.getStudents()[i]) + " | ");
					}
				}

				System.out.println();
				System.out.println("---------------------------------------------------");
			}

		}