package april_PracticeProblems;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="listen";
		String str2="silent";
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		System.out.println(Arrays.equals(charArray1, charArray2));
	}

}
