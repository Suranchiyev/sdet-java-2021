package day15;
import java.util.Scanner;

public class InterestRate {
	public static final double APY = 1.7;
	public static final double MONTHLY_INTEREST_RATE = APY / 12;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Initial balance:");
		double balance = sc.nextDouble();
		double initBalance = balance;
		
		System.out.println("Months:");
		//   3
		int month = sc.nextInt();	
		int count = 0;

		while (month > count) {	
			balance = balance + (balance * (MONTHLY_INTEREST_RATE / 100));
			count++;
		}
		
		System.out.println("Total balance: " + balance);
		System.out.println("Initial balance: " + initBalance);
		System.out.println("Interest earned: " + (balance - initBalance));
		System.out.println("Average monthly income: " + ((balance - initBalance) / month));
	}
}
