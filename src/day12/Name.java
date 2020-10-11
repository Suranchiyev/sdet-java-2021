package day12;
import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.next();
		
		// if name length is greater than 5 ask "Do you have a nick name?"
		if (name.length() > 5) {
			boolean isYes = true;
			
			System.out.println("Do you have a nick name?");
			String originalName = name;
			name = scanner.next();
			if (name.equalsIgnoreCase("No") || name.equalsIgnoreCase("Not")) {
				isYes = false;
				name = originalName;
			}
			
			if (name.length() > 5 && isYes) {
				System.out.println("Shorter nick name?");
				name = scanner.next();
			}
		}
		
		System.out.println("Nice to meet you, " + name + "!");
	}
}
