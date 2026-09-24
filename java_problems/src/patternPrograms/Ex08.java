package patternPrograms;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int input = scanner.nextInt();

		scanner.close();
		//f1=0;
		//f2=1;

		int f1 = 0;
		int f2 = 1;
		int temp=2;
		int index=0, fin=2*input, result =0;


		for(int i=0; i<fin; i++) {
			temp = f1 +f2;
			f1=f2;
			f2=temp;

			System.out.print(temp+" ");		

			if(index%2==0) {
				result=result+temp;
			}
			index++;
		}
		System.out.println();
		System.out.println(result);
	}
}
