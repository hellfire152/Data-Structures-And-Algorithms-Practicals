package question1;

//==============================================================
//Program Name:	Square.java (Practical 4 Q 1)
// Description:	...
// Author:		PhoonLK	
// Admin No:	001234A
// MG#:			IT1204-99
//==============================================================
public class Square implements Shape {
     private double length;

     public Square() {
          length = 1;
     }

     public Square(double length) {
     	this.length = length;
     }
     
      public String toString() {
          return "Length: " + length;	
     }

     public double area() {
          return length * length;
     }

     public String getName() {
          return "Square";
     }

}
