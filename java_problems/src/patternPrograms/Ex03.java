package patternPrograms;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		  1 
		  2 2 
		  3 3 3 
		  4 4 4 4 
		  5 5 5 5 5 
		 
		 */
		
		for (int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				
				if(j<=i) {
					System.out.print(i+" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
