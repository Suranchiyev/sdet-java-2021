package day8;

public class ConditionalBranching {
	public static void main(String[] args) {
		boolean b = false;
		
		// Comparison Operators
		// == equal to (to compare primitives on equality)
		// != not equal to
		// >
		// <
		// >=
		// <=
		
		int i = 9;
		int j = 19;
		if (i == j) {
			System.out.println("they are equal");
		} else {
			System.out.println("they are not equal");
		}
		
		if (i < j) {
			System.out.println("i is less than j");
			
		}
		
		System.out.println("========");
		
		//  9 > 19
		if (i > j) 
			System.out.println("i is greater than j");
		else 		
			System.out.println("some messgae");
		
		int num = 77;
		// if num is between 20 and 80 or number is equal to 7
		// print "That's my number"
		// otherwise print "This is not my number"
		
		//           AND
		if (num > 20 && num < 80 || num == 7) {
			System.out.println("That's my number");
		} else {
			System.out.println("This is not my number");
		}
		
		// && -> AND
		// || -> OR
		// !  -> NOT 
		boolean b3 = !false; // true
		boolean b4 = !true; // false
				
		if (b3) {
			int number = 5;
			int number2 = 5;
			
			if (number == number2) {
				System.out.println("here");
				System.out.println(number);
				System.out.println(b4);
			}
		}
		// System.out.println(number); cannot see number variable
				
	}
}
