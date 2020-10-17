package day15;

public class WarmUp {
	public static void main(String[] args) {
		boolean b = isOddLength("ABC");
		System.out.println(b);
		
		b = isOddLength("AAAA");
		System.out.println(b);
	}
	
	// Create a static method isOddLength that will accept one String as an argument
	// Method will return boolean
	// if the length of the argument is odd return true
	// otherwise return false
	public static boolean isOddLength(String str) {
		return str.length() % 2 == 1;
	}
}
