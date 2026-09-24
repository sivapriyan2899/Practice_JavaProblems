package patternPrograms;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		int x;
		int y = 0;
		for(int i=1; i<=n; i++) {

			if(i%2!=0) {

				for(int j=1; j<=i; j++) {

					if(j%2!=0) {
						x=1;
						System.out.print(x+" ");
					}
					else if(j%2==0) {
						y=0;
						System.out.print(y+" ");		
					}
				}
			}
			else if(i%2==0) {
				
				for(int j=1; j<=i; j++) {
					
					if(j%2!=0) {
						x=0;
						System.out.print(x+" ");
					}
					else if (j%2==0) {
						y=1;
						System.out.print(y+" ");
					}
				}
			}

			System.out.println();
		}
	}
}






/*if(x==1) {
System.out.print(x+" ");
x=x-1;
}
else if(x==0) {
System.out.print(x+" ");
x=x+1;
}*/