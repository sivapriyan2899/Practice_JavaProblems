package june_2026;

public class PrintMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input= {3,4,6};
		int n =6;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<input.length;j++) {
				
				if(input[j]==i) {
					break;
				}else if(input[j]!=i && j==2) {
					System.out.print(i+" ");
				}
			}
		}
	}
}