package array.multi;

public class MultiDarray {
	
	public static void main(String[] args) {
		char stars[][];
		
		stars = new char[6][];
		
		for(int idx = 0; idx < stars.length; idx++) {
			stars[idx] = new char[idx + 1];
			for(int idx2 = 0; idx2 < stars[idx].length; idx2++) {
				stars[idx][idx2] = '*';
				System.out.print(stars[idx][idx2] + " ");
			}
			System.out.println();
		}
	}
}
