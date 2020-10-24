package day19;

public class StrBuilderAssignments {
	public static void main(String[] args) {
		System.out.println(reverseStr("apple")); // elppa
		
		System.out.println(removeDup("apple")); // aple
		System.out.println(removeDup("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee")); // e
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("hello");
		// StringBuffer is thread safe.
		
		
	}

	public static String removeDup(String str) {
		StringBuilder sbNoDup = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {		
			char letter = str.charAt(i);
			if (!sbNoDup.toString().contains(String.valueOf(letter))) {
				sbNoDup.append(letter);
			}
		}
		return sbNoDup.toString();
		
	}
	
	public static String reverseStr(String str) {
		// 1. Create a StringBuilder with String value
		// 2. Reverse
		// 3. return StringBuilder to String
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
	
}
