package nov_problems_practice;

public class ReplaceStringWithAnotherString {

	public static void main(String[] args) {

		String str="Siva is nalla boy", replaceWith="good";
		String lowerCaseStr=str.toLowerCase();
		String[] strArray = str.split(" ");

		for(int i=0; i<strArray.length; i++) {
			if(strArray[i].equals("nalla")) {
				strArray[i]="good";
			}
		}
		for(String s: strArray) {
			System.out.print(s+" ");
		}
	}
}