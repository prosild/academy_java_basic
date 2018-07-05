package control.loop;

public class SquareTable {

	public static void main(String[] args) {
		int[] numberArray = new int[10];
		
		for(int idx = 0; idx < numberArray.length; idx++) {
			numberArray[idx] = idx + 1;
		}
		
		for(int number : numberArray) {
			System.out.printf("%4d X %4d = %4d%n", number, number, number * number);
		}

	}

}
