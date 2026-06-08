package nov_problems_practice;

public class StringReverseInSentence {

	public static void main(String[] args) {

		String str ="siva is good boy", temp="";
		String [] strArray = str.split(" ");
		
		for(int j=0; j<strArray.length;j++) {     				
			
			temp=strArray[j];
			String rev="";
			
			for(int i=temp.length()-1; i>=0; i--) {
				rev=rev+temp.charAt(i);
			}
			strArray[j]=rev+" ";
		}
		
		for(String s : strArray)
		System.out.print(s);
	}
}