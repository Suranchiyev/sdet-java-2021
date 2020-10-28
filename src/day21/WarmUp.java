package day21;

public class WarmUp {
	public static void main(String[] args) {
		int[] numArr = {4, 3, 2, 1, 5, 8, 7, 9, 18, 0};
		System.out.println(isSevenThere(numArr)); // true
		
		int[] numArr2 = {1, 2, 3, 4, 99};
		System.out.println(isSevenThere(numArr2)); // false
	}
	
	public static boolean isSevenThere(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 7) {
				return true;
			}
		}
		return false;
	}
}
