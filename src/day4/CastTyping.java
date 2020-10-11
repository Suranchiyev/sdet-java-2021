package day4;

public class CastTyping {
	public static void main(String[] args) {
		String str = "apple";

		// 8 primitives in Java
		// byte, short, int, long - whole numbers
		// float, double          - floating numbers

		// byte -> short -> int -> long -> float -> double
//            5
		byte num = 5;
		int numInt = num; // auto casting
		System.out.println(numInt); // 5

		int numInt2 = 23;
		byte numByte = (byte)numInt2;  // explicit casting
		System.out.println(numByte);

		short numShort = 100;
		float fNum = numShort;
		System.out.println(fNum);

		double dNum = 5.99999;
		int numOne = (int) dNum;
		System.out.println(numOne); // 5

	}
}