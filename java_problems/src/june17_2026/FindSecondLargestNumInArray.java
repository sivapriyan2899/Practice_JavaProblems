package june17_2026;

public class FindSecondLargestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {44,109,30,102,200};
		
		int temp=0, secondLargest=0;
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>temp) {
				secondLargest=temp;
				temp=num[i];
			}else if(num[i]>secondLargest){
				secondLargest=num[i];
			}
		}
		System.out.println(secondLargest);
	}

}
