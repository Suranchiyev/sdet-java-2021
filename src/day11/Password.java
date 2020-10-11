package day11;
import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide new password:");
		
		String password = sc.next();
		
		// if the length of password is less than 5 print "Weak password - length should be more than 5"
		// if the password does not contain $ or % or ! print "Weak password - missing spec chars"
		// otherwise print "Password is accepted"
		
		if (password.length() < 5) {
			System.out.println("Weak password - length should be more than 5");
		} else if (!(password.contains("$") || password.contains("%") || password.contains("!"))) {
			System.out.println("Weak password - missing spec chars");
		} else {
			System.out.println("Password is accepted");
		}
	}
}
