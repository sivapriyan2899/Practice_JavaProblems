package june17_2026;

import java.util.List;

public class CountVowelAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "siiva";
		str = str.toLowerCase();
		char[] charArray=str.toCharArray();
		int vowelCount=0, consonantCount=0;
		
		List<Character> listOfVowels = List.of('a','e','i','o','u');
		
		for(char c: charArray) {
			
			if(listOfVowels.contains(c)) {
				//System.out.print();
				vowelCount++;
			}else {
				consonantCount++;
			}
		}
		System.out.println("No. of Vowels = "+vowelCount);
		System.out.println("No. of Consonants = "+consonantCount);
	}

}
