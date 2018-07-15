package shoes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import shoes.Shoe;
import shoes.ShoeCollections;

public class ShoeMap implements ShoeCollections {
	
	// 1. 멤버변수 선언부
	private Map<String, Shoe> shoes;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자
	public ShoeMap() {
		shoes = new HashMap<String, Shoe>();
	}
	
	// (2) 매개변수를 받는 생성자
	public ShoeMap(Map<String, Shoe> shoe) {
		shoes = shoe;
	}
	
	// 접근자
	public Map<String, Shoe> getShoes() {
		return shoes;
	}
	
	// 수정자
	public void setShoes(Map<String, Shoe> shoes) {
		this.shoes = shoes;
	}
	
	// 신발 정보 추가
	@Override
	public int add(Shoe shoe) {
		int addSuccess = 0;
		
		if (!shoes.containsValue(shoe)) {
			shoes.put(shoe.getShoeCode(), shoe);
			
			addSuccess = 1;
		}
		
		return addSuccess;
	}

	// 신발 한 종류 정보 수정
	@Override
	public int set(Shoe shoe) {
		int setSuccess = 0;
		
		if (shoes.containsKey(shoe.getShoeCode())) {
			shoes.put(shoe.getShoeCode(), shoe);
			
			setSuccess = 1;
		}
		
		return setSuccess;
	}

	// 신발 한 종류 정보 제거
	@Override
	public int remove(Shoe shoe) {
		int removeSuccess = 0;
		
		if (shoes.containsValue(shoe)) {
			shoes.remove(shoe.getShoeCode());
			
			removeSuccess = 1;
			
		}
		
		return removeSuccess;
	}

	// 신발 한 종류 정보 리턴
	@Override
	public Shoe get(Shoe shoe) {
		Shoe found = null;
		
		if (shoes.containsKey(shoe.getShoeCode())) {
			found = shoes.get(shoe.getShoeCode());
		}
		
		return found;
	}

	// 전체 신발 정보 리턴
	@Override
	public List<Shoe> getAllShoes() {
		List<Shoe> shoeList = new ArrayList<Shoe>();
		
		for (Shoe shoe: shoes.values()) {
			shoeList.add(shoe);
		}
		
		return shoeList;
	}

}
