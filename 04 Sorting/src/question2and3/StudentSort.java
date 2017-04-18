package question2and3;

import java.util.ArrayList;
import java.util.Collections;


//==============================================================
//Program Name:	StudentSort.java (Practical 5 Q 2)
// Description:	...
//==============================================================
//import java.util.*;

public class StudentSort {
	public static void main (String args[]){
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("123", "efg", 1));
		studentList.add(new Student("123", "abc", 1));
		studentList.add(new Student("123", "bcd", 1));
		studentList.add(new Student("123", "def", 1));
		studentList.add(new Student("123", "cde", 4));
		studentList.add(new Student("123", "cde", 1));

		Collections.sort(studentList);
		
		for (Student s : studentList) {
			System.out.println(s.getName() +';' +s.getAge());
		}
	}
}