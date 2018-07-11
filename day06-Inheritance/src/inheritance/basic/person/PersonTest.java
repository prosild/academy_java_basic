package inheritance.basic.person;

/**
 * Person과 상속관계인 Student를
 * 테스트하는 클래스이다.
 * @author PC38218
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		
		// 1. 선언
		Person person = new Person("P01", "홍길동", 18);
		Student student = new Student("S02", "홍길동", 18, "도술");
		Employee emp = new Employee("E03", "허균", 48, "문학예술지원부");
		Teacher teacher = new Teacher("T04", "정약용", 25, "행정");
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(emp);
		System.out.println(teacher);
		
	}
}
