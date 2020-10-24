package day19;

public class StrPoolAssignment {
	public static void main(String[] args) {
		String str = "apple";
		String str1 = "apple";
		String str2 = new String("apple");
		
		System.out.println(str == str1); // true 
		System.out.println(str == str2); // false
		System.out.println(str.equals(str2)); // true
		
		// What's output from this program? Why this output?
		// 1) true - because the are pointing to the same object in the String Pool
		//           String Pool try to save memory and it reuse common values
		// 2) false - because str2 is created with new keyword and it wont use StringPool
		// 3) true  - equals will compare actual value of strings
	}
}
