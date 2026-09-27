package june17_2026;

public class PrintMissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {3,7};
		int n=7;
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=num.length-1; j++) {
				
				if(i==num[j]) {
					break;
				}else if(j==num.length-1) {
					System.out.print(i+" ");
				}
			}
			//System.out.print(" ");
		}

	}

}
