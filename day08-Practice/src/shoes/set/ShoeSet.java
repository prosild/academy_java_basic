package shoes.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import shoes.Shoe;
import shoes.ShoeCollections;

public class ShoeSet implements ShoeCollections {

	// 1. 멤버변수 선언부
	private Set<Shoe> shoes;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자
	public ShoeSet() {
		shoes = new HashSet<Shoe>();
	}
	
	// (2) 매개변수를 받는 생성자
	public ShoeSet(Set<Shoe> shoe) {
		shoes = shoe;
	}
	
	// 접근자
	public Set<Shoe> getShoes() {
		return shoes;
	}
	
	// 수정자
	public void setShoes(Set<Shoe> shoes) {
		this.shoes = shoes;
	}
	
	// 신발 정보 추가
	@Override
	public int add(Shoe shoe) {
		int addSuccess = 0;
		
		if (!shoes.contains(shoe)) {
			shoes.add(shoe);
			addSuccess = 1;
		}
		
		return addSuccess;
	}

	// 신발 한 종류 정보 수정
	@Override
	public int set(Shoe shoe) {
		int setSuccess = 0;
		
		if (shoes.contains(shoe)) {
			shoes.remove(shoe);
			shoes.add(shoe);
			setSuccess = 1;
		}
		
		return setSuccess;
	}

	// 신발 한 종류 정보 제거
	@Override
	public int remove(Shoe shoe) {
		int removeSuccess = 0;
		
		if (shoes.contains(shoe)) {
			shoes.remove(shoe);
			removeSuccess = 1;
		}
		
		return removeSuccess;
	}

	// 신발 한 종류 정보 리턴
	@Override
	public Shoe get(Shoe shoe) {
		Shoe found = null;
		
		for (Shoe sh: shoes) {
			if (sh.equals(shoe)) {
				found = sh;
				
				break;
			}
		}
		
		return found;
	}

	// 전체 신발 정보 리턴
	@Override
	public List<Shoe> getAllShoes() {
		List<Shoe> shoeList = new ArrayList<Shoe>();
		
		for (Shoe shoe: shoes) {
			shoeList.add(shoe);
		}
		
		return shoeList;
	}

}
