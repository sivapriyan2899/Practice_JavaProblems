package nov_problems_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueOrNot {
	
	public static void main(String[] args) {
		
		String name ="ssiivvaa";
		char[] chArr = name.toCharArray();
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		for(char c : chArr) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}
		
		ArrayList<Character> repeatingChar = new ArrayList<Character>();
		for(Map.Entry<Character, Integer> mapValues : hMap.entrySet()) {
			if(mapValues.getValue()>1) {
				repeatingChar.add(mapValues.getKey());
			}
		}
		
		System.out.println(repeatingChar + " - repeated values");
		
	}

}
