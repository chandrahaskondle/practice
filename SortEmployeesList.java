package myStudyApp;

import java.util.*;

public class SortEmployeesList implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getId() - e2.getId();
	}
	
	static Comparator<Employee> ascOrder = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getId() > o2.getId() ) 
				return 1;
			else
				return -1;
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee( 10 , "chandra", "sales"));
		employees.add(new Employee( 234 , "krishna", "accounting"));
		employees.add(new Employee( 44 , "ramesh", "hr"));
		
		// Collections.sort(employees, ascOrder);
		
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getId() > e2.getId())
					return -1;
				else
					return 1;
			}
		});
		
		for(Employee e: employees) {
			System.out.println(e.toString());
		}
	}

}
