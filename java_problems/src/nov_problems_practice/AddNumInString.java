package nov_problems_practice;

public class AddNumInString {

	public static void main(String[] args) {
		
		String str="si1v2ai3";
		int temp=0;
		
		char[] chArray = str.toCharArray();
		for(char c: chArray) {
			if(c>=48 && c<=57) {
				temp=temp+(c-48);
			}
		}
		System.out.println(temp);
	}
}
