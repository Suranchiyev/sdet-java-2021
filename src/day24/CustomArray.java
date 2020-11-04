package day24;

import java.util.Arrays;

public class CustomArray {
	public static void main(String[] args) {
		// String[]
	    // int[]
		// char[]
		// StringBuilder[]
		
		Student[] arr = new Student[3];
		
		Student student1 = new Student();
		student1.name = "John Doe";
		student1.id = 1;
		arr[0] = student1;
		
		Student student2 = new Student();
		arr[1] = student2;
		
		String res = WarmUp.rev("12345");
		System.out.println(res);
		
		// What is a class in Java?
		// What is an object in Java?
		
		// Object in java is instance(implementation) of the class
		// Class is blue print for an objects
	}
}

class Student {
	public String name;
	public long id;
	
	public void read() {
		System.out.println(name + " is rading");
	}
}
