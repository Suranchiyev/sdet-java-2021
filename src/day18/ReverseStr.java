package day18;

public class ReverseStr {
	public static void main(String[] args) {
		//            01234
		String str = "apple"; // 5
		System.out.println(str); // apple
			
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str2 = str2 + ch;
		}
		str = str2;
		System.out.println(str); // elppa
		
		System.out.println("-----");
		System.out.println(isStrPal("apple"));
		System.out.println(isStrPal("civic"));
	}
	
	// write a method that will accept one Strign argument and return reverse version of it.
	// method return type is String
	// Use in your main method
	public static String reverse(String str) {
		String rev = "";          
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
	
	// return true if str is palindrome
	// isStrPal("civic"); -> true
	// isStrPal("apple"); -> false
	// isStrPal("anna");  -> true
	public static boolean isStrPal(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		return revStr.equals(str);
	}
	
	public static boolean isStrPal2(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			char bL = str.charAt(i);
			char eL = str.charAt((str.length() - 1) - i);
			if (bL != eL) {
				return false;
			}
		}
	    return true;
	}
	
}


