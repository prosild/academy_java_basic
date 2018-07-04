package type.primitive;

/**
 * 실수형 타입인 float, double 타입을
 * 테스트하는 클래스이다
 * 
 * @author PC38218
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		// 1. 선언
		float pi1;
		double pi2;
		
		// 2. 초기화
		pi1 = 3.14f;
		pi2 = 3.14;
		
		// 3. 사용 : 변수 값 출력
		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
		
		pi1 = 3.141592653557979323846f;
		pi2 = 3.141592653557979323846;

		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
	}

}
