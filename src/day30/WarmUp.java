package day30;

public class WarmUp {
	public static void main(String[] args) {
		String str = "apple";
		
		System.out.println(reverseStr(str)); // elppa
	}
	
	public static String reverseStr(String str) {
		String strRev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			strRev += str.charAt(i);
		}
		
		return strRev;
	}
}
