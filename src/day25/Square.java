package day25;

public class Square {
	public int sideLength;
	
	public int getArea() {
		return sideLength * sideLength;
	}
	
	public int getPerimeter() {
		return sideLength * 4;
	}
}
