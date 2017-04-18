package question1;

public class Circle implements Shape {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle() {
		this(1);
	}

	@Override
	public double area() {
		return Shape.PI * radius * radius;
	}

	@Override
	public String getName() {
		return "Square";
	}

}
