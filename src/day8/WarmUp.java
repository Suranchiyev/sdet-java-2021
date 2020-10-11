package day8;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(evenOdd(10));
		System.out.println(evenOdd(13));
		System.out.println(evenOdd(76));

	}
	
	// if number is even -> "even" except if number is 10 -> "ten" 
	// if number is odd  -> "odd"
	
	public static String evenOdd(int number) {
		if(number == 10) {
			return "ten";
		}
		
		if (number % 2 == 0) {			
			return "even";
		} else {
			return "odd";
		}
	}
	
	
}
