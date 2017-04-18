package question3;

//****************************************************************
//  Volunteer.java       Author: Lewis and Loftus
//
//  Represents a staff member that works as a volunteer.
//****************************************************************
public class Volunteer extends StaffMember{
	//------------------------------------------------------------
	//  Sets up a volunteer using the specified information.
	//------------------------------------------------------------
	public Volunteer (String name, String address, String phone){
		super (name, address, phone);
	}
	//------------------------------------------------------------
	//  Returns a zero pay value for this volunteer.
	//------------------------------------------------------------
	public double pay(){
		return 0.0;
	}
}
