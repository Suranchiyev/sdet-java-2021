package day21;

import java.util.Arrays;

public class Assignment {
	public static void main(String[] args) {
		String[] names = {"John", "Alex", "Kuba", "Beknazar"};
		System.out.println(Arrays.toString(names));
		swapFAndL(names);
		System.out.println(Arrays.toString(names)); // [Kuba, Alex, John]
		
		int[] arrNum = {1, 2, 3, 4, 5, 6};
		System.out.println(sumOfEven(arrNum)); // 12
		
	}
	
	public static void swapFAndL(String[] arr) {
		String tmp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = tmp;
	}
	
	public static int sumOfEven(int[] arr) {
		int sumOfEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sumOfEven += arr[i];
			}
		}
		return sumOfEven;
	}
	
}
