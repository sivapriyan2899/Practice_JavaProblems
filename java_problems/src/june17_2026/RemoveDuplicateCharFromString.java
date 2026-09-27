package june17_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ssiiivvvvvaaacute";
		char[] charArray=str.toCharArray();
		
		Map<Character, Integer> hMap = new LinkedHashMap<Character, Integer>();
		
		for(char c: charArray) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entries : hMap.entrySet())  {
			if(entries.getValue()==1) {
				System.out.print(entries.getKey());
			}
		}
	}
}