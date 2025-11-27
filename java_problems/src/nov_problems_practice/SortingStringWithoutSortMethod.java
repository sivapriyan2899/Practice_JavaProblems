package nov_problems_practice;

public class SortingStringWithoutSortMethod {

	public static void main(String[] args) {

		String[] strArr = {"siva", "jon","mia","sunny","beth"};
		String temp=null;
		
		for(int i=0; i<strArr.length; i++) {
			
			for(int j=i+1; j<strArr.length; j++) {
				
				if(strArr[i].compareTo(strArr[j])>0) {
					temp=strArr[j];
					strArr[j]=strArr[i];
					strArr[i]=temp;
					
				}
			}
		}
		for(String s: strArr) {
			System.out.print(s+" ");
		}
	}

}
