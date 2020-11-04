package day22;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));
		
		bubbleSort(num);
		System.out.println(Arrays.toString(num));
	}
	
	public static void bubbleSort(int[] numArr) {
		int swapCount = 0;
		do {
			swapCount = 0;
			// your code here
			// Write a code that will compare two element in each iteration
			// and if they are not sorted swap
			// count swaps
			//  0  1  2   3
			// [3, 2, 6, 10, 0, 7, 5]	

			for (int i = 0; i < numArr.length - 1; i++) {
				if (numArr[i] > numArr[i + 1]) {
					int tmp = numArr[i];
					numArr[i] = numArr[i + 1];
					numArr[i + 1] = tmp;
					
					swapCount++;
				}
			}
			
		} while (swapCount != 0);
	}
}
