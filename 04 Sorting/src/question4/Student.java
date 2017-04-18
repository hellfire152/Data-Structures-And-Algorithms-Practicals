package question4;


// Description:		Student class implements Comparable Interface
// Author:			PhoonLK	
// Admin No:		001234A
// Module Group:	IT1204-99
//================================================================
import java.util.*;

public class Student implements Comparable<Student>{
	// Declare Instance variables
	private String adminNo;
	private String name;
	private GregorianCalendar birthDate;
	private int test1;
	private int test2;
	private int test3;

	public Student(String adminNo, String name, 
				GregorianCalendar birthDate){
		this.adminNo = adminNo;
		this.name = name;
		this.birthDate = birthDate;
	}
	//----------------------------------------------------------
  	// Overload constructor to take in a String
  	//----------------------------------------------------------
	public Student (String record){
		Scanner sc = new Scanner (record);
		sc.useDelimiter(";");
      	adminNo = sc.next();
		name = sc.next ();
		birthDate = MyCalendar.convertDate(sc.next ());
		test1 = sc.nextInt();	
		test2 = sc.nextInt();
		test3 = sc.nextInt();
	}
	//----------------------------------------------------------
	// Accessor methods to get and set attributes
	//----------------------------------------------------------
	public String getAdminNo(){
		return adminNo;
	}
	public String getName(){
		return name;
	}
	public GregorianCalendar getBirthDate(){
		return birthDate;
	}
	public int getTest1(){
		return test1;
	}
	public int getTest2(){
		return test2;
	}
	public int getTest3(){
		return test3;
	}
	public void setAdminNo(String adminNo){
		this.adminNo = adminNo;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setBirthDate(GregorianCalendar birthDate){
		this.birthDate = birthDate;
	}
	public void setTest1(int test1){
		this.test1 = test1;
	}
	public void setTest2(int test2){
		this.test2 = test2;
	}
	public void setTest3(int test3){
		this.test3 = test3;
	}
	//----------------------------------------------------------
	// Calculates and returns the average score 
	//----------------------------------------------------------
	public double averageScore(){
		return (double)(test1 + test2 + test3)/3;
	}
	//----------------------------------------------------------
  	// Returns information of student object as a string.
   	//----------------------------------------------------------

	
	@Override
	public int compareTo(Student s) {
		return birthDate.compareTo(s.getBirthDate());
	}
}


