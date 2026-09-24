package nov_problems_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingObjects {

	String name;
	int age, salary;

	SortingObjects(String nameOfEmployee, int ageOfEmployee, int salaryOfEmployee) {
		name=nameOfEmployee;
		age=ageOfEmployee;
		salary=salaryOfEmployee;
	}

	public String toString() {
		return name + " : "+ age +" : "+salary;
	}
	
	public static void main(String[] args) {

		List<SortingObjects> arrayList = new ArrayList<SortingObjects>();

		arrayList.add(new SortingObjects("siva",20,1000)); 
		arrayList.add(new SortingObjects("jon",25,6000)); 
		arrayList.add(new SortingObjects("remi",28,3000));
		
		
		arrayList.sort(new SortingObjectDiscreteClass());
		for(SortingObjects n : arrayList ) {
			System.out.println(n);
		}
		
		//arrayList.sort(Comparator.comparing(e-> e.age));
		
				// arrayList.sort(new Comparator<SortingObjects>() { public int compare(SortingObjects o1, SortingObjects o2) { return o2.age - o1.age; }});

//		for(SortingObjects result : arrayList)
//			System.out.println(result.name +" "+result.age+" "+result.salary);

	}
}
