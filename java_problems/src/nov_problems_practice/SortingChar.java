package nov_problems_practice;

public class SortingChar {

	public static void main(String[] args) {

		char[] strArr = {'v', 'c','x','a','c'};
		char temp=0;

		for(int i=0; i<strArr.length; i++) {

			for(int j=i+1; j<strArr.length; j++) {

				if(strArr[j]<strArr[i]) {
					temp=strArr[j];
					strArr[j]=strArr[i];
					strArr[i]=temp;
				}
			}
		}
		for(char c: strArr) {
			System.out.print(c+" ");
		}
	}
}
