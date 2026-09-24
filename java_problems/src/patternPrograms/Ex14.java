package patternPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size = scanner.nextInt();
		
		ArrayList<Integer> array= new ArrayList<Integer> ();
		for(int i=1; i<=size; i++) {
			
			int ele =scanner.nextInt();
			array.add(ele);
		}
		scanner.close();
		System.out.println("this are the array elements"+array);
	}
	

}
