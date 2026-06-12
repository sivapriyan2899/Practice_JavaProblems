package june_2026;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="soooper";
	String[] strArray = str.split("");
	
	Map<String, Integer> hMap = new HashMap<String, Integer>();
	
	for (String s : strArray) {
		hMap.put(s, hMap.getOrDefault(s, 0)+1);
	}
	
	for(Map.Entry<String, Integer> entrySet : hMap.entrySet()) {
		System.out.println(entrySet.getKey()+" = "+entrySet.getValue());
	}
	
	}

}
