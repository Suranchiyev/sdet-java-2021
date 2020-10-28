package day21;

import java.util.Arrays;

public class ArrRef {
	public static void main(String[] args) {
		// 1. Primitives are not using references. So when we reassign the actual value will
		//    be coppy. 
		// 2. String is immutable class and it will act as primitive.
		// 3. Objects and Arrays are working with references. When we reassing the references, it 
		//    it will just point to the same object
		
		//        12ass1
		String[] arrStr = {"a", "b", "c"};
		//        12ass1
		String[] arrStr1 = arrStr;
		
		System.out.println(arrStr);
		System.out.println(arrStr1);
		
		System.out.println(Arrays.toString(arrStr));
		System.out.println(Arrays.toString(arrStr1));
		
		arrStr1[0] = "z";
		arrStr[0] = "e";
		
		System.out.println(Arrays.toString(arrStr)); //  e b c
 		System.out.println(Arrays.toString(arrStr1)); // e b c
 		
 		int i = 10;
 		addOne(i);
 		System.out.println(i); // 10
 		
 		int j = i;
 		j += 1;
 		
 		System.out.println(i); // 10
 		
 		System.out.println(j); // 11
 		
 		i = i + 1;
 		
	}
	
	public static void addOne(int num) {
		num += 1;
	}
	
	
	
	
}
