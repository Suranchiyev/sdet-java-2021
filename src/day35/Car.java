package day35;

public abstract class Car {
	public double speed;
	
	public void printHello() {
		System.out.println("Hello");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract double getSpeed();
}
