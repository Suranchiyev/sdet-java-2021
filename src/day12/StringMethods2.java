package day12;

public class StringMethods2 {
	public static void main(String[] args) {
		// equals       -> to compare strings 
		// equalsIgnoreCase -> to compare stings ignoring the case
		
		// contains     -> it will check if one string exist as part of the another string
		
		String str = "wooden spoon";
		String str1 = "Wooden spoon";

		if (str1.equals(str)) {
			System.out.println("Equal");
		} else if (str1.equalsIgnoreCase(str)) {
			System.out.println("Equal but case was diff");
		} else {
			System.out.println("Not Equal");
		}
		
		// == never use it to compare strings value
		
		// contains(String portion) will check if String contains another string
		
		String str2 = "study guide";
		String str3 = "guide";
		
		if (str2.contains(str3)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
