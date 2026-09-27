package june17_2026;

import java.util.Arrays;

public class CheckTwoStringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "siva", str2 ="vadi";
		
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		
		if(Arrays.equals(str1Array, str2Array)) {
			System.out.println("given strings are anagram");
		}else
			System.out.println("given strings are not anagram");

	}

}
