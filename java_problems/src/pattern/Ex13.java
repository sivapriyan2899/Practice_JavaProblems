package pattern;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=1; i<=n; i++) {
			
			for(int j=n; j>=i; j--) {
				System.out.print(" ");
			}
			
			if(i!=n) {
				for(int y=1; y<=i; y++) {
					if((y==1)||(y==i)) {
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
			}
			else if(i==n) {
				for(int y=1; y<=n; y++) {
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}
	}

}
