package jan_2026;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =12345, result=0, temp=0;
		
		while(num>0) {
			
			temp=num%10;
			result=(result*10)+temp;
			num = num/10;
		}
		System.out.println(result);
	}

}
