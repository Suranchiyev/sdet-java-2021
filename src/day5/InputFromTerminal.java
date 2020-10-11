package day5;

public class InputFromTerminal {
	public static void main(String[] args) {
		// input -> process -> output

        // [Alex][John][Will][][] ..
        //  0     1     2     3 4 ..

		String name = args[0];
		System.out.println("Hello, " + name + "!");

		String name2 = args[1];
		System.out.println(name2); // John

		String name3 = args[2];
		System.out.println(name3); // Will
	}
}