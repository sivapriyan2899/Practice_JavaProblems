package sep_2026;

public class FindDuplicateInArray_28_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArray= {5,3,2,2,7,5};
		
		for(int i=0;i<numArray.length; i++) {
			
			for(int j=i+1; j<numArray.length; j++) {
				
				if(numArray[i]==numArray[j]) {
					System.out.println(numArray[i]);
					break;
				}
			}
			
			
		}
		
	}

}
