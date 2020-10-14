package day13;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(removeSpaces(" ap ple")); // "apple"
		System.out.println(removeSpaces(" orange ")); // "orange"
		System.out.println(removeSpaces("ba nana ")); // "banana"
		
		System.out.println(flipStr("orange")); // ngeora
		System.out.println(flipStr("ABCD")); // CDAB
		System.out.println(flipStr("ab")); // ba
		
		System.out.println(isFirstEqualsToLast("asdfsdfa")); // true
		System.out.println(isFirstEqualsToLast("abc")); // false
	}
	
	/**
	 * Return a method argument without any spaces 
	 */
	public static String removeSpaces(String str) {
		str = str.replace(" ", "");
		return str;
	}
	
	/**
	 * Assume that argument str will be only even length String
	 * Assume that the str length will be 2 or more than 2
	 * Method should split argument string in the middle and swap them and return result
	 * 
	 * flipStr("orange") -> ngeora
	 * flipStr("ABCD")   -> CDAB
	 * flipStr("ab")     -> ba
	 */
	public static String flipStr(String str) {
		int l = str.length();
		String fPart = str.substring(0, l / 2); 	 
		String sPart = str.substring(l / 2);
		return sPart + fPart;
	}
	
	/**
	 * if first char and last char of argument str are quals return true
	 * otherwise return false
	 */
	public static boolean isFirstEqualsToLast(String str) {
		if (str.length() < 2) {
			return false;
		}
		
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);
		return firstChar == lastChar;
		
//		String firstLetter = str.substring(0, 1);
//		String lastLetter = str.substring(str.length() - 1);
//		return firstLetter.equals(lastLetter);
	}
	
	/**
	 * Based on day print this message:
	 * Mon - Home work day!
	 * Tue - Java day!
	 * Wed - Chill day!
	 * Thur - Java day!
	 * Fri - Coding day!
	 * Sat - Java epic day!
	 * Sun - Java epic day!
	 */
	public static void myWeek(String day) {
		if (day.equals("Mon")) {
			System.out.println("Home work day!");
		} else if (day.equals("Tue") || day.equals("Thur")) {
			System.out.println("Java day!");
		} else if (day.equals("Wed")) {
			System.out.println("Chill day!");
		} else if (day.equals("Fri")) {
			System.out.println("Coding day!");
		} else if (day.equals("Sat") || day.equals("Sun")) {
			System.out.println("Java epic day!");
		} else {
			System.out.println("Wrong input");
		}
	} 
}
