package june_2026;

public class Count_VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="si";
		char[] strArray = str.toCharArray();
		int strLength = strArray.length;
		int vowelCount=0, consonantCount=0;
		
		for(int i=0; i<=strLength-1; i++) {
			
			if(strArray[i]=='a' || strArray[i]=='e' || strArray[i]=='i' || strArray[i]=='o' || strArray[i]=='u' ) {
				
				vowelCount++;
			}else {
				consonantCount++;
			}
		}
		
		System.out.println("Number of Vowel = "+vowelCount);
		System.out.println("Number of Consonants ="+consonantCount);
	}
}
