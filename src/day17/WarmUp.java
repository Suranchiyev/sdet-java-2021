package day17;

public class WarmUp {
	public static void main(String[] args) {
		// 1. Write a code to print numbers from 0 to 99 in the same line
		//    separated by space. 
		
		for (int i = 0; i <= 99; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2. Write a code to print numbers from 99 to 0 in the same line
		//    with space separator
		//                 true    
		
		for (int i = 99; i >= 0; i -= 2) {
			// check condition and go to the body
			// After body is executed to and run update action
			// check condition and go to the body
			System.out.print(i + " ");
		}
		
		// 3. Write the code that will print 7 times
		//    "I'm the best programmer!"
		//    Use loops
		System.out.println();
		
		for (int index = 0; index < 7; index++) {
			System.out.println("I'm the best programmer!");
		}
		
		
		// When you will use while and when you gonna use for loop?
		// for - when we know exact number of iterations in advance
		// while - when you don't know number of iterations
		
		int count = 0;
		while (count < 7) {
			System.out.println("I'm the best programmer!");
			count++;
		}
		
		// do while loop will have at least one iteration and while loop might 0 iterations
//		do {
//			
//		} while ()
	}
}
