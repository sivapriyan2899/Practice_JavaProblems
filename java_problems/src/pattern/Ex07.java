package pattern;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of rows you want to print");
		int n = scanner.nextInt();
		scanner.close();
		
		
		for(int i=1; i<=n; i++) {
		
		for(int j=n; j>=i; j--) {
			System.out.print(" ");
		}
		for(int j=1; j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
		int m= n-1;
		for(int i=1; i<=m; i++) {
			for(int j=0; j<=i ;j++ ) {
				System.out.print(" ");
			}
			for(int j=m; j>=i; j-- ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
			
		
	}

}
