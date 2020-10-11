package day3;

public class Var {
	public static void main(String[] args) {
		// declaration of variable
		// I need box of type String going forward
		String firstName;

		firstName = "John";
		System.out.println(firstName); // John

		firstName = "Smith";
		System.out.println(firstName); // Smith

		System.out.println(firstName); // Smith

		firstName = "Alex";
		System.out.println(firstName); // Alex


		// String firstName; we cannot declare/create variable with same name
		String lastName = "Doe";
		String str = "Name";

		System.out.println(str);       // Name
		System.out.println(firstName); // Alex
		System.out.println(lastName);  // Doe

		firstName = "Kuba";
		lastName = "Zhaanbayev";
		str = "Full name";

		System.out.println(str);         // Full name
		System.out.println(firstName);   // Kuba
		System.out.println(lastName);    // Zhaanbayev

		String address, state, country; // I'm declaring 3 variables in the same statement.
		address = "101 Main St";
		state = "VA";
		country = "USA";
	}
}