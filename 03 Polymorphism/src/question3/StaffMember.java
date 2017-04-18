package question3;

//*****************************************************************
//  StaffMember.java       Author: Lewis and Loftus
//
//  Represents a generic staff member.
//*****************************************************************

public abstract class StaffMember{
	protected String name;
	protected String address;
	protected String phone;
	//-------------------------------------------------------------
	//  Sets up a staff member using the specified information.
	//-------------------------------------------------------------
	public StaffMember (String name, String address, String phone){
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	//-------------------------------------------------------------
	//  Returns a string including the basic employee information.
	//-------------------------------------------------------------
	public String toString (){
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone;
		return result;
	}
	//--------------------------------------------------------------
	//  Derived classes must define the pay method for each employee
	//  type.
	//--------------------------------------------------------------
	public abstract double pay();
}
