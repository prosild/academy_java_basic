package type.casting;

/**
 * 숫자형 데이터 사이에
 * 형 변환(type casting)을
 * 테스트하는 클래스이다
 * @author PC38218
 *
 */
public class TypeCastingTest {
	
	public static void main(String[] args) {
		// 1. 선언, 초기화
		double pi = 3.141592653557979323846;
		int number = 100;
		int result;
		
		// (타입)피연산자값 <= 피 연산자값을 강제 형변환 구문
		result = number + (int)pi;
		
		// 3. 사용 : 변수 값 출력
		System.out.println("double pi = " + pi);
		System.out.println("int number = " + number);
		System.out.println("int result = " + result);
	}
}
