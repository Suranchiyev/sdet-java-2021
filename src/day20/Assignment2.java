package day20;

public class Assignment2 {
	public static void main(String[] args) {
		//                 0                                                       6
		String[] name = {"Isla", "Olivia", "Aurora", "Ada", "Charlotte", "Cora", "Ang"};
		for (int i = 0; i < name.length; i++) {
			if (name[i].length() >= 5) {
				System.out.println(name[i]);
			}
		}
		System.out.println("-----");
		
		byte[] score = {9, 8, 7, 5, 5, 6, 9, 10};
		// TODO find out average score and print
		// 1. Get sum of score elements 
		// 2. Divide sum by size of array
		// 3. Print average
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		int average = sum / score.length;
		System.out.println("Average: " + average);
		System.out.println("----------");
		
		int[] numbers = new int[1000];
		//  0   1   2  3   4  5  6  7..   999
		// [1] [2] [3] [] [] [] [] [] .. [1000]
		// TODO assign values for numbers array - 1 .. 1000
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
		System.out.println(numbers[0]); // 1
		System.out.println(numbers[numbers.length - 1]); // 1000
		
		int sum1000 = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum1000 += numbers[i];
		}
		System.out.println("Sum: " + sum1000);
		System.out.println("Average: " + (sum1000 / numbers.length));
	}
}
