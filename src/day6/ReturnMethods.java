package day6;

public class ReturnMethods {
	public static void main(String[] args) {
		sayHello();

		//   hello
		String res = getHello(); 
		System.out.println(res);

		String str = getApple(); 
		System.out.println(str);

		sayHello();
	}


	public static void sayHello() {
		System.out.println("Hello!");
	}

	public static String getHello() {
		String str = "hello";
		return str;
	}

	public static String getApple() {
		System.out.println("in the getApple method");

		return "apple";

		// System.out.println("here"); Unreachable code
	}

	public static int getNumber() {
		int i = 123;
		int j = 34;

		return i + j;
	}
} 