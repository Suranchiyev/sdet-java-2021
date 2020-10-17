package day15;
import java.util.Scanner;

public class WhileLoop1 {
	public static void main(String[] args) {
		// Ask a use the number
		// 8
		// 1 2 3 4 5 6 7 8
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		
		int number = scanner.nextInt();
		int count = 1;
		//        8   >=  1
		while (number >= count) {
			System.out.print(count + " ");
			count++;
		}
	}
}
