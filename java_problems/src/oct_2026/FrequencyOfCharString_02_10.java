package oct_2026;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharString_02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="siivvva";
		char[] strArray=str.toCharArray();

		Map<Character, Integer> hMap = new HashMap<Character, Integer>();

		for(Character c: strArray) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}

		for(Map.Entry<Character, Integer> entryMap : hMap.entrySet()) {
			System.out.println(entryMap.getKey() +" = "+ entryMap.getValue());
		}

	}

}
