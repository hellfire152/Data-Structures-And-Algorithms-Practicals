package question1;


public class Triangle implements Shape{
	private double base;
	private double height;
	
	public Triangle (){
		base = 1.0;
		height = 1.0;
	}
	
	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public String toString(){
		return "Base: " + base + ", " + "Height: " + height;
	}
	
	public  double area() {
		return (0.5 * base * height);
	}
	
	
	public  String getName(){
		return "Triangle";
	}
}
