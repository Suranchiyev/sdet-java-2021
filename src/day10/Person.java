package day10;

public class Person {
	public String name;
	public int age;
	public static String address;
	
	// static properties(variables, methods) they are belong to class, and
	// not to specific object/instance
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "John";
		p.age = 28;
		p.address = "101 Main st";
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.address);
		
		Person p1 = new Person();
		System.out.println(p1.name); // null
		System.out.println(p1.age); // 0
		System.out.println(p1.address); // 101 Main st
		
		p1.address = "136 Locust Street";
		
		System.out.println(p.address); // 136 Locust Street
		
		p1.name = "Alex";
		p1.age = 35;
		
		System.out.println(p.name); // John
		System.out.println(p.age);  // 28
		
		// Static properties should be used by class name.
		Person.address = "2 North street";
		
		// What does static keyword means in Java?
		// Static variables and methods are belong to class not to specific object
	}
}
