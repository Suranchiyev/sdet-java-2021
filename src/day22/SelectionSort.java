package day22;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));
		
		sortArray(num);
		System.out.println(Arrays.toString(num));
	}
	// 0   1   2  3   4  5  6
	// 0,| 3,  2, 10, 6, 7, 5
	// 0,  2,| 3, 10, 6, 7, 5
	
	public static void sortArray(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			//       2                           2
			int indexOfMin = getMinIndex(numArr, i);
			//           1,   2
			swapElements(i, indexOfMin, numArr);
		}
	}
	
	public static int getMinIndex(int[] numArr, int startIndex) {
		int min = numArr[startIndex];
		int minIndex = startIndex;
		for (int i = startIndex; i < numArr.length; i++) {
			if (min > numArr[i]) {
				min = numArr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void swapElements(int indexOne, int indexTwo, int[] arr) {
		int tmp = arr[indexOne];
		arr[indexOne] = arr[indexTwo];
		arr[indexTwo] = tmp;
	}
}
