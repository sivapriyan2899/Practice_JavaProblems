package sep_2026;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4285, result=0, temp=0;
		
		while(num>0) {
			temp=num%10;
			result=temp+result;
			num=num/10;
		}
		
		System.out.println(result);	
	}
}
