package day16;

public class ForLoop4 {

	public static void main(String[] args) {
		// 01234567891011
		printLetters("Wooden spoon");
		System.out.println("---------");
		printLetters("Apple");
		System.out.println("---------");
		printRevLetters("hello"); 
		System.out.println("---------");
		
		String res = reverseStr("hello");
		System.out.println(res); // "olleh"
		
		res = reverseStr("abcd");
		System.out.println(res); //dcba
		
		System.out.println("-----------");
		System.out.println(countA("apple"));
		System.out.println(countA("banana"));
		System.out.println(countLetters("hello", 'l'));
		System.out.println(countLetters("hello", 'e')); // 1
		System.out.println(countLetters("hello", 'a')); // 0
		
		System.out.println("-----------");
		System.out.println(countAbc("qweabcioabc"));
		System.out.println(countAbc("abc"));
		System.out.println(countAbc("abdsf"));
		System.out.println(countAbc("abcabc"));
		
		System.out.println("-----------");
		System.out.println(countAbc2("asdabcsdabc"));
		
		System.out.println("-----------");
		System.out.println(isPal2("civic"));
		System.out.println(isPal2("level"));
		System.out.println(isPal2("hello"));
		System.out.println(isPal2("anna"));
		
	}
	
	public static void printLetters(String str) {
		for (int i = 0; i < str.length(); i++) {
			// System.out.println(str.charAt(i));
			System.out.println(str.substring(i, i + 1));
		}
	}
	
	public static void printRevLetters(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}
	
	// reverseStr("hello") -> "olleh"
	// reverseStr("abcd") -> "dcba"       
	public static String reverseStr(String str) {
		String revStr = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			revStr = revStr + ch;
		}

		return revStr;
	}
	
	// lower case "a"
	// countA("apple");  -> 1
	// countA("banana"); -> 3
	public static int countA(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
 			if (letter == 'a') {
				count++; 
			}
		}
		return count;
	}
	
	// countLetter("apple", 'e')  -> 1
	// countLetter("banana", 'n') -> 2
	//                                  "hello", 'l'   -> 2
	public static int countLetters(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (letter == ch) {
				count++;
			}
		}
		return count;
	}
	
	// "abc"
	
	// countAbc("qweabcioabc"); // 2
	// countAbc("abc"); // 1
	// countAbc("abcabc"); // 2
	// countAbc("aebcd"); // 0
	public static int countAbc(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			String partToTest = str.substring(i, i + 3);
			if (partToTest.equals("abc")) {
				count++;
			}
		}		
		return count;
	}
	
	public static int countAbc2(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			char l1 = str.charAt(i);
			char l2 = str.charAt(i + 1);
			char l3 = str.charAt(i + 2);
			                        
			String part = String.valueOf(l1) + l2 + l3;
			if (part.equals("abc")) {
				count++;
			}
		}
		return count;
	}
	
	// String Palindrome
	// isPal("civic") -> true
	// isPal("apple") -> false
	// isPal("anna")  -> true
	// isPal("level") -> true
	// isPal("hello") -> false
	public static boolean isPal(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}		
		return str.equals(revStr);
	}
	
	// 01234
	// civic 
	public static boolean isPal2(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			char b = str.charAt(i);
			char e = str.charAt(str.length() - 1 - i);
			if (b != e) {
				return false;
			}
		}
		return true;
	}
}
