package day23;

import java.util.Arrays;

public class MArray {
	public static void main(String[] args) {
		int[][] numArr = new int[2][3];
		//    0           1
		// [[4][ ][7]], [[3][ ][ ]]
		//   0  1  2      0  1  2
		
		numArr[0][0] = 4;
		numArr[1][0] = 3;
		numArr[0][2] = 7;
		

		
		System.out.println(numArr);
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}
				
		for (int[] innerArr : numArr) {
			System.out.println(Arrays.toString(innerArr));
		}
		System.out.println("------");
		System.out.println(Arrays.deepToString(numArr));
		
		System.out.println("------");
		//                             0                   1                 2
		String[][] strArr = {{"123", "321", "231"}, {"456", "654"}, {"789", "987", "879"}};
		//                      0      1      2        0      1        0      1      2
		System.out.println(Arrays.deepToString(strArr));
		
		// instead of 654 I want to reassign 999
		strArr[1][1] = "999";
		System.out.println(Arrays.deepToString(strArr));
	}
}






