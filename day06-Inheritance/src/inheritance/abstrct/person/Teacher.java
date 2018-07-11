package inheritance.abstrct.person;

public class Teacher extends Person {
	
	// 1. 멤버변수 선언부
	String subject;
	
	// 2. 생성자 선언부
	Teacher() {
		super();
	}
	
	Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.subject = subject;
	}

	// 3. 메소드 선언부
	@Override
	public String toString() {
		String TeacherStr = String.format(", 과목 : %s", this.subject);
		return "교사 정보[" + super.toString() + TeacherStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== 교사 ==");
		System.out.println(this);
	}
	
}
