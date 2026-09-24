package nov_problems_practice;

public class PalindromeWithoutMethod {

	public static void main(String[] args) {

		String name="MoM";
		String rev ="";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
}
