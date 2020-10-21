package day16;

public class CustomMethods {
	public static void main(String[] args) {
		String res = m(7, 8);
		System.out.println(res);
		
		m1("Class");
		m1("World");
		
		String str = "apple";
		System.out.println(str.contains("app"));
		
		int i = str.length();
		
		String sb = str.substring(4);
		sb = str.substring(0, 2);
		
	}
	
	public static String substring(int bIndex) {
		return null;
	}
	
	public static String substring(int bIndex, int endIndex) {
		return null;
	}
	
	public static int length() {
		return 0;
	}
	
	public static boolean contains(String str) {
		return false;
	}
	
	// write a method that will accept two int arguments 
	// and return String
	
	public static String m(int i1, int i2) {
		System.out.println("i: " + i1);
		System.out.println("i2: " + i2);
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Hello");
//		}
		
		// to pass the data into the method
		return null;
	}
	
	public static void m1(String str) {
		System.out.println("Hello, " + str);
		// return; // exit the method
		// System.out.println("Apple");
	}
}
