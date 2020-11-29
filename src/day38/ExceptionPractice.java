package day38;

import java.util.Arrays;

public class ExceptionPractice {
	public static void main(String[] args) {
		try {
			m();
		} catch (Exception e) {
			System.out.println("Exception is handled");
		}
		
		
		m1();
	}
	
	public static void m1() {
		String[] arr = new String[1000];
		
		m1();
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void m() {
		throw new IllegalArgumentException();
	}
}
