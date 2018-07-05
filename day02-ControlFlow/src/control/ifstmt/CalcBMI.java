package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		// 1. 선언
		double weight;
		double height;
		double bmi;
		String ponderalIndex;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		
		System.out.print("키(cm)를 입력하세요 : ");
		height = scan.nextDouble();
		height /= 100;
		System.out.print("몸무게(kg)를 입력하세요 : ");
		weight = scan.nextDouble();
		
		bmi = weight / (height * height);
		
		if (bmi > 40) {
			ponderalIndex = "병적인 비만";
		} else if (bmi > 27.5) {
			ponderalIndex = "비만";
		} else if (bmi >= 23) {
			ponderalIndex = "과체중";
		} else if (bmi >= 18.5) {
			ponderalIndex = "정상";
		} else if (bmi >= 15) {
			ponderalIndex = "저체중";
		} else {
			ponderalIndex = "병적인 저체중";
		}
		
		System.out.println("BMI : " + bmi);
		System.out.println("비만도 : " + ponderalIndex);
		
		scan.close();
	}
}
