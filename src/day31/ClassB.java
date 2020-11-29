package day31;

public class ClassB {
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.printColor();
		
		obj.setColor("Red");
		obj.printColor();
		
		ClassA obj2 = new ClassA();
		obj2.printColor(); // null
	}
}
