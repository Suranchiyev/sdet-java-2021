package day27;
import java.util.ArrayList;

public class WarmUp {
	public static void main(String[] args) {
		// TODO
		// Create ArrayList that will hold numbers
		// Add any 5 numbers
		// Print only even numbers using loop
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		for (Integer num : numbers) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

//		for (int i = 0; i < numbers.size(); i++) {
//			if (numbers.get(i) % 2 == 0) {
//				System.out.println(numbers.get(i));
//			}
//		}
		
		System.out.println(numbers);
		// TODO
		// Change all odd number in ArrayList by multiplying by 3
		// 1. Regular for loop because we need index
		// 2. Condition inside the loop to check if number is odd
		// 3. Use set method - set(index, value)
		
		for (int i = 0; i < numbers.size(); i++) {   
			if (numbers.get(i) % 2 == 1) {
				numbers.set(i, numbers.get(i) * 3);
			}
		}
		
		System.out.println(numbers); // [3, 2, 2, 9, 4]
	}
}
