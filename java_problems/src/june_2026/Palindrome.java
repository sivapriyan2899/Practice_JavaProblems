package june_2026;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "imomi";
		char[] strArray = str.toCharArray();
		int strLength= str.length();
		Boolean result = true;
		int leftSide=0, rightSide=strLength-1;
		//System.out.println(strLength);
		
		while(rightSide>leftSide) {
			
			if(strArray[leftSide]!=strArray[rightSide]) {
				result=false;
				break;
			}
			
			
			leftSide++;
			rightSide--;
			
		}
		
		if(!result) {
			System.out.println("Given string is not palindrome");
		}else {
			System.out.println("Given string is palindrome");
		}
	}

}
