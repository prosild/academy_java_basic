package array.multi;

/**
 * 3명의 양궁선수가 맞힌 과녁의 점수를 각각 차시(9차시까지)별로 배열에 입력하고
 * 전체 합산 점수가 가장 높은 선수의 인덱스와 점수를 출력
 */
import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		int index = 0;
		
		// 각 선수별로 과녁 점수를 입력받아 배열에 저장
		System.out.println("양궁 선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.print((idx + 1) + "번째 선수 점수 입력 : ");
			for (int idx2 = 0; idx2 < score[idx].length; idx2++) {
				score[idx][idx2] = scan.nextInt();
				sum[idx] += score[idx][idx2];
			}
			
			if(sum[idx] > max) {
				max = sum[idx];
				index = idx + 1;
			}
		}
		
		System.out.println("우승 선수");
		System.out.printf("점수가 가장높은 선수는 %d번째 선수입니다. 점수는 : %d", index, max);
	}
}
// 8 9 8 7 9 9 9 5 7
// 7 9 9 9 9 9 9 9 8
// 10 8 7 6 5 4 7 8 9