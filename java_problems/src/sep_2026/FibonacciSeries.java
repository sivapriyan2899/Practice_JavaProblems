package sep_2026;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0, b=1, result=0, target=10;
		System.out.print(a +" "+b+" ");
		while(target-2>0) {
		result=a+b;
		a=b;
		b=result;
		System.out.print(result+" ");
		target--;
		}
	}

}
