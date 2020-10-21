package day17;

public class LoopAssignment1 {
	public static void main(String[] args) {
//		printOnlyEvenNumbers(5);
//		System.out.println();
//		printOnlyEvenNumbers(15);
		
		int sum = sumOfAllNums(3);
		System.out.println(sum);
		
		sum = sumOfOddNums(5);
		System.out.println(sum);
	}
	
	// TODO print all even numbers from 0 to provided number argument in the same line
	// printOnlyEvenNumbers(5);  // 2 4 
	// printOnlyEvenNumbers(15); // 2 4 6 8 10 12 14
	public static void printOnlyEvenNumbers(int number) {
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	// return sum of all numbers from 0 to number inclusive
	// sumOfAllNums(3); // 1 + 2 + 3 = 6
	// sumOfAllNums(4); // 1 + 2 + 3 + 4 = 10
	public static int sumOfAllNums(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
	
	// return sum of odd numbers from 0 to number inclusive
	// sumOfAllNums(3); // 1 + 3 = 4
	// sumOfAllNums(4); // 1 + 3 = 4
	// sumOfAllNums(5); // 1 + 3 + 5 = 9
	public static int sumOfOddNums(int number) {
		int sumOfOdd = 0;
		
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				sumOfOdd += i;
			}
		}
		
		return sumOfOdd;
	}
	
	
}
