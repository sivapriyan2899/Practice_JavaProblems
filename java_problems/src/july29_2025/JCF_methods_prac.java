package july29_2025;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class JCF_methods_prac {
	
	
	public void listMethod() {
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("siva");
		aList.add("jon");
		System.out.println(aList.size());
		System.out.println("removed: "+aList.remove(0)+ " from the list"); // remove(index postion) --> will remove the value present in the 0th index
		System.out.println(aList.contains("jon")); //return true if the list contains "siva"
		System.out.println(aList.size()); //return number of elements in the list
		System.out.println(aList.get(0)+"\n");
		System.out.println("end of list");
		System.out.println("-------------------------");
		
	}
	
	public void setMethod() {
		
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("siva");
		hSet.remove("ink");
		hSet.contains("jink");
		hSet.size();
		
		
	}
	
	public void mapMethod() {
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JCF_methods_prac jcf = new JCF_methods_prac();
		//jcf.listMethod();

	}

}
