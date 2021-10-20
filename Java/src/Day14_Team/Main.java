package Day14_Team;

public class Main {
	/*
	 * 명단 프로그램
	 * 조건 1. 메뉴(무한루프)
	 *	   1. 명단추가
	 * 	   2. 명단출력
	 * 조건 2. 아름, 나이, 입력받아 아래조건에 따라 명단 출력
	 * 조건 3. 나이가 8세 미만 이면 유아 명단 등록
	 * 		  나이가 20세 미만이면 청소년 명단 등록
	 * 		  그 외는 성인 명단 등록
	 * 조건 3. 명단 출력시 명단별 인원들의 모든 이름 출력
	 * 조건 4. 유아, 청소년, 성인 → 사람으로부터 상속
	 */
	
	public static void main(String[] args) {
		// Course 객체 생성 -> 이름과 배열크기를 받아서 인스턴스 생성
				Course<Person> generalCourse = new Course<>("[일반 과정]", 10);
				Course<Person> childCourse = new Course<>("[유아 과정]", 10);
				Course<Person> teenCourse = new Course<>("[청소년 과정]", 10);

				boolean run = true;

				while (run) {

					try {
						Scanner scanner = new Scanner(System.in);
						System.out.println("1. 명단 등록 | 2. 명단 출력 | 3. 종료 : ");
						int ch = scanner.nextInt();

						if (ch == 1) {
							System.out.println("수강생 이름, 나이를 입력하세요. ");
							// 명단 입력
							System.out.print("이름 : ");
							String name = scanner.next();
							System.out.print("나이 : ");
							int age = scanner.nextInt();

							if (age < 8 && age > 0) {
								System.out.println("유아 과정 등록진행합니다. ");
								childCourse.add(new Person(name, age));
							} else if (age >= 8 && age < 20) {
								System.out.println("청소년 과정 등록진행합니다. ");
								teenCourse.add(new Person(name, age));
							} else if (age > 20) {
								System.out.println("일반 과정 등록진행합니다. ");
								generalCourse.add(new Person(name, age));
							}

						} else if (ch == 2) {
							// 명단 출력
							registerCourse(childCourse);
							registerCourse(teenCourse);
							registerCourse(generalCourse);

						} else if (ch == 3) {
							System.out.println("[프로그램 종료]");
							run = false;
						}
					} catch (Exception e) {
						System.out.println("[오류발생] 유효하지 않은 입력입니다. " + e);
					}

				}

			}

			public static void registerCourse(Course<?> course) {

				System.out.println(course.getName() + " [수강생] : ");
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