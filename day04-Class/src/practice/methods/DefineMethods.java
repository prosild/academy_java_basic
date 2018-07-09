package practice.methods;

public class DefineMethods {
	
	// 첫번째 장
	/**
	 * 1. 정수(input) 하나를 메소드 아규먼트로 입력 받아서
	 * 입력된 정수부터 10씩 증가하는 숫자를 10번 출력하는 메소드를 작성하시오.
	 */
	public void printTenTimes(int input) {
		for (int idx = 0; idx < 10; idx++) {
			System.out.printf("%d ", input + idx * 10);
		}
	}

	/**
	 * 2. 메시지(message)와 이름(name)을 메소드 아규먼트로 입력받아
	 * [name]의 메시지 : [message]......를 출력하는 메소드
	 * printSomebodysMessage를 작성
	 */
	public void printSomebodysMessage(String message, String name) {
		System.out.printf("%s의 메시지 : %s", name, message);
	}

	/**
	 * 3. String 타입의 메시지(message)를 메소드 아규먼트로 입력 받아서
	 * 그 메시지를 출력하는 메소드
	 * printMessage를 작성
	 */
	public void printMessage(String message) {
		System.out.printf("%s", message);
	}

	/**
	 * 4. String 타입의 메시지(message)를 메소드 아규먼트로 받아서
	 * 그 메시지를 그대로 리턴하는 메소드
	 */
	public String returnOriginalMessage(String message) {
		return message;
	}

	/**
	 * 5. 정수(input) 하나를 메소드 아규먼트로 입력 받아서
	 * 입력된 input + 10을 계산하여 리턴하는 메소드
	 * addTen을 작성
	 */
	public int addTen(int input) {
		return input + 10;
	}

	/**
	 * 6. 정수(input) 하나를 메소드 아규먼트로 입력 받아서
	 * 입력된 input - 10을 계산하여 리턴하는 메소드
	 * subtractTen을 작성
	 */
	public int subtractTen(int input) {
		return input - 10;
	}

	/**
	 * 7. 실수(input) 하나를 메소드 아규먼트로 입력 받아서
	 * 입력된 input * 2을 계산하여 리턴하는 메소드
	 * makeDouble을 작성
	 */
	public double makeDouble(double input) {
		return input * 2;
	}

	/**
	 * 8. 실수(input) 하나를 메소드 아규먼트로 입력 받아서
	 * 입력된 input - 5.5를 계산하여 리턴하는 메소드
	 * subtractFivePointFive를 작성
	 */
	public double subtractFivePointFive(double input) {
		return input - 5.5;
	}

	/**
	 * 9. 이름(name), 성(surname) 순서로 메소드 아규먼트로 입력받아
	 * 성 이름 순서로 조합하여 리턴하는 메소드
	 * makeFullName이라는 메소드를 작성하시오.
	 * @param name
	 * @param surname
	 * @return
	 */
	public String makeFullName(String name, String surname) {
		return surname + name;
	}

	/**
	 * 10. 두 개의 정수(x, y)를 메소드 아규먼트로 입력받아
	 * 두 수를 더한 결과를 리턴하는 메소드 add를 작성하시오.
	 * @param x
	 * @param y
	 * @return
	 */
	public int add(int x, int y) {
		return x + y;
	}

	/**
	 * 11. 두개의 실수(x, y)를 메소드 아규먼트로 입력받아
	 * 두 수를 더한 결과를 리턴하는 메소드 add를 작성하시오.
	 * @param x
	 * @param y
	 * @return
	 */
	public double add(double x, double y) {
		return x + y;
	}

	/**
	 * 12. 메시지(message)와 양의 정수(input)를 메소드 아규먼트로 입력받아
	 * 메시지를 출력하되 입력된 input의 숫자만큼 반복 출력하며
	 * 현재의 반복 횟수를 같이 출력하는 메소드를 작성하시오.
	 * @param message
	 * @param input
	 */
	public void printMsgManyTimes(String message, int input) {
		for (int idx = 1; idx <= input; idx++) {
			System.out.printf("반복횟수 : %d, %s%n", idx, message);
		}
	}

	/**
	 * 13. 사칙연산의 기호(+, -, *, /)가 입력될 연산자(operator)는 문자열로
	 * 피연산자(x, y)는 정수로 입력받아 기호에 따라 연산을 달리 수행하고
	 * 연산 결과를 출력하는 메소드
	 * @param operator
	 * @param x
	 * @param y
	 */
	public void arithmetic(char operator, int x, int y) {
		if (operator == '+') {
			System.out.printf("%d + %d = %d", x, y, x + y);
		} else if (operator == '-') {
			System.out.printf("%d - %d = %d", x, y, x - y);
		} else if (operator == '*') {
			System.out.printf("%d * %d = %d", x, y, x * y);
		} else if (operator == '/') {
			System.out.printf("%d / %d = %f", x, y, (double)x / y);
		} else {
			System.out.println("연산자를 잘못 입력했습니다.");
		}
	}

	/**
	 * 14. 13번의 메소드를 연산 결과를 double 타입으로 리턴하는 메소드로 변경하시오
	 * @param operator
	 * @param x
	 * @param y
	 * @return
	 */
	public double arithmetic(char operator, double x, double y) {
		double result;

		if (operator == '+') {
			result = x + y;
		} else if (operator == '-') {
			result = x - y;
		} else if (operator == '*') {
			result = x * y;
		} else if (operator == '/') {
			result = (double)x / y;
		} else {
			System.out.println("연산자를 잘못 입력하였습니다.");
			result = 0.0;
		}
		
		return result;
	}
	
	/**
	 * 15. 정수(input) 하나를 메소드 아규먼트로 입력 받아서
	 * 짝수이면 true, 홀수이면 false를 리턴하는 홀짝판별 메소드
	 * isEven 메소드를 작성하시오.
	 * @param input
	 * @return
	 */
	public boolean isEven(int input) {
		if (input % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// 두번째 장
	/**
	 * 1. 정수(x)를 매개변수로 입력받아
	 * x의 절댓값을 리턴하는 메소드
	 * absolute를 작성하시오.
	 * @param x
	 * @return
	 */
	public int absolute(int x) {
		if (x < 0) {
			return -1 * x;
		} else {
			return x;
		}
	}

	/**
	 * 2. 정수(x)를 메소드 매개변수로 입력받아
	 * 입력된 값의 배수 중 100 이하의 수를
	 * 모두 출력하는 메소드
	 * findMultiple를 작성하시오
	 * @param x
	 */
	public void findMultiple(int x) {
		int idx = 1;
		while (true) {
			if (x * idx <= 100) {
				System.out.printf("%d ", x * idx);
				idx++;
			} else {
				break;
			}
		}
	}

	/**
	 * 3. 매개변수로 입력된 정수(x)에 대하여
	 * 0 보다 작으면 "음의 정수"
	 * 0 이면 "정수 0"
	 * 0 보다 크면 "양의 정수"
	 * 와 같이 정수의 부호판별을 하여 판별 내용을
	 * 문자열로 리턴하는 메소드
	 * decideSign을 작성하시오.
	 * @param x
	 * @return
	 */
	public String decideSign(int x) {
		String result;
		
		if (x < 0) {
			result = "음의 정수";
		} else if (x == 0) {
			result = "정수 0";
		} else {
			result = "양의 정수";
		}
		
		return result;
	}

	/**
	 * 4. 문자열(message)와 정수(repeat)를 매개변수로 입력받아
	 * repeat 크기의 문자열 배열을 만들고
	 * 생성된 배열의 원소마다 message를 저장하고
	 * 배열의 내용을 출력하는 메소드
	 * repeatedMessage를 작성하시오.
	 * @param message
	 * @param repeat
	 */
	public void repeatedMessage(String message, int repeat) {
		String[] messages = new String[repeat];
		
		for (int idx = 0; idx < messages.length; idx++) {
			messages[idx] = message;
		}
		
		for (String temp : messages) {
			System.out.println(temp);
		}
	}

	/**
	 * 5. 원의 반지름을 매개변수 정수(r) 입력받아
	 * 원의 넓이를 구하여 double로 리턴하는 메소드
	 * calcCircleArea를 작성하시오. (원의 넓이 공식 : pi * r * r = 3.14 * r * r)
	 * @param r
	 * @return
	 */
	public double calcCircleArea(int r) {
		final double PI = 3.14;
		
		return PI * r * r;
	}

	/**
	 * 6. 정수(x)를 매개변수로 입력받아
	 * 입력된 값의 배수 중 100이하의 수를
	 * 배열에 저장하고
	 * 그 배열을 리턴하는 메소드
	 * @param x
	 * @return
	 */
	public int[] makeMultipleNums(int x) {
		int number;
		
		number = 100 / x;

		int[] arrays = new int[number];
		
		for (int idx = 0; idx < number; idx++) {
			arrays[idx] = (idx + 1) * x;
		}

		return arrays;
	}
	
}
