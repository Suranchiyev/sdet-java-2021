package day21;

public class MaxValue {
	public static void main(String[] args) {
		int[] arr = {100, 43, 65, 345, 23, 500, 13};
		// Find and print the biggest element
		
		// [100, 43, 65, 345, 23, 500, 13]
		//    100
		int biggest = arr[0]; // assumption that first element is biggest one
		// check my assumption
		for (int i = 0; i < arr.length; i++) {
			// if some element was bigger than my biggest, reassign biggest
			//   500   <  13
			if (biggest < arr[i]) {
				// 500 = 
				biggest = arr[i];
			}
		}
		
		System.out.println(biggest);
		
	}
}
