package day10;

public class WarmUp {
	public static void main(String[] args) {
		fizzBuzz(6); //Fizz
		fizzBuzz(10); // Buzz
		fizzBuzz(15); // FizzBuzz
		fizzBuzz(7); // 7
	}
	
	public static void fizzBuzz(int number) {
		// if number is evenly divisible by 3, print "Fizz"
		// if number is evenly divisible 5, print "Buzz"
		// if number is evenly divisible by 3 and 5, print "FizzBuzz"
		// otherwise print number itself
		
	
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (number % 5 == 0) {
			System.out.println("Buzz");
		} else if (number % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println(number);
		}
	}
}
