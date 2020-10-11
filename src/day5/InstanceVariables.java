package day5;

public class InstanceVariables {
	String name = "Will Smith";
	int age = 38;

	public String firstName;
	protected String lastName;
	private String middleName;

	public static void main(String[] args) {
		// System.out.println(name);
		// I cannot use non static variables inside static methods

		// this is local variable
	    String name = "John Doe";
		System.out.println(name); // John Doe 
	}
}