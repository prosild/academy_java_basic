package shoes.set;

import java.util.HashSet;
import java.util.Set;

import shoes.Shoe;
import shoes.ShoeCollections;

public class ShoeSet implements ShoeCollections {

	Set<Shoe> shoes;
	
	public ShoeSet() {
		shoes = new HashSet<Shoe>();
	}
	
	public ShoeSet(Set<Shoe> shoe) {
		shoes = shoe;
	}
	
	@Override
	public int add(Shoe shoe) {
		int addSuccess = 0;
		
		if (!shoes.contains(shoe)) {
			shoes.add(shoe);
			addSuccess = 1;
		}
		
		return addSuccess;
	}

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

	@Override
	public int remove(Shoe shoe) {
		int removeSuccess = 0;
		
		if (shoes.contains(shoe)) {
			shoes.remove(shoe);
			removeSuccess = 1;
		}
		
		return removeSuccess;
	}

	@Override
	public Shoe get(Shoe shoe) {
		Shoe found = null;
		
		for (Shoe sh: shoes) {
			if (sh.equals(shoe)) {
				found = shoe;
				break;
			}
		}
		
		return found;
	}

}
