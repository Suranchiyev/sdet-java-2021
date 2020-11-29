package day35;

public class Eagle implements CanFly {
	@Override
	public void fly() {
		System.out.println("Fly");
	}
	
	@Override
	public void takeOff() {
		System.out.println("Take off");
	}
	
	@Override
	public void dive() {
		System.out.println("Dive");
	}
	
	public static void main(String[] args) {
		Eagle obj = new Eagle();
		obj.fly();
		obj.takeOff();
		obj.dive();
	}
	
}
