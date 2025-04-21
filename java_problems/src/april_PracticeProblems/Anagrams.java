package april_PracticeProblems;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="listen";
		String str2="silent";
		
		//converting to chararray
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		//sorting array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		//comparing both array and printing the output
		System.out.println(Arrays.equals(charArray1, charArray2));
	}

}
