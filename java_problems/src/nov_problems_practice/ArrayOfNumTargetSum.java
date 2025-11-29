package nov_problems_practice;

public class ArrayOfNumTargetSum {

	public static void main(String[] args) {

		int[] num = {6,2,5,1,8};
		int target =9;
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if((num[i]+num[j]) == target) {
					System.out.println(i+" , "+j);
					return;
				}
			}
		}
	}
}
