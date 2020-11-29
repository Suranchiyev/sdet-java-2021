package day35;

public class CarDemo {
	public static void main(String[] args) {
		// Car car = new Car();
		// cannot create object of abstract class directly
		Audi myCar = new Audi();
		myCar.drive();
		myCar.stop();
		
		BMW myCar2 = new BMW();
		myCar2.drive();
		myCar2.stop();
		System.out.println("-----------");
		
		// why I should use abstraction at all?
		//Audi car = new Audi();
		BMW car = new BMW();
		
		car.speed = 100;
		
		// drive 10 times
		for (int i = 0; i < 10; i++) {
			car.drive();
		}
		
		System.out.println("Speed: " + car.getSpeed());
		car.stop();
		// Break till 11:10 AM EST
	
	}
}
