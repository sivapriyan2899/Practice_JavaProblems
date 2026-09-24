package june_2026;

public class ReverseWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="siva is good boy";
		String[] strArray=str.split(" ");
		
		for(String s: strArray) {
			
			char[] charArray = s.toCharArray();
			for(int i=charArray.length-1; i>=0; i--) {
				System.out.print(charArray[i]);
			}
			System.out.print(" ");
		}
		
	}

}
