package june17_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaebbbsii";
		char[] strArray = str.toCharArray();
		
		Map<Character, Integer> hMap = new LinkedHashMap<Character, Integer>();
		for(char c: strArray) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> mapEntry: hMap.entrySet()) {
			
			if(mapEntry.getValue()==1) {
				System.out.println(mapEntry.getKey()+" is the unique character in given String: "+ str);
				break;
			}
		}

	}

}
