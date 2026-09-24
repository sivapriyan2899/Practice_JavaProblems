package june_2026;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sivappp";
		char[] charArray = str.toCharArray();
		
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		
		for (char c : charArray) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);	
		}
		
		for (Map.Entry<Character, Integer> entrySet: hMap.entrySet()) {
			if (entrySet.getValue()>1) {
				System.out.println(entrySet.getKey()+" is a duplicate value");
			}
		}
	}
}
