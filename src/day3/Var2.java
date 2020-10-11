package day3;

public class Var2 {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";

		System.out.println(firstName + " " + lastName); // John Doe
		// concatenation

		// Full name: John Doe
		String fullName = "Full name: " + firstName + " " + lastName;

		System.out.println(fullName); // Full name: John Doe

		System.out.println(firstName + "\t" + lastName); // John    Doe

		firstName = "Ramesh";
		lastName = "Kanery";

		System.out.println(fullName); // 
	}
}