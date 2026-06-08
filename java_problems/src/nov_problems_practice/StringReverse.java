package nov_problems_practice;

public class StringReverse {
	
	public static void main(String[] args) {
		String str="siva";
		String reversedString="";
		for(int i=str.length()-1; i>=0; i--) {
			reversedString=reversedString+str.charAt(i);
		}	
		System.out.println(reversedString);
	}
}
