package day21;

public class MinValue {
	public static void main(String[] args) {
		int[] arrNum = {5, 3, 1, 6, 7, 8};
		// Find smallest element in the array
		
		// [5, 3, 1, 6, 7, 8]
		int min = arrNum[0]; // 5
		for (int i = 1; i < arrNum.length; i++) {
			if (min > arrNum[i]) {	
				min = arrNum[i];
			}
		}
		System.out.println(min);
	}
}
