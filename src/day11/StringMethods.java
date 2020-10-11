package day11;

public class StringMethods {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("bey"); // also creating a String
		System.out.println(str1);
		System.out.println(str2);
		
		String str = "apple";
		
		// .length() method returns number of characters in the string
		int strLength = str.length();
		System.out.println(strLength); // 5
		
		str = "car "; // space counts as character in Java
		System.out.println(str.length());
		
		// .toUpperCase() will return new String as upper case
		// .toLowerCase() will return new Strung as lower case
		
		String word = "book";
		System.out.println(word); // book
		System.out.println(word.toUpperCase()); // BOOK
		System.out.println(word); // book - because String is immutable class
	
		word = word.toUpperCase();
		System.out.println(word); // BOOK
		
		String word2 = "ORANGE";
		word2 = word2.toLowerCase();
		System.out.println(word2); // orange
	}
}





