package day24;

public class Varargs2 {
	public static void main(String[] args) {
		double n1 = 5.5;
		double n2 = 10.5;
		double resSum = sum(n1, n2);
		System.out.println(resSum);
		
		resSum = sum(1.1, 2.4, 5.7, 9.9);
		System.out.println(resSum);
		
		double[] numArr = {2.2, 5.8, 1.1};
		resSum = sum(numArr);
		System.out.println(resSum);
	}
	
	public static double sum(double... numbers) {
		double sum = 0.0;
		for (double num : numbers) {
			sum += num;
		}
		return sum;
	}
}
