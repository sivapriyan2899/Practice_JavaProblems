package patternPrograms;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		for(int i=n; i>=1; i--) {
			
			int x=0;
			for(int j=1; j<=i; j++ ) {
				x++;
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
	}

}
