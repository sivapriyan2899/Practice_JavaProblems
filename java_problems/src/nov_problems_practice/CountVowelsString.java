package nov_problems_practice;

public class CountVowelsString {

	public static void main(String[] args) {

		String name="siiIVA".toLowerCase();
		int count=0;
		char[] chArray=name.toCharArray();
		for(char c:chArray) {
			if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
