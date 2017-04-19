package question1and2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Student {
	private String adminNo, name;
	private GregorianCalendar birthDate;
	private int test1, test2, test3;
	
	/*CONSTRUCTORS*/
	/**
	 * Constructor that initializes all variables
	 * Note that birthDate is a String, not a {@link GregorianCalendar}
	 * The constructor will convert the String into the {@link GregorianCalendar}
	 * using the convertDate method in {@link MyCalendar}
	 * @param adminNo
	 * @param name
	 * @param birthDate
	 * @param test1
	 * @param test2
	 * @param test3
	 */
	public Student(String adminNo, String name, String birthDate, int test1, int test2, int test3) {
		super();
		this.adminNo = adminNo;
		this.name = name;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
		
		this.birthDate = MyCalendar.convertDate(birthDate);
	}
	/**
	 * Same as above, except that it takes in a semicolon separated String (same argument order)
	 * @param studentRecord
	 */
	public Student(String studentRecord) {
		Scanner sc = new Scanner(studentRecord);
		sc.useDelimiter(";");
		
		adminNo = sc.next();
		name = sc.next();
		birthDate = MyCalendar.convertDate(sc.next());
		test1 = sc.nextInt();
		test2 = sc.nextInt();
		test3 = sc.nextInt();
	}
	
	/**
	 * Calculates and returns the average score of the {@link Student}
	 * @return
	 */
	public double averageScore() {
		return (test1 + test2 + test3) / 3;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Admin No: ");
		s.append(adminNo);
		s.append('\n');
		s.append("Name: ");
		s.append(name);
		s.append('\n');
		s.append("Average score: ");
		s.append(averageScore());
		return s.toString();
	}
	
	public static ArrayList<Student> readStudent(String file) {
		FileController f = new FileController("student_records.txt");
		
		ArrayList<Student> recs = new ArrayList<>();
		ArrayList<String> recsReturn = new ArrayList<>();
		
		for (;;) {
			String rec = f.readLine();
			if (rec == null) break;
			
			recsReturn.add(rec);
		}
		
		for (String s : recsReturn) {
			recs.add(new Student(s));
		}
		
		return recs;
	}
	
	public String toRecord() {
		return adminNo+';'+name+';'+birthDate+';'+test1+';'+test2+';'+test3+';';
	}
	/* GETTERS AND SETTERS */
	public String getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GregorianCalendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(GregorianCalendar birthDate) {
		this.birthDate = birthDate;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public int getTest2() {
		return test2;
	}

	public void setTest2(int test2) {
		this.test2 = test2;
	}

	public int getTest3() {
		return test3;
	}

	public void setTest3(int test3) {
		this.test3 = test3;
	}
	
}
