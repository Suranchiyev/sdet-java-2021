package day11;
import java.util.Scanner;

public class FirstAndLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a word, I will give you first and last chars:");
		String input = sc.next();
		
		System.out.println(input);
		
		// TODO your code
		// you can use substring or charAt
		// together with .length() method
		
		// 1. I will get first char from input string using substring(0, 1) and store in some String var
		// 2. I will get last char from input string using substring(input.length() - 1) and store in some var
		// 3. input = fL + lL;
		
		//   5
		int len = input.length();
		//                       01234
		//       h                hello
		String fLetter = input.substring(0, 1);
		//      o                         
		String lLetter = input.substring(len - 1);
		   //      h    +      o
		input = fLetter + lLetter;
		
		System.out.println(input);	
	}
}
