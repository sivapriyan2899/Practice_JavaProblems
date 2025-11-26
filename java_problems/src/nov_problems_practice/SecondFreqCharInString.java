package nov_problems_practice;

import java.util.HashMap;

public class SecondFreqCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="siivgga";
		char[] chArr = name.toCharArray();
		
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		
		for(char c: chArr) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
		}
		
		
		
	}

}
