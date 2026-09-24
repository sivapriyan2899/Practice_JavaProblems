package nov_problems_practice;

public class LowerToUpperCase {

	public static void main (String[] args) {

		String str ="SiVaPriYaN";
		char[] chArray = str.toCharArray();

		for(char c: chArray) {
			if(c>=97 && c<=122) {
				char upValue = (char) (c-32);
				System.out.print(upValue);
			}else if(c>=65 && c<=90) {
				char lowValue = (char) (c+32);
				System.out.print(lowValue);
			}
		}
	}



}
