package day22;

public class WarmUp {
	public static void main(String[] args) {
		//                0  1  2  3  4
		int[] arrInput = {4, 3, 8, 2, 7};
		System.out.println(getMinIndex(arrInput)); // 3
		
		//                   0  1  2  3
		int[] arrInput2 = { -4, 1, 6, 9};
		System.out.println(getMinIndex(arrInput2)); // 0
	}
	
	// return index of smallest number
	//              0  1  2  3  4
	// getMinIndex([4, 3, 8, 2, 7]); -> 3
	public static int getMinIndex(int[] numArr) {
		int min = numArr[0];
		int minIndex = 0;

		for (int i = 0; i < numArr.length; i++) {
     
			if (min > numArr[i]) { 
				min = numArr[i];
 				minIndex = i;
			}
		}
		
		return minIndex;
	}
}
