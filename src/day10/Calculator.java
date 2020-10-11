package day10;

public class Calculator {
	public static int sum(int num, int num2) {
		return num + num2;
	}
	
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}
	
}
