package day4;

public class Person {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		int age = 114;

		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);

		//    35  + 10
		age = age + 10;

		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);

		// System.out.println("Age: " + (age + 10)); // 55

		// System.out.println(age); // 45
	}
}