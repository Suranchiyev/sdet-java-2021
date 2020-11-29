package day32;

import java.util.Arrays;

public class FixedArray {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		// numbers[3] = 4;
		int[] numbersCopy = new int[4];
		
		for (int i = 0; i < numbers.length; i++) {
			numbersCopy[i] = numbers[i];
		}
		
		numbers = numbersCopy;
		
		numbers[3] = 4;
		System.out.println(Arrays.toString(numbers));
		
		// List<String> list = new ArrayList<>(); 
		
	}
}





