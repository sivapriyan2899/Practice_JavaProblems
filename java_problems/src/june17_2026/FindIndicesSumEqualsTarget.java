package june17_2026;

public class FindIndicesSumEqualsTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=5;
		int[] numArray= {3,1,4,2};
		
		for(int i=0; i<numArray.length-1;i++) {
			for(int j=i+1; j<=numArray.length-1;j++) {
				
				if(numArray[i]+numArray[j]==target) {
					System.out.println(i+","+j);
				}
			}
		}

	}

}
