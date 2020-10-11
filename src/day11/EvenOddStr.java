package day11;

public class EvenOddStr {
	public static void main(String[] args) {
		System.out.println(isEvenNum(3));
		System.out.println(isEvenNum(4));
		
		// create a method isEvenStr that accept one String argument
		// if the length of the argument is even return true
		// otherwise return false
		System.out.println("----------");
		System.out.println(isEvenStr("apple")); // false
		System.out.println(isEvenStr("exam"));  // true
		
	}
	
	public static boolean isEvenNum(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isEvenStr(String str) {
		str = str.trim(); // trim will remove spaces around the string
		int strL = str.length();
		if (strL % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
