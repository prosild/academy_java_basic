package shoes.list;

import java.util.ArrayList;
import java.util.List;

import shoes.Shoe;

/*
-----------------------------------------------
Shoe : class :신발의 정보를 저장하는 클래스
-----------------------------------------------
-shoeCode : String : 신발 제품코드
-shoeName : String : 신발 제품 명
-size     : int    : 신발의 사이즈(한국형 크기 240, 250 등)
-price    : int    : 가격
-type     : String : 신발의 타입
                     (운동화, 샌들, 구두, 슬리퍼, 부츠 등)
-quantity : int    : 재고수량
----------------------------------------------
+ 기본생성자 / + 생성자 중복정의 할 수 있는 만큼 모두
----------------------------------------------
+ 각 필드의 접근자 / 수정자 메소드
+ shoeCode 기준 equals(), hashCode() 재정의
+ toString() 재정의
===============================================                     
ShoeTest : class : Shoe 클래스를 테스트
--------------------------------------------
*/

public class ShoeTest {
	
	public static void main(String[] args) {
		/* 1. Shoe 타입의 객체를 4개 생성
		   	  shoeCode 는 SH001 과 같이 일련번호를 부여
		      shoeName, size, price, type 등은 
		      실제로 있는 데이터 인터넷 검색하여 생성
		*/
		Shoe adidas = new Shoe("SH001", "스탠 스미스", 280, 65000, "운동화", 2);
		Shoe nike = new Shoe("SH002", "우먼스 나이키 탄준 샌들", 270, 41300, "샌들", 5);
		Shoe stilmoda = new Shoe("SH003", "코랄로", 280, 59000, "구두", 3);
		Shoe hawkins = new Shoe("SH004", "첼시 러그", 265, 90000, "부츠", 2);
		
		/* 2. (1) Shoe 타입을 저장할 수 있는 List<Shoe> shoes 를
	              선언하여 리스트에 add(shoe) 로 추가
	    	  (2) Set<Shoe> shoes 를 선언하여 add(shoe)로 추가
	    	  (3) Map<Shoe> shoes 를 선언하여 put(code, shoe)로 추가
	    */
		List<Shoe> shoes = new ArrayList<Shoe>();

		shoes.add(adidas);
		shoes.add(nike);
		shoes.add(stilmoda);
		shoes.add(hawkins);

		ShoeList shoeList = new ShoeList(shoes);

		// 3. 각 자료구조별 shoes 를 foreach 로 출력
		System.out.println("3. --------------------------------------------------------------------------------------------------------------");
		for (Shoe shoe: shoeList.getAllShoes()) {
			System.out.println(shoe);
		}
		
		// 4. SH003 번 코드로 등록된 신발의 정보 1개를 출력		
		System.out.println("4. --------------------------------------------------------------------------------------------------------------");
		Shoe stilmoda2 = new Shoe("SH003");
		System.out.println(shoeList.get(stilmoda2));
		
		// 5. SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		Shoe stilmoda3 = new Shoe("SH003", "코랄로", 280, 59000, "구두", 0);
		
		shoeList.set(stilmoda3);
				
		// 6. 재고가 조정된 내용 출력
		System.out.println("6. --------------------------------------------------------------------------------------------------------------");
		System.out.println(shoeList.get(stilmoda3));
		
		// 7. SH003 번 코드로 등록된 신발 정보를 삭제
		shoeList.remove(stilmoda2);
		
		// 8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)
		System.out.println("8. --------------------------------------------------------------------------------------------------------------");
		for (Shoe shoe: shoeList.getAllShoes()) {
			System.out.println(shoe);
		}
	}	
}