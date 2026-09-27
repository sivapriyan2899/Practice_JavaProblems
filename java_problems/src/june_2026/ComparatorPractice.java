package june_2026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="siivvvaaaa";
		char[] charArray =str.toCharArray();
		
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		
		for(Character c: charArray) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}
		
		List<Map.Entry<Character, Integer>> entries = new ArrayList<>(hMap.entrySet());
		Collections.sort(entries, (a,b) -> a.getValue()-b.getValue());
		
		for(Map.Entry<Character, Integer> sortHashMap :entries) {
			System.out.println(sortHashMap.getKey()+" - "+sortHashMap.getValue());
		}
		
	}

}
