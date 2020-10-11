package day8;

public class Calculator {
	public static void main(String[] args) {
		int res = sum(23, 23);
		int res2 = sum(54, 34, 56);
		double res3 = sum(5.5, 99.9);
		
		System.out.println(res);
	}
	
	public static int sum(int num, int num2) {
		return num + num2;
	}
	
	public static int sum(int num, int num2, int num3) {
		return num + num2 + num3;
	}
	
	public static double sum(double num, double num2) {
		return num + num2;
	}
	
	public static double sum(double num, double num2, double num3) {
		return num + num2 + num3;
	}
	
}
