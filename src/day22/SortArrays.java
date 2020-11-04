package day22;

import java.util.Arrays;

public class SortArrays {
	// Break till 9:12 PM EST
	public static void main(String[] args) {
		String[] names = {"Boris", "Akylbek", "Frank", "Selvin", "Edil", "Alex"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names); // merge sort
		System.out.println(Arrays.toString(names));
		
		//           0  1  2  3   4  5  6
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(num[3]); // 10
		
		for (int i = 0; i < num.length; i++) {		
			System.out.println(num[i]);
		}
		
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		// check if array of country in alphabetical order
		String[] country = {"Albania", "Belarus", "Cuba", "Egypt", "France", "ABC"};
		String[] countryCopy = country.clone();	
		Arrays.sort(country);
		System.out.println(Arrays.toString(country));
		System.out.println(Arrays.toString(countryCopy));
		
		//System.out.println(country.equals(countryCopy));// Will not compare actual values
		// == and .equals() will compare if both are pointing to same obejct or not
		
		System.out.println(Arrays.equals(country, countryCopy));
		
		for (int i = 0; i < country.length; i++) {
			if (!country[i].equals(countryCopy[i])) {
				System.out.println("Not equal!");
				break;
			}
		}
	}
}
