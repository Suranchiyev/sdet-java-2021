package day10;

public class CalculatorDemo {
	public static void main(String[] args) {
		// static methods should be used by class name
		int res = Calculator.sum(3, 5);
		
		boolean isEven = Calculator.isEven(2);
		boolean isOdd = Calculator.isOdd(4);
		
	}
}
