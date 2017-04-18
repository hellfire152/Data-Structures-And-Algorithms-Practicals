package question1;

//==============================================================
//Program Name:	ShapeFunction.java
// Description:	...
// Author:		PhoonLK	
// Admin No:	001234A
// MG#:			IT1204-99
//==============================================================
public  interface Shape{	
	final double PI = 3.14;
	final String AREA_UNITS = " sq.cm.";
	final String LENGTH_UNITS = " cm.";
	
	public  double area();
	public  String getName();
}
