package day17;

public class LoopsAsignment3 {
	public static void main(String[] args) {
		// Write a program that will print numbers from 1 to 100
		// Except:
		// if number is divisible by 5 evenly print "Java" instead of number
		// if number is divisible by 7 evenly print "Cool" instead of number
		// if number is divisible by 5 and 7 evenly print "Java is Cool" instead of number
		
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("Java is Cool");
			} else if (i % 5 == 0) {
				System.out.println("Java");
			} else if (i % 7 == 0) {
				System.out.println("Cool");
			} else {
				System.out.println(i);
			}	
		}
	}
}
