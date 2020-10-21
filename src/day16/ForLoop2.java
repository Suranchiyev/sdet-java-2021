package day16;

public class ForLoop2 {
	public static void main(String[] args) {
		// write a program that will print 10 times "Hello, Class!"
		// using for loop
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello, Class!");
		}	
		
		// Write a program that will print number in one line sep with space
		// 10 to 100
		for (int i = 10; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Write a program that will print all odd numbers from 1 to 1000
		// Use for loop. Print in one line with space separator
		// 1 3 5 7 9 11 13 .. 999
		
		
		
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
			
		System.out.println("Apple");
			
	}
}
