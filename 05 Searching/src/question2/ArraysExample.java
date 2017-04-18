package question2;

//Activity 6.6
//
import java.util.*;

public class ArraysExample{
	public static void main(String[] args){
		int[] intList = {4, 20, 35, 100, 134, 178, 203, 288, 342, 
							500, 589, 698};
		int[] dupList = {4, 20, 35, 100, 134, 178, 203, 288, 342, 
							500, 589, 698};

		String[] strList = {"the", "slow", "green", "tortoise", 
					"crawls", "under", "the", "lazy", "zebra"};

		int[] filledList = new int[5];


		// sort the String array
		System.out.println("Sorting Demo");
		Arrays.sort(strList);
		for(int i=0; i < strList.length; i++)
			System.out.print(strList[i] + "   ");
		System.out.println("\n---------------------------------\n");

		// search the int array
		System.out.println("Searching Demo");
		int pos = Arrays.binarySearch(intList, 22);
		System.out.println("22 is in position: " + pos);

		// search the String array (must be sorted)
		pos = Arrays.binarySearch(strList, "tortoise");
		System.out.println("tortoise is in position: " + pos);
		System.out.println("\n---------------------------------\n");

		// fill the filledList array with numbers
		System.out.println("Fill Demo");
		Arrays.fill(filledList, 3);
		for(int i=0; i < filledList.length; i++)
			System.out.print(filledList[i] + "   ");
		System.out.println("\n---------------------------------\n");


		// see if filledList and intList are equal
		System.out.println("Equals Demo");
		boolean b = Arrays.equals(intList, filledList);
		System.out.println("intList and filledList is equal? " + b);

		b = Arrays.equals(intList, dupList);
		System.out.println("intList and dupList is equal? " + b);
		System.out.println("\n---------------------------------\n");
	}
}
