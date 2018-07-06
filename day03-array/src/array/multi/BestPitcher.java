package array.multi;

/**
 * 야구 구단의 1 ~5선발 선수의 방어율을 입력하고 그 중 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 * 
 */
import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		
		// 각 팀별로 각 투수의 방어율을 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		for (int idx = 0; idx < ERA.length; idx++) {
			System.out.print((idx + 1) + "번째 팀 1 ~ 5선발 투수 방어율 : ");
			
			for(int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				ERA[idx][idx2] = scan.nextDouble();
				
				if (min > ERA[idx][idx2]) {
					min = ERA[idx][idx2];
				}
			}
		}
		
		for (int idx = 0; idx < ERA.length; idx++) {
			for(int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				if (ERA[idx][idx2] == min) {
					System.out.printf("최고의 투수는 %d번팀의 %d번째 선수입니다. 방어율 : %.2f", idx + 1, idx2 + 1, min);
					break;
				}
			}
		}
		
		scan.close();
	}
}
/*1.1 0.7 0.01 0.12 0.4
0.42 0.6 0.8 0.7 0.11
0.7 0.9 0.45 0.6 0.5*/