package day25;

public class ShapesDemo2 {
	public static void main(String[] args) {
		// if Mon change pi for all objects
		Circle.pi = 3.14151;
		
		Circle c1 = new Circle();
		c1.radius = 23.5;
		
		double c1Area = c1.getArea();
		System.out.println("c1 Area: " + c1Area);
		
		Circle c2 = new Circle();
		c2.radius = 11;
		double c2Area = c2.getArea();
		System.out.println("c2 Area: " + c2Area);
	}
}
