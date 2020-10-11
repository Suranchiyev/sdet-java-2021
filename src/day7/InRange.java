package day7;

public class InRange {
	public static void main(String[] args) {

	}

	// Write a method that should accept one int argument
	// if the method within the range from 10 to 20 inclusive return true
	// otherwise return false
	public static boolean inRange(int number) {
		if (number >= 10) {
			if (number <= 20) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static boolean inRange2(int number) {
		//               AND
		if (number >= 10 && number <= 20) { 
			return true;
		} else {
			return false;
		}
	}
}