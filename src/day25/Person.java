package day25;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	
	public Person(String firstName, String lastName, int age) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		//System.out.println("From 3 args constructor");
	}
	
	// if you have created any constructor java will not
	// provide empty default constructor
	public Person() {
		this(6);
		//System.out.println("From empty constructor");	
		
	}
	
	public Person(int age) {
		//System.out.println("From 1 args constructor");
	}
	
	public String toString() {
		return "{ lastName: " + lastName + 
				", firstName: " + firstName + 
				", age: " + age + " }";
	}
}
