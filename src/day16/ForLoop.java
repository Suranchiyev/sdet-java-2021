package day16;

public class ForLoop {
	public static void main(String[] args) {
		// for loop - we use when we know exact iterations in advance
		// while loop - we use when we don't know exact number of iterations
		
		for (int i = 0; i < 10; i++) {                               
			System.out.println("Java is cool " + i);
		}
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// for (init action, boolean expression, update action) { body }
		int num;
		for (num = 0; num < 3; num++) {
			System.out.println(num);
		}
		
		// 10 9 8 7 - 1
		//               0 >= 1; 
		for (int i = 10; i >= 1; i--) {
			//               10 9 8 7 6 .. 2 1
			System.out.print(i + " ");
		}
		System.out.println();
		// print every other number from 1 to 100
		// 1, 3, 5 ,7
		
		//              5 <= 100 
		for (int i = 1; i <= 100; i += 2) {
			//               1 3
			System.out.print(i + " ");
		}
	}
}
