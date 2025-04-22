package pattern;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=0; i<4; i++ ) {
			
			
			for (int j=0; j<=4; j++) {
				
				if(j<=i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}	
	}
}
