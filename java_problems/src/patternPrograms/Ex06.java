package patternPrograms;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of rows you want to print");
		int n = scanner.nextInt();
		scanner.close();
		
		
		//loop 1
		for(int i=1; i<=n; i++) {

			
			//loop2 
			for (int j=n; j>=i; j-- ) {

				System.out.print(" ");
			}

			
			// loop 3
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
				
		
	}

}
