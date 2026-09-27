package june17_2026;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
	
	public static void main(String[] args) {
		String str = "siiivvvvaa";
		char[] charArray=str.toCharArray();
		
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		
		for(char c: charArray) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> mapEntries: hMap.entrySet()) {
			
			System.out.println(mapEntries.getKey()+" "+mapEntries.getValue());
		}
	}

}
