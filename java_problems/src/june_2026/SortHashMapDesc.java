package june_2026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ssssiiivva";
		char[] charArray = str.toCharArray();
		
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		
		for(char c : charArray) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}
		
		List<Map.Entry<Character, Integer>> listEntries = new ArrayList<Map.Entry<Character,Integer>>(hMap.entrySet());
		Collections.sort(listEntries, (a,b) -> b.getValue() - a.getValue());
		
		for(Map.Entry<Character, Integer> sortedEntries: listEntries) {
			System.out.println(sortedEntries.getKey()+" - "+sortedEntries.getValue());
		}
	}

}
