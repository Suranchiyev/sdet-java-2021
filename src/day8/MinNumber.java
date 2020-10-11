package day8;

public class MinNumber {
	public static void main(String[] args) {
		System.out.println(getMin(2, 4)); // 2
		System.out.println(getMin(5, 69, 9)); // 5
		
		System.out.println(getMax(4, 5, 6, 42)); // 42
		System.out.println(getMax(4, 50, 6, 42)); // 50
		System.out.println(getMax2(4, 5, 60, 42)); // 60
		System.out.println(getMax2(400, 5, 60, 42)); // 400

	}
	
	public static int getMin(int num, int num2) {
		if (num < num2) {
			return num;
		} else {
			return num2;
		}
	}
	
	public static int getMin(int num, int num2, int num3) {
		if (num < num2 && num < num3) {
			return num;
		} else if (num2 < num && num2 < num3) {
			return num2;
		} else {
			return num3;
		}
	}
	
	public static int getMin(int num, int num2, int num3, int num4) {
		int firstPart = getMin(num, num2);
		int secondPart = getMin(num3, num4);
		int smallestInt = getMin(firstPart, secondPart);
		return smallestInt;
	}
	
	public static int getMax(int i, int i1) {
		// ==, !=, >, <, >=, <=
		if (i > i1) {
			return i;
		} else {
			return i1;
		}
		
	}
	
	public static int getMax(int i, int i1, int i2, int i3) {
		if (i > i1 && i > i2 && i > i3) {
			return i;
		} else if (i1 > i && i1 > i2 && i1 > i3) {
			return i1;
		} else if (i2 > i && i2 > i1 && i2 > i3) {
			return i2;
		} else {
			return i3;
		}
	}
	
	public static int getMax2(int i, int i1, int i2, int i3) {
		int a = getMax(i, i1);
		int b = getMax(i2, i3);
		int result = getMax(a, b);
		return result;
	}
}
