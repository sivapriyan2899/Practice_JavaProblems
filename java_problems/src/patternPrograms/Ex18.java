package patternPrograms;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		for(int i=1; i<=n; i++) {
			
			for(int j=n; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
