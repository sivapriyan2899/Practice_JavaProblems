package oct_2026;

import java.util.Arrays;

public class Anagram_03_10 {
	
	public static void main(String[] args) {
		
		String str1="sivap";
		String str2="ivsa";;
		
		if(str1.length()!=str2.length()) {
			 System.out.println("Given strings are not anagram");
			return;
		}
		
		char[] str1Array=str1.toCharArray();
		char[] str2Array=str2.toCharArray();
		
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		
		if(Arrays.equals(str1Array,str2Array)) {
			
			System.out.println("Given Strings are anagram");
		}else
			System.out.println("Given Strings are not anagram");
	}

}
