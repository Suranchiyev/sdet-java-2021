package day21;

public class StrSplit {
	public static void main(String[] args) {
		String str = "Java 101 for SDET 2021";
		// Find out how many words in the str String?
		
		String[] parts = str.split(" ");
		System.out.println(parts.length);
		for (String str1 : parts) {
			System.out.println(str1);
		}
		
		String str2 = "Java is cool language";
		// ["Java"] [" cool language"]
		String[] parts2 = str2.split("is");
		for (String word : parts2) {
			System.out.println(word.trim());
		}
		
	}
}
