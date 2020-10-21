package day16;
import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		// TODO
		// create a program that will ask from user a number
		// assume number 7 and 99 are lucky numbers
		// keep asking the number till user will type 7 or 99
		// if user will provide 7 or 99 stop asking
		
		Scanner scanner = new Scanner(System.in);
		int number;
		
		do {	
			System.out.println("Enter number: ");
			number = scanner.nextInt();
			
//			if (number == 7 || number == 99) {
//				break;
//			}
			
		} while(number != 7 && number != 99);
		
		System.out.println("Bingo!");
	}
}
