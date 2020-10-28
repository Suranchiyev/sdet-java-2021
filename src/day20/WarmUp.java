package day20;

public class WarmUp {
	public static void main(String[] args) {
		String str = new String("orange");
		String str1 = "orange";
		String str2 = "orange";
		
		System.out.println(str.equals(str1)); // true. We are comparing actual values with .equals method
		System.out.println(str == str1); // false. One Object in StringPool another which created with new in diff place
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1 == str2); // true. Because of String Pool. 
		
		// Waht's the output from this program and why this output?
	}
}
