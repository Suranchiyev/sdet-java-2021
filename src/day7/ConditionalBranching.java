package day7;

public class ConditionalBranching {
	public static void main(String[] args) {
		int number = 5;
		int number2 = 6;

//           5      >  6  => false
		if (number > number2) {
			System.out.println("In line 8");
		} else {
			System.out.println("In line 10");  // In line 10
		}

		if (11 > 9) {
			System.out.println("Line 14");     // Line 14
		}

		if (5 < 3) {
			System.out.println("Line 18");   
		}


		int i = 14;
		int j = 14;
		// equal to operator    
		//                 equal to     
		boolean isEqual = i == j; 
		System.out.println(isEqual); 

		// not equal        is not equal 
		boolean isNotEqual = i != j;
		System.out.println(isNotEqual); // 

		//                 14 > 14 -> false
		boolean isGreater = i > j;
		System.out.println(isGreater); // false

		boolean isGreateOrEqual = i >= j; // true

	}
}