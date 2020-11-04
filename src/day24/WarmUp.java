package day24;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		String res = rev("apple");
		System.out.println(res); // elppa
		
		int[] nums = {1, 2, 3, 4, 5};
		revArr(nums);
		System.out.println(Arrays.toString(nums)); // [5, 4, 3, 2, 1]
		
		System.out.println(isSame("abc", "cba"));
		System.out.println(isSame("cba", "bca"));
		System.out.println(isSame("abc", "adc"));
		
		int[] arrInput =  {3, 2, 6, 8, 4, 9};
		int[] resIndex = twoSum(arrInput, 7);
		System.out.println(Arrays.toString(resIndex)); // [0, 4] 
	}
	
	//         0  1  2  3  4  5
	// twoSum([3, 2, 6, 8, 4, 9], 7);    -> [0, 4]
	// twoSum([1, 2, 3, 9, 15, 32], 11); -> [1, 3]
	// twoSum([1, 2, 3], 4);             -> [0, 2]
	public static int[] twoSum(int[] arr, int target) {
		int[] resArr = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					resArr[0] = i;
					resArr[1] = j;
					return resArr;
					
				}
			}
		}
		
		return resArr;
	}
	
	// isSame("abc", "cba") -> true
	// isSame("abc", "bca") -> true
	// isSame("cba", "bca") -> true
	// isSame("abc", "adc"); -> false
	// isSame("abc", "abcd") -> false
	// String Anagram coding challenge 
	public static boolean isSame(String str, String str1) {
		// convert strings to array
		char[] fStrArr = str.toCharArray();
		char[] sStrArr = str1.toCharArray();
		
		// sort both arrays
		Arrays.sort(fStrArr);
		Arrays.sort(sStrArr);
		
		// fStrArr.equals(sStrArr); it will work exactly as ==
		// compare arrays
		return Arrays.equals(fStrArr, sStrArr);
	}
	
	//  0  1  2  3  4
	// [1, 2, 3, 4, 5]
	public static void revArr(int[] arr) {
		for (int i = (arr.length - 1) / 2; i >= 0; i--) {
			int bIndex = arr.length - 1 - i;
			int tmp = arr[bIndex];
			arr[bIndex] = arr[i];
			arr[i] = tmp;
		}
	}
	
	// reverse method argument str and return
	public static String rev(String str) {
		String revStr = "";		
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i); 
		}	
		return revStr;
	}
}
