package june17_2026;

public class LongestWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "sivvvvaaa is goood boy";
		String[] strArray = str.split(" ");
		int temp=0;
		String longestString=null;
		
		for(int i=0; i<strArray.length; i++) {
			
			if(strArray[i].length()>temp) {
				temp=strArray[i].length();
				longestString=strArray[i];
			}
			
		}
		System.out.println(longestString+" -> is the longest string");
	}

}
