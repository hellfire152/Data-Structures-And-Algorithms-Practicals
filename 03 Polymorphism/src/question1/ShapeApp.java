package question1;


public class ShapeApp {

	
	private void printShapeInfo(Shape shape){
		System.out.println("Shape: " + shape.getName() + ", " + "Area: " + shape.area());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square (3.0);
		Triangle triangle = new Triangle (4.0, 5.0);
		ShapeApp shapeApp = new ShapeApp();
		Shape shape;
		
		System.out.println("Using Shape implementation objects:");
		
		shapeApp.printShapeInfo(square);
		shapeApp.printShapeInfo(triangle);
		
		System.out.println("\nAssigning different Shape objects to Shape interface");
		
		shape = square;
		shapeApp.printShapeInfo(shape);
		shape = triangle;
		shapeApp.printShapeInfo(shape);
		
		
		Circle c = new Circle(5);
		shapeApp.printShapeInfo(c);
	}

}
