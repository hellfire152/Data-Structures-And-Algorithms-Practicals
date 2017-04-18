package question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class StudentSearch {
	public static void main(String[] args) {
		ArrayList<Student> studentList = Student.readStudent("student.txt");
		Collections.sort(studentList, (a, b) -> a.getAdminNo().compareTo(b.getAdminNo()));
		ArrayList<String> adminNo = new ArrayList<>();
		for (Student s : studentList) {
			adminNo.add(s.getAdminNo());
		}
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter an admin number: ");
			String input = sc.nextLine();
			
			if (input.equalsIgnoreCase("quit")) {
				System.out.println("Good-Bye!");
				break;
			}
			
			int i = Collections.binarySearch(adminNo, input);
			if (i >= 0) {
				Student stu = studentList.get(i);
				System.out.println("AdminNo: " +stu.getAdminNo() +'\n'
						+"Name: " +stu.getName() +'\n'
						+"Test 1: " +stu.getTest1() +'\n'
						+"Test 2: " +stu.getTest2() +'\n'
						+"Test 3: " +stu.getTest3() +'\n');
			} else {
				System.out.println("No such student found!");
			}
		}
	}
}
