package nov_problems_practice;

import java.util.Arrays;

public class SortingStringWithSortMethod {

	public static void main(String[] args) {
		
		String [] strArr = {"sivb", "jon", "siva", "mia"};
		
		Arrays.sort(strArr);
		
		for(String s: strArr) {
			System.out.println(s);
		}
		
	}

}
