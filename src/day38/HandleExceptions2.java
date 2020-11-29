package day38;

import java.util.Scanner;

public class HandleExceptions2 {
	public static void main(String[] args) {
		// Lunch break till 1:00 PM EST
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numebr as word:");
		String str = sc.next();	
		
		try {
			getMsg(str);
		} catch (Exception e) {
			System.out.println("We support only one and two for now");
		}
		// we support only one and two for now
	}
	
	public static void getMsg(String str) {
		switch (str.toLowerCase()) {
		case "one" :
			System.out.println(1);
			break;
		case "two" :
			System.out.println(2);
			break;
		default:
			throw new IllegalArgumentException(str + " is not valid");
		}
	}
}
