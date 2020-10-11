package day10;

public class Car {
	public String model;
	protected int year;
	double price;
	private long id;
	
	// public    - public properties(variable, methods) available from everywhere 
	// protected - will be available inside the same package and subclasses
	// default   - will be available inside the same package only
	// private   - available only inside the same class
}