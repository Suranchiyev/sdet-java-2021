package day7;

public class Greater {
	public static void main(String[] args) {
		System.out.println(greater(205.0)); // 205.0
		System.out.println(greater(25.0)); // 100.0
		System.out.println(greater(899.0)); // 899.0

		evenOdd(88); // evne
		evenOdd(7); // odd
		evenOdd(4); // even
		evenOdd(19); // odd
	}

	public static double greater(double num) {
		if (num > 100.0) {
			return num;
		} else {
			return 100.0;
		}
	}

	public static void evenOdd(int number) {
		boolean isEven = number % 2 == 0;
		if (isEven) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}

	// if number evenly divisible by 7
	// number % 7 == 0 -> true

	// BREAK 10 min till 2:11pm

}