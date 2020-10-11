package day8;
import java.util.Scanner;

public class PersonInfo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		String city;
		
		System.out.println("What is your name?");
		name = scanner.next();
		
		System.out.println("What's your age?");
		age = scanner.nextInt();
		
		System.out.println("Where are you from?");
		city = scanner.next();
		
		System.out.println("-- your information sent --");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
		System.out.println("--------------------------");
	}
}
