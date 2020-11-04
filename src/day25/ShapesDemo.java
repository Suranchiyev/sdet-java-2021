package day25;

public class ShapesDemo {
	public static void main(String[] args) {
		// Object is implementation from a class
		// Class is blue print or structure for object
		
		Square sq1 = new Square();
		sq1.sideLength = 6;
		System.out.println("sq1 sideLenght: " + sq1.sideLength);
		System.out.println("sq1 area: " + sq1.getArea());
		System.out.println("sq1 perimeter: " + sq1.getPerimeter());
		
		System.out.println("---------");
		Square sq2 = new Square();
		System.out.println("sq2 sideLength: " + sq2.sideLength); // 0
		System.out.println("sq2 area: " + sq2.getArea()); // 0
		System.out.println("sq2 perimeter: " + sq2.getPerimeter()); // 0
		
		
	}
}
