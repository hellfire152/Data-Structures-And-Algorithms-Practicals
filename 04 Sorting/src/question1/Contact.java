package question1;


public class Contact implements Comparable<Contact>{
	private String firstName; 
	private String lastName;
	private String phone;
		
	
	public Contact (String firstName, String lastName, String phone){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;		
	}
	
	
	//-1 -> alphabetically before
	//0 -> same
	//1 -> alphabetically after
	public int compareTo (Contact c){
		int result;
		
		if (lastName.equals(c.lastName))
			result = firstName.compareTo(c.firstName);
		else
			result = lastName.compareTo(c.lastName);
		return result;
	}
	
	public String getFirstName() {
		return firstName;
	}
}












