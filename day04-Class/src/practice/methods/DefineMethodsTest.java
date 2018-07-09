package practice.methods;

public class DefineMethodsTest {
	
	public static void main(String[] args) {
		DefineMethods dm = new DefineMethods();
		
		System.out.println("문제 1");
		dm.printTenTimes(5);
		System.out.println("\n");
		
		System.out.println("문제 2");
		dm.printSomebodysMessage("오후 4시 42분", "박길수");
		System.out.println("\n");
		
		System.out.println("문제 3");
		dm.printMessage("2018년 7월 9일");
		System.out.println("\n");
		
		System.out.println("문제 4");
		System.out.println(dm.returnOriginalMessage("Java 5일차"));
		System.out.println();
		
		System.out.println("문제 5");
		System.out.println(dm.addTen(7));
		System.out.println();
		
		System.out.println("문제 6");
		System.out.println(dm.subtractTen(14));
		System.out.println();
		
		System.out.println("문제 7");
		System.out.println(dm.makeDouble(1.4));
		System.out.println();
		
		System.out.println("문제 8");
		System.out.println(dm.subtractFivePointFive(7.5));
		System.out.println();
		
		System.out.println("문제 9");
		System.out.println(dm.makeFullName("길수", "박"));
		System.out.println();
		
		System.out.println("문제 10");
		System.out.println(dm.add(4, 8));
		System.out.println();
		
		System.out.println("문제 11");
		System.out.println(dm.add(3.5, 2.6));
		System.out.println();
		
		System.out.println("문제 12");
		dm.printMsgManyTimes("다이어트", 5);
		System.out.println();
		
		System.out.println("문제 13");
		dm.arithmetic('+', 4, 8);
		System.out.println("\n");
		
		System.out.println("문제 14");
		System.out.println(dm.arithmetic('-', 1.5, 2.9));
		System.out.println();
		
		System.out.println("문제 15");
		System.out.println(dm.isEven(81));
		System.out.println();
		
		System.out.println("두번째 장");
		System.out.println("문제 1");
		System.out.println(dm.absolute(-24));
		System.out.println();
		
		System.out.println("문제 2");
		dm.findMultiple(5);
		System.out.println("\n");
		
		System.out.println("문제 3");
		System.out.println(dm.decideSign(-4));
		System.out.println();
		
		System.out.println("문제 4");
		dm.repeatedMessage("다이어트", 4);
		System.out.println();
		
		System.out.println("문제 5");
		System.out.println(dm.calcCircleArea(8));
		System.out.println();
		
		System.out.println("문제 6");
		for(int temp : dm.makeMultipleNums(4)) {
			System.out.println(temp);
		}
	}
}
