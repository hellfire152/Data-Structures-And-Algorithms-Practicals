package question2and3;

//================================================================
// Program Name:	Student.java (Practical 5 Q 2)
// Description:		Student class implements Comparable Interface
//================================================================
import java.util.*;

public class Student implements Comparable<Student>{

	// Declare Instance variables
	private String adminNo;
	private String name;
	private int age;

	public Student(String adminNo, String name) {
		this.adminNo = adminNo;
		this.name = name;
	}
	public Student(String adminNo, String name, int age) {
		this.adminNo = adminNo;
		this.name = name;
		this.age = age;
	}


	// ----------------------------------------------------------
	// Accessor methods to get and set attributes
	// ----------------------------------------------------------
	public String getAdminNo() {
		return adminNo;
	}

	public String getName() {
		return name;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return adminNo +';' +name;
	}
	@Override
	public int compareTo(Student o) {
		int result = name.compareTo(o.getName());
		if (result == 0)
			result = ((Integer)age).compareTo(o.getAge());
		return result; 
	}

	
	
}
