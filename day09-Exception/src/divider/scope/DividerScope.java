package divider.scope;

/**
 * level1() -> level2() -> level3()
 * 의 순서로 메소드 호출이 일어나는 클래스
 * 
 * level3() 메소드 안에 0으로 나누는 상황이
 * 발생할 수 있는 연산을 수행한다
 * 
 * level3()에서 발생한 예외가 메소드 호출의
 * 반대순서로 전파되는 것을 확인
 * 
 * @author PC38218
 *
 */
public class DividerScope {
	
	public void level3(int input) throws DivideZeroException {
		// 1. 선언 : 나눗셈을 수행할 Divider 객체 참조 변수
		Divider div;
		
		// 2. 초기화
		div = new Divider();
		
		System.out.println("== level3이 시작되었습니다. ==");
		
		div.divide(input);
		
		System.out.println("== level3이 종료되었습니다. ==");
	}
	
	public void level2() throws DivideZeroException {
		System.out.println("== level2가 시작되었습니다. ==");
		
		level3(0);
		
		System.out.println("== level2가 종료되었습니다. ==");
	}
	
	public void level1() {
		System.out.println("== level1이 시작되었습니다. ==");

		try {
			level2();
		} catch (DivideZeroException e) {
			System.err.println("문제 발생!:" + e);
			e.printStackTrace();
		}
		
		System.out.println("== level1이 종료되었습니다. ==");
	}
}