package day33;

public class Lion extends Animal {
	
	@Override
	public void run() {
		System.out.println("Lion is running");
	}
	
	public static void main(String[] args) {	
		Lion obj = new Lion();
		obj.age = 5;
		obj.run();	
	}
}
