package day15;
import java.util.Scanner;

public class BreakMyPassword {
	public static final String PASSWORD = "GoodDay$";
	public static final int LIMIT = 3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password;
		int count = 0;
			
		do {
			System.out.println("Enter your password:");
			password = sc.next();
			count++;               
		} while (!PASSWORD.equals(password) && count < LIMIT);
		
		if (count >= LIMIT) {
			System.out.println("Try after 30 min");
		} else {
			System.out.println(count);
			System.out.println("Accepted");
		}
	}
}
