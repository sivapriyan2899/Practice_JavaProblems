package june_2026;

import customeException.InvalidAgeException;

public class CheckAge {

	/* this program is to implement the custom exception
	 * so don't
	 * get confused
	 */
	public static void main(String[] args) throws InvalidAgeException  {
		// TODO Auto-generated method stub

		int age=14;
		
		try {
		
		if(age<18) {
			throw new InvalidAgeException("Age should be above 18");
		}else
			System.out.println("Hi adult welcome");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("This line will only get execute if the exception is handled");
	}

}
