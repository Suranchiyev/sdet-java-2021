package day5;

public class StaticVariables {
	static String fullName = "Bruce Lee";
	public static String address = "101 Main St, VA";
	static long number = 10001;

	// static variables are belong to class

	public static void main(String[] args) {
		System.out.println(fullName); // Bruce Lee

		fullName = "John Doe";
		System.out.println(fullName); // John Doe

		System.out.println(number * 2); // 20002
		System.out.println(number);     // 10001 variable never got reassigned

		// local variable
		String address = "136 Locust st, MA";
		System.out.println(address);
	}

}