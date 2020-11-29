package day35;

public class Main {
	public String str;
	public int count;
	
	public Main(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	public Main() {
		super();
	}
	
	public static void main(String[] args) {
		Main obj = new Main("Apple", 15);
		
		Main obj2 = new Main();
		
		// constructor is a special method to create an object
		// default constructor
		// if class does not have any constructors
		// Java will provide default empty constructor
	}
}
