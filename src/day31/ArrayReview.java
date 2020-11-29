package day31;

import java.util.Arrays;

public class ArrayReview {
	public static void main(String[] args) {
		int[] nArr = new int[5];
		
		nArr[2] = 4;
		//System.out.println(nArr[2]);
		
		// nArr[5] = 6;
		//System.out.println("Size: " + nArr.length);
		
		int[][] dNArr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		System.out.println(Arrays.deepToString(dNArr));
		reverseTwoDim(dNArr);
		System.out.println(Arrays.deepToString(dNArr));
		
		// nested loops to iterate over the mult array
		int sum = 0;
		for (int i = 0; i < dNArr.length; i++) {
			for (int j = 0; j < dNArr[i].length; j++) {
				System.out.println(dNArr[i][j]);
				sum += dNArr[i][j];
			}
		}
		System.out.println(sum);
	}
	
	public static void reverseTwoDim(int[][] arr) {
		// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
		for (int[] innerArray : arr) {
			// System.out.println(Arrays.toString(innerArray));
			//  0  1  2  3
			// [4, 2, 3, 1]
			for (int i = 0; i < innerArray.length / 2; i++) {
				int startIndex = i;
				int endIndex = innerArray.length - 1 - i; 
	
				int tmp = innerArray[startIndex];
				innerArray[startIndex] = innerArray[endIndex];
				innerArray[endIndex] = tmp;
			}
		}
	}
}
