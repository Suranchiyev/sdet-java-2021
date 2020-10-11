package day6;

public class Multiply {
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]); // 2

		int num2 = Integer.parseInt(args[1]); // 5
		int result = num1 * num2;

		System.out.println(num1 + " * " + num2 + " = " + result); // 10
	}
}