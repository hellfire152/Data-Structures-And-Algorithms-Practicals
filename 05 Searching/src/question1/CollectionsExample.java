package question1;

//Activity 6.5
//
import java.util.*;

public class CollectionsExample{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();

		list.add("mary");
		list.add("had");
		list.add("a");
		list.add("little");
		list.add("lamb");

		// Sort the list
		Collections.sort(list);
		System.out.println("Sorted list:");
		display(list);

		// Search the list
		int pos;
		pos = Collections.binarySearch(list, "lamb");		
		System.out.println("\nPosition of 'lamb': " + pos);
		
		pos = Collections.binarySearch(list, "green");
		System.out.println("Position of green': " + pos);
		
		pos = Collections.binarySearch(list, "island");
		System.out.println("Position of island': " + pos);

		// Randomize the ordering of the list
		Collections.shuffle(list);
		System.out.println("\nShuffled contents of new list:");
		display(list);
		System.exit(0);
	}
	public static void display(ArrayList<String> list){
		for(int i=0; i<list.size() ;i++)
			System.out.print((String)list.get(i) + "  ");
		System.out.println();
	}
	
	//green -> -2, island -> -3
}
