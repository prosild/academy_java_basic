package control.loop;

/**
 * 구구단에서 곱셈의 결과가 50이 넘으면 중단하도록
 * break 구문을 for 반복문과 조합하여 테스트해보는 클래스
 * 
 * @author PC38218
 *
 */
public class NineNineBreak {
	
	public static void main(String[] args) {
		OUT : for (int stage = 2; stage <= 9; stage++) {
			// 단의 제목 출력
			System.out.printf("%n%d단%n", stage);
			for (int times = 1; times <= 9; times++) {
				if (stage * times > 50) {
					break OUT;
				}
				System.out.printf("%d X %d = %d%n", stage, times, stage * times);
			}
		}
	}
}
