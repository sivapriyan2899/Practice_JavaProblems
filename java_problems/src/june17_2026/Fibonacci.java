package june17_2026;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6, a=0, b=1,c;
		
		System.out.print(a+" "+b+" ");
		while(num-2>0) {
			c=b;
			b=a+b;
			a=c;
			System.out.print(b+" ");
			num--;
		}
	}
}
