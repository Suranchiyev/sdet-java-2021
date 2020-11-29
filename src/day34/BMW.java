package day34;

public class BMW extends Car {
	public String model; // hiding parents class variable
	
	// BMW is child class of parent class Car
	// Java supports only single inheritance
	
	// - exact same name
	// - exact same arguments
	// - return type should be same or covariant
	// - for the method that overrides, we should have
	//   same visibility or more visible
	// - we cannot override final methods
	
	
	@Override
	public void drive() {
		System.out.println("BMW - " + model + " is driving");
	}
	
	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.model = "i228";
		bmw.price = 9000;
		bmw.drive();
	}
}
