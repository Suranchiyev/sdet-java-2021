package day35;

public class Ox extends Mammal {
	@Override
	public String getMilk() {
		return "milk";
	}
	
	@Override
	public void walk() {
		System.out.println("Ox is walking");
	}
	
	@Override
	public void run() {
		System.out.println("Ox is running");
	}
}
