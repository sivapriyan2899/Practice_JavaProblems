package june_2026;

import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strOne= "raace";
		String strTwo="care";
		
		String[] strOneArray = strOne.split("");
		String[] strTwoArray = strTwo.split("");
		
		Arrays.sort(strOneArray);
		Arrays.sort(strTwoArray);
		
		if(Arrays.equals(strOneArray, strTwoArray)) {
			System.out.println("Yes the given Strings are anagram");
		}else {
			System.out.println("No the given strings are not anagram");
		}
		
	}

}
