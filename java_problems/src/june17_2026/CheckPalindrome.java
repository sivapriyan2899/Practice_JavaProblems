package june17_2026;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "moma";
		char[] charArray = str.toCharArray();
		int leftPointer=0, rightPointer=str.length()-1;
		boolean result=true;
		
		while(leftPointer<rightPointer) {
			
			if(charArray[leftPointer]!=charArray[rightPointer]) {
				result=false;
			}
			
			leftPointer++;
			rightPointer--;
		}
		
		if(result) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is not a palindrome");
		}
	}
	

}
