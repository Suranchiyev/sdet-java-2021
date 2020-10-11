package day9;

public class WarmUp {
	public static void main(String[] args) {
		String str = getNumStr(2);
		System.out.println(str);
	}
	
	// 1 -> "One"
	public static String getNumStr(int num) {
		if (num == 1) {
			return "One";
		} else if (num == 2) {
			return "Two";
		} else if (num == 3) {
			return "Three";
		} else if (num == 4) {
			return "Four";
		} else if (num == 5) {
			return "Five";
		} else {
			return "Not supported";
		}		
	}
}
