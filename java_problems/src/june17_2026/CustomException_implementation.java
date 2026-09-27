package june17_2026;

public class CustomException_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new CustomException("hi im custom exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Exception is handled");

	}

}
