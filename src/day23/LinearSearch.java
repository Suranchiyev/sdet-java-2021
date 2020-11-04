package day23;

public class LinearSearch {
	public static void main(String[] args) {
		//                       0      1       2 
		String[] arrNumbers = {"One", "Two", "Three", "Four", "Five"};
		System.out.println(lSearch(arrNumbers, "Five"));
		System.out.println(lSearch(arrNumbers, "Seven"));
		
		int[] num = {6, 3, 2, 100, 0};
		// TODO implement overloading method that will work for int[] and int
		int i = 3;
		System.out.println(lSearch(num, i)); // 1
	}
	
	public static int lSearch(String[] arr, String target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	
	public static int lSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
