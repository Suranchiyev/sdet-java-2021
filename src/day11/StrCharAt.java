package day11;

public class StrCharAt {
	public static void main(String[] args) {
		// .charAt(index) -> return specific char based on index
		
		//            01234
		String str = "house";
		
		char ch = str.charAt(1);
		System.out.println(ch); // o
		
		System.out.println(str.charAt(3)); // s
		
		//     0123456789
		str = "Public";
		char ch2 = str.charAt(5);
		System.out.println(ch2); // c
		
		// char ch3 = str.charAt(6); IndexOutOfBoundsException 
		 
	}
}
