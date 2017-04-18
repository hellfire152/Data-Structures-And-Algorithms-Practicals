package question1;

import java.util.*;


public class SortPhoneList{
	//-----------------------------------------------------------------
	//  Creates an array of Contact objects, sorts them, then prints
	//  them.
	//-----------------------------------------------------------------
	public static void main (String[] args){
		ArrayList<Contact> contacts = new ArrayList<>();
		
		contacts.add(new Contact("a", "b", "c"));
		contacts.add(new Contact("c", "b", "c"));
		contacts.add(new Contact("e", "b", "c"));
		contacts.add(new Contact("d", "b", "c"));
		contacts.add(new Contact("b", "b", "c"));
		
		for (Contact c : contacts) {
			System.out.println(c.getFirstName());
		}
		
		Collections.sort(contacts);
		
		for (Contact c : contacts) {
			System.out.println(c.getFirstName());
		}
	}
}
