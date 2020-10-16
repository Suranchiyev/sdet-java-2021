package day14;

public class WarmUp {
	public static void main(String[] args) {
		String str = isEvenOrOdd(7);
		System.out.println(str); // odd number
		
		str = isEvenOrOdd(4);
		System.out.println(str); // even number
		
		int res = max(8, 99);
		System.out.println(res); // 99
		
		res = max(4, 2);
		System.out.println(res); // 4
		
		String resStr = upperOrLowerCase("Apple");
		System.out.println(resStr); // apple
		
		resStr = upperOrLowerCase("Orange"); // 6 = even
		System.out.println(resStr); // ORANGE
	}
	
	public static String isEvenOrOdd(int number) {
		String str = number % 2 == 0 ? "even number" : "odd number";
		return str;
	}
	
	public static int max(int i, int i2) {
		int m = i > i2 ? i : i2;
		return m;
	}
	
	
	public static String upperOrLowerCase(String str) {
		str = str.length() % 2 == 0 ? str.toUpperCase() : str.toLowerCase();
		return str;
	}
}
