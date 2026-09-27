package sep_2026;

public class VowelsConsonantsFromString_2409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sivapriyan";
		char ch;
		int vowelsCount=0, consonantCount=0;
		for(int i=0; i<str.length(); i++) {
			
			ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				
				vowelsCount++;
			}else
				consonantCount++;
		}
		
		System.out.println("Vowels Count = " + vowelsCount+"\nConsonant Count = "+consonantCount);
		

	}

}
