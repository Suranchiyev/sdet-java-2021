package day24;

import java.util.Arrays;

public class Varargs1 {
	public static void main(String[] args) {
//		String str = join("abc", "qwe"); 
//		String str1 = join("1", "2", "3");
//		
//		String str2 = join("1", "2", "3", "4");
//		String str3 = join("1", "2", "3", "4", "5");
		
		String[] strArr = {"apple", "orange", "kiwi"};
		String str4 = join(strArr);
		System.out.println(str4);
		
		String f = "banana";
		String f2 = "kiwi";
		String str5 = join(f, f2);
		System.out.println(str5);
		
	    String str6 = join("1", "2", "3");
	    
	    join2(6, "1", "2", "3");
	    
	    someMethod(1, 2, 3, 4, 5);
	}
	
	public static void someMethod(int i, int... nums) {
		System.out.println(i);
		System.out.println(Arrays.toString(nums));
		
	}
	
	public static String join2(int num, String ... strs) {
		return null;
	}

	
	public static String join(String... strings) {
		String res = "";
		for (int i = 0; i < strings.length; i++) {
			res += strings[i];
		}
		
		return res;
	}
	
//	public static String join(String str, String str1) {
//		return str + str1;
//	}
//	
//	public static String join(String str, String str1, String str2) {
//		return str + str1 + str2;
//	}
	
	// 1. Only one varargs can be per method
//	public static void myMethod(double... nums, String...strings) {
//		
//	}
	
	// 2. Vararg can be used together with other arguments but it should go as last one
	public static void myMethod(int i, String str, String... strings) {
		
	}
}
