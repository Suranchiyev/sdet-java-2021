package day38;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// TODO ask from user input as number
		// if user will provide non numeric value
		// we need to keep asking
		// otherwise print "Number is even" or "Number is odd"
				
		// java.util.InputMismatchException
		do {
			try {
				Scanner sc = new Scanner(System.in);	
				System.out.println("Enter number:");
				
				int num = sc.nextInt();
				if (num % 2 == 0) {
					System.out.println("Number is even");
				} else {
					System.out.println("Number is odd");
				}
				
				break;
				
			} catch (Exception e) {	
				System.out.println("Wrong input");				
			}
			
		} while (true);		
	}
}
