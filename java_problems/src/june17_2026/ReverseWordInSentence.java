package june17_2026;

public class ReverseWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Siva is good boy";
		String[] strArray = str.split(" ");
		
		for(int i=0; i<strArray.length;i++) {
			
			for(int j=strArray[i].length()-1; j>=0; j--) {
				System.out.print(strArray[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
