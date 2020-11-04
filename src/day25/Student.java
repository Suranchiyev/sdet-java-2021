package day25;

public class Student {
	public String name;
	public int age;
	
	// special method to create an object
	public Student() {
		System.out.println("Create object here");
	}
	
	public Student(String name, int age) {
		// 'this' means this current object
		this.name = name;
		this.age = age;
	}
	
}
