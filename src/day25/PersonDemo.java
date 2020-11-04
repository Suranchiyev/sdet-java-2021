package day25;

public class PersonDemo {
	public static void main(String[] args) {
		// every class will have default constructor 
		// if any other constructors are not declared
		
		// Person personObj = new Person();
		
		Person personeObj1 = new Person("John", "Doe", 38);
		System.out.println(personeObj1.firstName);
		System.out.println(personeObj1.lastName);
		System.out.println(personeObj1.age);
		
		System.out.println(personeObj1);
	}
}
