package june_2026;

import customeException.InvalidAgeException;

public class CheckAge_anotherWay {

	
	public void validateAge(int age)throws InvalidAgeException{

		
		if(age<18){
		throw new InvalidAgeException("This is not a right age");
		}else
		System.out.println("hey, helloww adult");
		

		}

		public static void main(String[] args){

		CheckAge_anotherWay check = new CheckAge_anotherWay();
		try {
		check.validateAge(13);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}

}
