package day6;

public class MethodExample {
	public static void main(String[] args) {
		helloClass();
		System.out.println("======= Some Code =======");
		helloClass();

		printMessage(); // call / invoke
	}

	public static void helloClass() {
		System.out.println("Hello, Class!");
		System.out.println("Hello, Class!");
		System.out.println("Hello, Class!");
	}

	public static void printMessage() {
		System.out.println("This is message");
	}
}