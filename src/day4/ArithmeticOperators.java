package day4;

public class ArithmeticOperators {
	public static void main(String[] args) {
		// + - * /
		// byte, short, int, long -> whole numbers
		// flaot, double          -> floating numbers

		int i = 7;
		int j = 2;

		int result = i + j;
		System.out.println(result); // 9

		result = i - j; 
		System.out.println(result); // 5

		result = i * j;
		System.out.println(result); // 14;

		result = i / j; 
		System.out.println(result); // 7 / 2 = 3

		double jD = 7.0;
		int iN = 2;

		// 3.5       double / int
		double fNum =  jD / iN;
		System.out.println("Number: " + fNum); // 3.5

		System.out.println(7 / 2); // 3
		System.out.println(7 / 2.0); // 3.5

		String str = "Result: ";
		int myNumber = 299;
		int myNumber2 = 1;
		       //          "Result: "        300
		System.out.println(str + (myNumber + myNumber2)); // Result: 300

		String str2 = "" + myNumber + myNumber2; // 2991

		// * / + -
		// ()
	}
}