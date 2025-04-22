package april_PracticeProblems;

import java.util.HashMap;
import java.util.Map;

public class CompressedStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abbccc";
		
		String[] strArray = str.split("");
		
		
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		
		
		for (String string : strArray) {
			hmap.put(string, hmap.getOrDefault(string, 0)+1);
		}
		
		StringBuilder strbuilder = new StringBuilder();
		
		for(Map.Entry<String, Integer> entry : hmap.entrySet()) {
			strbuilder.append(entry.getKey()).append(entry.getValue());
		}
		
		System.out.println(strbuilder);
		
	}

}
