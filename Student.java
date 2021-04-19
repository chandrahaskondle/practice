package myStudyApp;

public class Student implements Comparable<Student> {
	int id;
	String name;
	String dept;
	
	public Student(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	public int compareTo(Student s) {
		if( this.name.compareTo(s.name) > 0 )
			return 1;
		else if( this.name.compareTo(s.name) == 0)
			return 0;
		else
			return -1;
	}
}

