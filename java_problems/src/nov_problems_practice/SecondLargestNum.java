package nov_problems_practice;

import java.util.HashMap;
import java.util.Map;

public class SecondLargestNum {
	
	

	public static void main(String[] args) {
		
		int max1=1,max2=0,temp;
		char char1=0, char2=0;
		String name="siaiivssssvvva";
		char[] chArr = name.toCharArray();
		
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		
		for(char c: chArr) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}
		//System.out.println(hMap);
		
		for(Map.Entry<Character, Integer> mapEntry: hMap.entrySet()) {
			temp=mapEntry.getValue();
			if(temp>max1) {
				max1=temp;
				char2=char1;
				char1=mapEntry.getKey();	
			}
			else if(temp>max2) {
				
			}
		}
		System.out.println(char2);
	}
}
