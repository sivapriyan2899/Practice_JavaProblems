package oct_2026;

public class SecondLargestNumInArray_02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArray= {43,61,24,52,84};
		
		int maxNum=0, secondMaxNum=0;
		
		for(int i=0; i<numArray.length; i++) {
			
				if (maxNum<numArray[i]) {
					maxNum=numArray[i];
				}else if(secondMaxNum<maxNum){
					secondMaxNum=maxNum;
				}
			}
		System.out.println(secondMaxNum);
	}	
	
}
