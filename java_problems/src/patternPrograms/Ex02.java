package patternPrograms;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 1 
		 1 2 
		 1 2 3 
		 1 2 3 4 
		 1 2 3 4 5 
		 
		 */

		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				
				if(j<=i) {
					
					System.out.print(j+" ");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

}
