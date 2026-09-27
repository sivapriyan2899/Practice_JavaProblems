package june_2026;

public class FindLongestWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sivaaaaa is the goood boy";
		String[] strArray = str.split(" ");
		int temp=0;
		String result=null ;
		
		for(int i=0; i<strArray.length; i++) {
			
			if(strArray[i].length() > temp) {
				result=strArray[i];
				temp=strArray[i].length();
			}
			
		}
		System.out.println(result+" is the largest word in the sentence");
		
	}

}
