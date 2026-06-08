package jan_2026;

public class CountOddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
