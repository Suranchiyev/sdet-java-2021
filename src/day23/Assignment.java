package day23;
import java.util.Arrays;

public class Assignment {
	public static void main(String[] args) {		
		int[][] numbers = {
			 {1532, 1113, 1124, 1134, 1145},
			 {1158, 1191, 1208, 1225, 1242},
			 {1216, 1174, 1191, 1208, 1225},
			 {1276, 1262, 1286, 1311, 1335},
			 {1340, 1338, 1370, 1403, 1436},
			 {1323, 1244}
			};
		System.out.println(Arrays.deepToString(numbers));
		
		for (int i = 0; i < numbers.length; i++) {
			int sumOfRow = 0;
			for (int j = 0; j < numbers[i].length; j++) {
				sumOfRow += numbers[i][j];
			}
			System.out.println("Sum of row: " + sumOfRow);
		}
		System.out.println("------------");
		
		int totalSum = 0;
		for (int i = 0; i < numbers.length; i++) {	
			for (int j = 0; j < numbers[i].length; j++) {
				totalSum += numbers[i][j];
			}
		}		
		System.out.println("Total sum: " + totalSum);
		
		// Average value of numbers array - totalSum / numberOfElements
		
		int numberOfElments = 0;
		for (int[] innerArr : numbers) {
			numberOfElments += innerArr.length;
		}
		System.out.println("Average: " + (totalSum / numberOfElments));
		
		// for each loop
		int[] n = {1, 2, 3, 4, 5};
		for (int i : n) {
			System.out.println(i);
		}
	}
}
