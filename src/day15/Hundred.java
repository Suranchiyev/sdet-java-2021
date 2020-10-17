package day15;

public class Hundred {
	public static void main(String[] args) {
		// Write a program that will print numbers from 1 to 10 in the same line with space separator
		// 1 2 3 4 5 6 7 8 9 10
		// Use while loop
		
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		// Write a program that will print numbers from 10 to 1 in the same line with space separator
		// 10 9 8 7 6 5 4 3 2 1
		
		//  10
		int i2 = 10;
		
		//     1 >= 2
		while (i2 >= 1) {
			System.out.print(i2 + " "); 
			i2 = i2 - 1; // i--;
		}
		System.out.println();
		
		System.out.println("i2: " + i2); // 0
	}
}
