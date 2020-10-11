package day9;

public class MathClass {
	// Math
	public static void main(String[] args) {
		// The Math.abs() method will return the absolute(positive) value of argument passed 
		
		int num = -9;
		int num2 = Math.abs(num);
		System.out.println(num2);
		
		// Math.ceil() method returns a decimal point number value up the 
		// the nearest integer value
		double ceil = Math.ceil(3.01); // 4.0
		System.out.println(ceil);
		
		double floor = Math.floor(4.99); // 4.0
		System.out.println(floor);
		
		double dNum = Math.round(6.51); // 7.0
		double dNum2 = Math.round(6.49); // 6.0
		System.out.println(dNum);
		System.out.println(dNum2);

	}
}
