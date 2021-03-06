package shoes.list;

/*
-----------------------------------------------
package : shoes.list, shoes.map, shoes.set
---------------------------------------
ShoeList : shoes.list 패키지에 추가할 class
ShoeSet : shoes.set 패키지에 추가할 클래스
ShoeMap : shoes.map 패키지에 추가할 클래스
---------------------------------------
멤버변수 영역
- shoes : List<Shoe> 
- shoes : Set<Shoe> 
- shoes : Map<String, Shoe> 
---------------------------------------
생성자 영역
+ 기본생성자 : shoes 를 직접 ArrayList<Shoe> 로 초기화 
+ 기본생성자 : shoes 를 직접 HashSet<Shoe> 로 초기화
+ 기본생성자 : shoes 를 직접 HashMap<String, Shoe> 로 초기화
+ 매개변수가 있는 생성자
---------------------------------------
메소드 영역
+ add(Shoe shoe) : int : 추가 성공 : 1, 추가 실패 : 0
+ set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
+ remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
+ get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
+ getAllShoes()  : List<Shoe> : 전체목록을 리턴
---------------------------------------
*/

import java.util.ArrayList;
import java.util.List;

import shoes.Shoe;

public class ShoeList {

	// 1. 멤버 변수 선언부
	private List<Shoe> shoes;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자
	public ShoeList() {
		shoes = new ArrayList<Shoe>();
	}
	
	// (2) 매개변수를 받는 생성자
	public ShoeList(List<Shoe> shoes) {
		this();
		this.shoes = shoes;
	}
	
	// 접근자
	public List<Shoe> getShoes() {
		return shoes;
	}
	
	// 수정자
	public void setShoes(List<Shoe> shoes) {
		this.shoes = shoes;
	}
	
	// 신발 정보 추가
	public int add(Shoe shoe) {
		int addSuccess = 0;
		
		if (!shoes.contains(shoe)) {
			shoes.add(shoe);
			addSuccess = 1;
		}
		
		return addSuccess;
	}
	
	// 신발 한 종류 정보 수정
	public int set(Shoe shoe) {
		int setSuccess = 0;
		int setIndex = foundIndex(shoe);
		
		if (setIndex > -1) {
			shoes.remove(setIndex);
			shoes.add(setIndex, shoe);
			setSuccess = 1;
		}

		return setSuccess;
	}
	
	// 신발 한 종류 정보 제거
	public int remove(Shoe shoe) {
		int removeSuccess = 0;
		int removeIndex = foundIndex(shoe);
		
		if (removeIndex > -1) {
			shoes.remove(removeIndex);
			removeSuccess = 1;
		}
		
		return removeSuccess;
	}
	
	// 신발 한 종류 정보 리턴
	public Shoe get(Shoe shoe) {
		int getIndex = foundIndex(shoe);
		Shoe found = null;
		
		if (getIndex > -1) {
			found = shoes.get(getIndex);
		}
		
		return found;
	}
	
	// 전체 신발 정보 리턴
	public List<Shoe> getAllShoes() {
		return this.shoes;
	}
	
	// 리스트 인덱스 검색
	public int foundIndex(Shoe shoe) {
		int index = -1;
		
		for (int idx = 0; idx < shoes.size(); idx++) {
			if (shoes.get(idx).equals(shoe)) {
				index = idx;
			}
		}
		
		return index;
	}
}
