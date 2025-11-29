package nov_problems_practice;

import java.util.Comparator;

public class SortingObjectDiscreteClass implements Comparator<SortingObjects> {

	@Override
	public int compare(SortingObjects o1, SortingObjects o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}

}
