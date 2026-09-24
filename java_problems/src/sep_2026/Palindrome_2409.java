package sep_2026;

public class Palindrome_2409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="moim";
		int i=0, j=str.length()-1;
		
		//System.out.println(j);
		boolean result = false;
		  while(i!=j) {
		
			  if(str.charAt(i)!=str.charAt(j)) {
				  result=true;
				  break;
			  }
		  
		  i++; j--; 
		  }
		  
		  if(result) {
			  System.out.println("given string is not a palindrome");
		  }else
			  System.out.println("give string " +str+" is a palindrome");
		 
	}

}
