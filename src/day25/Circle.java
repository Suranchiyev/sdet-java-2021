package day25;

public class Circle {
	public double radius;
	public static double pi = 3.14;
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public double getPerimiter() {
		return 2 * pi * radius;
	}
	
	public double getArea() {
		return pi * (radius * radius);
	}
}
