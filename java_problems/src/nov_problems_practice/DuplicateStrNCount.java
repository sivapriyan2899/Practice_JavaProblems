package nov_problems_practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStrNCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="my is jname is my namo he he";
		String[] strArr =name.split(" ");
		
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		for(String s:strArr) {
			hMap.put(s, hMap.getOrDefault(s, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entryMap : hMap.entrySet()) {
			if(entryMap.getValue()>1) {
				System.out.println(entryMap.getKey()+" = "+entryMap.getValue());
			}
		}
	}
}
