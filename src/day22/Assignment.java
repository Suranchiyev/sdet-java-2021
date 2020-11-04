package day22;

import java.util.Arrays;

public class Assignment {
	public static void main(String[] args) {
		int[] arrNums = {99, 7, 87, 2, 1, 55, 43, 22};
		
		Arrays.sort(arrNums);
		
		// find second biggest
		System.out.println(arrNums[arrNums.length - 2]);
	}
}
