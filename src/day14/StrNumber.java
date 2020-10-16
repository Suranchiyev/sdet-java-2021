package day14;

public class StrNumber {
	public static void main(String[] args) {
		int res = getNumericValue("one");
		System.out.println(res); // 1
		
		res = getNumericValue("TWO");
		System.out.println(res); // 2
		
		res = getNumericValue("Six");
		System.out.println(res); // -1
			
	}
	// Break till 9:18pm est
	// if strNumber "one" or "ONE" return 1
	// if strNumber "two" or "TWO" return 2
	// if strNumber "three" or "THREE" return 3
	// if strNumber "four" or "FOUR" return 4
	// otherwise return -1
	public static int getNumericValue(String strNumber) {
		switch(strNumber) {
		case "one":
		case "ONE":
			return 1;
		case "two":
		case "TWO":
			return 2;
		case "three":
		case "THREE":
			return 3;
		case "four":
		case "FOUR":
			return 4;
		default:
			return -1;
		}
	}
}
