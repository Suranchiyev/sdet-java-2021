package day15;
import java.util.Scanner;

public class YourName {
	public static void main(String[] args) {
		// Ask a name from a user using Scanner
		// if name length is greater than 5 ask again
		// otherwise print "Hello, <Name>!"
	    
		// Alexander special name
		Scanner sc = new Scanner(System.in);
		String name;
		
		do {		
			System.out.println("What is your name?");
			name = sc.next();
			
			if (name.equals("Alexander")) {
				break; // it will exit the loop
			}
			
		} while(name.length() > 7);
		
		System.out.println("Hello, " + name + "!");
	}

}
