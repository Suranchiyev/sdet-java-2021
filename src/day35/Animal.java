package day35;

public abstract class Animal {
	public String name;
	
	public void printName() {
		System.out.println(name);
	}
	
	public abstract void walk();
	
	public abstract void run();
}
