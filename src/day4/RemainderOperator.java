package day4;

public class RemainderOperator {
	public static void main(String[] args) {
		// byte, short, int, long

		int i = 10;
		int i2 = 34;

		//                34  / 10
		System.out.println("Line 9: " + (i2 / i)); // 3

		// %               34 % 10 = 4
		System.out.println("Line 12: " + (i2 % i)); // 4

		int num  = 110 % 10;

		System.out.println(num); // 0
		System.out.println(117 % 10); // 7
		System.out.println(17 % 10); // 7
		System.out.println(134 % 100); // 34
		System.out.println(26 % 5); // 1

	}
}