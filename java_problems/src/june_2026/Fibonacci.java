package june_2026;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5, a=0,b=1,temp=0;
		
		System.out.print(a+" "+b+" ");
		while(n-2>0) {
			
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(temp+" ");
			n--;
		}
	}

}
