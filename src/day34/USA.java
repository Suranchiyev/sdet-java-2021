package day34;

public class USA extends Country {
	public String str = "B";
	
	public void printStr() {
		System.out.println("USA: " + this.str);
		System.out.println("Country: " + super.str);
	}
	
	public void printProperties() {
		// to access parents properties/methods
		// we can use super keyword
		System.out.println(super.population);
		System.out.println(super.capitalCity);
	}
	
	public USA() {
		super("abc");
		System.out.println("Hello");
	}
	
	public USA(String str) {
		this();
	}
}



