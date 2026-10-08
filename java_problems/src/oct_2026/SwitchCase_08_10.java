package oct_2026;

import java.util.Scanner;

public class SwitchCase_08_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1 or 2");
		int a=scanner.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("you pressed one");
			break;

		case 2:
			System.out.println("you pressed two");
			break;
		default:
			System.out.println("enter correct num");
			break;
		}
		
		scanner.close();

	}

}
