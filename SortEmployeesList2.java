package myStudyApp;

import java.util.*;

public class SortEmployeesList2 {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(113, "hi", "aa"));
		students.add(new Student(1245, "hello", "bb"));
		students.add(new Student(323, "bye", "cc"));
		students.add(new Student(33, "bye", "cc"));
		
		Collections.sort(students);
		
		for(Student s: students ) {
			System.out.println(s.toString());
		}
	}
}


