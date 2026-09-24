package patternPrograms;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5, x=0;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				x++;
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
