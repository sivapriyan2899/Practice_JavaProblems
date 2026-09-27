package june17_2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray = {4,3,5,5};
		
		Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		
		for(int n: numArray) {
			hMap.put(n, hMap.getOrDefault(n, 0)+1);
		}
		
		ArrayList<Integer> duplicateElements = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> mapEntry: hMap.entrySet()) {
			if(mapEntry.getValue()>1) {
				duplicateElements.add(mapEntry.getKey());
			}
		}
		if(duplicateElements.size()>1) {
			System.out.println(duplicateElements+" are the duplicate elements in the given string");
		}else {
			System.out.println(duplicateElements+" is the duplicate element in the given string");
		}
		
	}

}
