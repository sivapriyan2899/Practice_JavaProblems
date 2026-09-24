package nov_problems_practice;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		
		String str ="sSiSs";
		char[] chArray = str.toCharArray();
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(str);
		stringBuilder.reverse();
		
		char[] reversedArray = stringBuilder.toString().toCharArray();
		
		System.out.println(Arrays.compare(chArray, reversedArray));
		
		
	}

}
