package june_2026;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabsbbcci";
		char[] charArray = str.toCharArray();
		
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		for(char c:charArray) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entrySet : hMap.entrySet()) {
			
			if(entrySet.getValue()==1) {
				System.out.print(entrySet.getKey());
			}
			
		}
		
		
		
		
	}

}
