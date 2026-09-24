package june_2026;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 432, temp=0, result=0;
		while(num>0) {
			temp=num%10;
			result=temp+result;
			num=num/10;
		}
		System.out.println(result);
	}

}
