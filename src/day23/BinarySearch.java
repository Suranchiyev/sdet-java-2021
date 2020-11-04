package day23;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5, 11};
		// For binary search we need sorted data/array
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		//  0  1  2  3  4  5   6
		// [0, 2, 3, 5, 6, 7, 10]
		
		int target = 6;
		int sRes = bSearch(num, target);
		System.out.println(sRes); // 
		
		// Arrays binarySearch will assume that data is sorted
		int sRes2 = Arrays.binarySearch(num, 6);
		System.out.println("From Java lib: " + sRes2);
	}
//	Repeat until the (sub)array is of size 0:
//		- Calculate the middle point of the current (sub)array.
//		- If the target is at the middle, stop.
//		- Otherwise, if the target is less than what’s at the middle, repeat,
//		changing the end point to be just to the left of the middle.
//		- Otherwise, if the target is greater than what’s at the middle, repeat,
//		changing the start point to be just to the right of the middle.

	public static int bSearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int middle = end / 2;
       
		while (arr[middle] != target) {
			if (start > end) {
				return -1;
			}
				
			if (arr[middle] < target) {
				start = middle + 1;
			}

			if (arr[middle] > target) {
				end = middle - 1;
			}
			middle = (start + end) / 2;
		}
		return middle;
	}
}
