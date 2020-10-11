package day9;

public class Table {
	public String color;
	public String type;
	public int height;
	public int width;
	public boolean isReserved;
	
	public void displayDetails() {
		System.out.println("Color:" + color);
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
		System.out.println("Reserved: " + isReserved);
	}
	
	// 1. All Objects will have null as default value
	// 2. Numeric primitives will 0 as default
	// 3. boolean will false as default
}
