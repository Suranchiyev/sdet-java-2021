package day15;

public class ReverseString {
	public static void main(String[] args) {
		String res = reverseStr("hello");
		System.out.println(res);
	}
	
	// reverseStr("hello") -> "olleh"
	// reverseStr("apple") -> "elppa"
	// reverseStr("abc")   -> "cba"
	public static String reverseStr(String str) {
		String resStr = "";

		int len = str.length() - 1;	
		
		while (len >= 0) {
			resStr = resStr + str.charAt(len);
			len--;
		}
		
		return resStr;
	}
}
