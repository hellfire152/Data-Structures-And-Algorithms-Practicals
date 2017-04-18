package question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QueueingIsFun {
	static ListQueue q = new ListQueue();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		queue:
		for(;;){
			System.out.print("Queue Operations Menu\n"
					+ "1. Enqueue\n"
					+ "2. Dequeue\n"
					+ "3. Empty?\n"
					+ "4. Count?\n"
					+ "5. View Queue\n"
					+ "0. Quit\n"
					+ "Enter Choice: ");
			try {
				int input = sc.nextInt();
				sc.nextLine();
				switch(input) {
				case 0: break queue;
				case 1: System.out.print("Enter the name: ");
					q.enqueue(sc.nextLine());
					break;
				case 2: q.dequeue();
					break;
				case 3: String message = (q.isEmpty())? "Queue is Empty" : "Queue is not empty";
					System.out.println(message);
					break;
				case 4: System.out.println(q.size());
					break;
				case 5: q.viewQueue();
					break;
				}
			} catch (InputMismatchException e) { 
				System.out.println("Try again, idiot.");
			}
		}
	}
}
