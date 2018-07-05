package control.ifstmt;

/**
 * 다중 선택 if 구문을 사용하여 다음의 기준으로
 * 
 * 90점 이상 A
 * 80 ~ 89 B
 * 60 ~ 79 C
 * 40 ~ 59 D
 * 나머지 F
 * 
 * 입력된 점수에 대해 학점을 계산하는 클래스를 작성
 * 
 * 점수 int 타입 변수명 score
 * 학점 char 타입 변수명 grade를 사용할 것
 * 
 * 출력시 printf 사용
 * 
 */
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		// 1. 선언
		// 점수를 입력받을 변수, 학점을 저장할 변수 선언
		int score;
		char grade;
		//스캐너 변수 선언
		Scanner scan;
		
		// 2. 초기화
		// 스캐너 변수 초기화
		scan = new Scanner(System.in);
		
		// 스캐너를 사용하여 score 변수 초기화
		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();
		
		// 3. 사용 : score에 입력된 값을 판단
		while((score > 100 || score < 0)) {
			System.out.println("점수를 잘못 입력하였습니다.");
			System.out.print("다시 점수를 입력하세요(0 ~ 100) : ");
			score = scan.nextInt();
		}
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 60) {
			grade = 'C';
		} else if(score >= 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는 %d점이고, %c학점입니다.", score, grade);
		
		scan.close();
		
	}
}
