package june_2026;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {23,87,607,99,199};
		int temp=0,secondLast=0; 
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>temp) {
				secondLast=temp;
				temp=num[i];
			}
			else if(num[i]>secondLast){
				secondLast=num[i];
			}
			
		}
		System.out.println(secondLast);
	}

}
