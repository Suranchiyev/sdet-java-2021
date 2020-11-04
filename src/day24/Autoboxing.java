package day24;

public class Autoboxing {
	public static void main(String[] args) {
		char ch = 'c';
		
		// Autoboxing - primitive can be assgined to its Warapper class automatically
		Character chW = ch;
		
		System.out.println(chW);
		
		int num = 99;
		Integer numW = num;
		
		// Unboxing
		Long lNum = 99999L;
		long l = lNum;
	}
}
