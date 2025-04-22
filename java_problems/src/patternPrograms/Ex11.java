package patternPrograms;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=6;
		
		  for(int i=1; i<=input; i++) {
		  
			  for(int j=input; j>=i; j-- ) { 
				  System.out.print("  "); 			  
			  } 
			  
			 int cyc=(i*2)-1;
		  
			  for(int j=1; j<=cyc; j++) { 
				  System.out.print("* "); 		  
			  } 
			  
			  System.out.println(); 	  
		  }
		 
		
			int down=input -1;
			int x=1;
			
			for(int i=down; i>=1; i--) {
				x++;
				for(int j=1; j<=x; j++) {
					
					System.out.print("  ");
				}
				
				int cyc=(i*2)-1;
				
				for(int j=1; j<=cyc; j++) {
					System.out.print("* ");
				}
				System.out.println();
				
			}
			  
			 



	}

}
