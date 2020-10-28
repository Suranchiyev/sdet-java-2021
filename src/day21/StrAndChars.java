package day21;
import java.util.Arrays;

public class StrAndChars {
	public static void main(String[] args) {
		String str = "hello";
		
		// [h] [e] [l] [l] [o]
		char[] letters = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			letters[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(letters));
		
		char[] letters2 = str.toCharArray();
		System.out.println(Arrays.toString(letters2));
	}
}
