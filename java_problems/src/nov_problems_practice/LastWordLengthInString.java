package nov_problems_practice;

public class LastWordLengthInString {

	public static void main(String[] args) {

		String str="siva is good booy";
		
		String[] strArray=str.split(" ");
		
		System.out.println(strArray[(strArray.length)-1] + " - "+ strArray[(strArray.length)-1].length());
	}
}
