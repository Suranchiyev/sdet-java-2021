package day21;

import java.util.Arrays;

public class ArrayRecap {
	public static void main(String[] args) {
		// Array is a collection of data of same type
		// Fixed size collection, we need to specify size while we create
		// Arrays class is helper class for array
		
		int[] numArr = new int[3]; // [] [] []
		numArr[0] = 7;
		numArr[1] = 6;
		numArr[2] = 9;
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(numArr));
		
		int[] num1 = {1, 2, 3, 4, 6 , 899};
		System.out.println(Arrays.toString(num1));
		
		String[] cities = new String[] {"Chantilly, Aldie, Tysons, Arlington"};
		System.out.println(Arrays.toString(cities));
	}
}
