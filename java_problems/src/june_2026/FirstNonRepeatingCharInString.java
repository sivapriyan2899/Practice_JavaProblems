package june_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ccaasivv";
		char[] charArray = str.toCharArray();
		
		Map<Character, Integer> linkedHashMap = new LinkedHashMap<Character, Integer>();
		for(char c:charArray) {
			linkedHashMap.put(c, linkedHashMap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entries : linkedHashMap.entrySet()) {
			//System.out.println(entries.getKey() +" "+entries.getValue());
			if(entries.getValue()==1) {
				System.out.println(entries.getKey()+" - is the first non repeating character in the given String: "+str);
				return;
			}
		}
	}

}
