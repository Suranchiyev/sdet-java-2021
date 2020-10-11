package day6;

public class Addition {
	public static void main(String[] args) {
		String arg1 = args[0];
		String arg2 = args[1];

		int num1 = Integer.parseInt(arg1);
		int num2 = Integer.parseInt(arg2);
		int result = num1 + num2;

		System.out.println(num1 + " + " +  num2 + " = " + result);
	}

	// java Addition 5 9
	// 5 + 9 = 14

	// java Addition 10 100
	// 10 + 100 = 110
}