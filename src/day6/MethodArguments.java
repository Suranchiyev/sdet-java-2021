package day6;

public class MethodArguments {
	public static void main(String[] args) {
		String str = "Alex";
		hello(str);
		hello("Kuba");
		hello("ABC ABC ABC");
		hello("APPLE APPLE");

		int num = 0;
		plus10(num);

		plus10(10);
		plus10(22);
		plus10(100);


		int number = add(20, 10); 
		System.out.println(number); // 30
	}

	public static void hello(String str) {
		System.out.println("Hello, " + str); 
	}

	public static void plus10(int number) {
		number += 10;
		System.out.println(number); 
	}

	public static int add(int d, int d2) {
		int res = d + d2;
		return res;
	}

}