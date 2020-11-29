package day33;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	// public static int age;
		
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
		
	
	public static void main(String[] args) {
		Person john = new Person();
		john.firstName = "John";
		john.lastName = "Doe";
		System.out.println(john.getFullName()); // John Doe
		
		Person obj = new Person();
		System.out.println(obj.getFullName()); // null null
		
		// What does static keyword means in Java?
		// static variables and method are belong to class and not to specific object
		// We need to use them by class name
	}

}



