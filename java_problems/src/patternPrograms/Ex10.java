package patternPrograms;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tot=9, temp=1;

		//loop 1 for iteration
		for(int i=1; i<=tot; i++ ) {


			//loop 2 for spaces
			for(int j=tot; j>=i; j-- ) {
				System.out.print("  ");
			}

			//loop 3 for printing
			int x=i, y=(i*2)-1;
			

			for(int k=1; k<=y;k++) {

				if(x>1) {

					System.out.print(x+" ");
					x--;
					temp=x;
				}
				else if(temp<=y) {
					System.out.print(temp+" ");
					temp++;
				}
			}
			System.out.println();

		}	

	}
}







