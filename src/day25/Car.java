package day25;

public class Car {
	public int passengers;
	public double speed;
	public double gasCapacity;
	public double gasBurnRate;

	public Car(int passengers, double speed, double gasCapacity, double gasBurnRate) {
		this.passengers = passengers;
		this.speed = speed;
		this.gasCapacity = gasCapacity;
		this.gasBurnRate = gasBurnRate;
	}

	public double findTime(double time) {
		return time * gasCapacity;
	}

	public double findEndurance() {
		return gasCapacity / gasBurnRate;
	}

	public String findPassengers(int passengers) {
		if (passengers >= 1 && passengers <= 4) {
			return "Driver: " + "Welcome";
		} else {
			return "Driver: " + "I m sorry  my car is full ";
		}
	}

	public static void main(String[] args) {
		Car honda = new Car(4, 220, 50.0, 8.0);
		System.out.println(honda.findPassengers(5));
		System.out.println("My honda can drive: " + honda.findEndurance() + " miles " + "per gallon");
		System.out.println("My honda can pass in 3 hours: " + honda.findTime(3) + " miles");
		Student student = new Student();
	}
}
