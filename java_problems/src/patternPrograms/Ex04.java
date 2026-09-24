package patternPrograms;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 65;

		for(int i=1; i<=5; i++) {

			for(int j=1; j<=i; j++) {

				char value = (char) a;
				System.out.print(value+" ");

			}
			a++;
			System.out.println();		
		}		
	}
}