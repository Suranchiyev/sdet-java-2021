package day35;

public class Dog implements CanRun, CanSleep {
	
	@Override
	public void run() {
		System.out.println("Dog is running");
	}
	
	@Override
	public void runFast() {
		System.out.println("Dog is running fast");
	}
	
	@Override
	public void sleep() {
		System.out.println("hmm..");
	}
	
	public static void main(String[] args) {
		// CanRun interObj = new CanRun();
		Dog obj = new Dog();
		obj.run();
		String str = obj.getHello();
		
		CanRun.sayHello();
	}
}
