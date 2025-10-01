package april_PracticeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortChar_Frequency_Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "siivvvva";
		
		//splitting given string and storing in array
		String [] strArray = str.split("");
		
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		
		for (String string : strArray) {
			hmap.put(string, hmap.getOrDefault(string, 0)+1);
		}
		
	/*	for(Map.Entry<String, Integer> s: hmap.entrySet()) {
			System.out.println(s.getKey()+" - "+s.getValue());	
		} */
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(hmap.entrySet());
	//	System.out.println(list);
		
		//Collections.sort(list, );
		
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		for(Map.Entry<String, Integer> l: list) {
			System.out.println(l.getKey()+" - "+l.getValue());
		}
		
	
			
			
		
		
	}

}
