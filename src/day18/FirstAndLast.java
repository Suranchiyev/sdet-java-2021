package day18;

public class FirstAndLast {
	public static void main(String[] args) {
		String str = "applea";
		
		char firstLetter = str.charAt(0);  
		char lastLetter = str.charAt(str.length() - 1);
		
 		if (firstLetter == lastLetter) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
 		
 		System.out.println("-------------");
 		System.out.println(firstLast("apple"));
 		System.out.println(firstLast("anna"));
	}
	
	// if first letter and last letters of str are same return true
	// otherwise false
	// firstLast("apple"); // returns false
	// firstLast("anna"); //  returns true
	public static boolean firstLast(String str) {
		char firstLetter = str.charAt(0);
		char lastLetter = str.charAt(str.length() - 1);

		return firstLetter == lastLetter;	
	}
	
	public static boolean firstLast2(String str) {
		//  01234
		// "hello"
		String fL = str.substring(0, 1);
		String lL = str.substring(str.length() - 1);
		
		if (fL.equals(lL)) {
			return true;
		} else {
			return false;
		}
	}
}



