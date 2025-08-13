package april_PracticeProblems;

public class Encapsulation {

	private Integer age;
	private String name;
	
	public Encapsulation() {
		this.age=0;
		this.name="set your name";
		System.out.println("name :"+name+" | age: "+age);
	}
	
	public void setVar(Integer age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public void getVar() {
		System.out.println(name+"'s age is "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation encap = new Encapsulation();
		
		encap.setVar(29, "Jon");
		encap.getVar();
	}
} 	
