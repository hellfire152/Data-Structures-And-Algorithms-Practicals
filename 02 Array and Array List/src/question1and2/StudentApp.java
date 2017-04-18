package question1and2;

import java.io.*;
import java.util.*;

public class StudentApp {
	public static void main (String args[]){
		FileController f = new FileController("student.txt");

		ArrayList<String> recs = new ArrayList<String>();
		ArrayList<String> recsReturn = new ArrayList<>();
		
		recs.add("031111A;Mary Tan;1/06/1981;100;100;90");
		recs.add("031234F;Michael Tan;01/08/1980;60;70;98");
		recs.add("031234F;Michael Bay;01/08/1980;60;70;98");
		
		f.clear();
		f.writeLine(recs);
		
		for(;;) {
			String s = f.readLine();
			if (s == null) break;
			
			recsReturn.add(s);
		}
		
		for(String s : recsReturn) {
			String[] att = s.split(";");
			System.out.println(att[1]);
		}
		
		//Q2d
		ArrayList<Student> studentList = Student.readStudent("student_records.txt");
	}
}
