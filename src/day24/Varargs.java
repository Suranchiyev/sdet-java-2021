package day24;

public class Varargs {
	public static void main(String[] args) {
		System.out.println(sum(4, 5)); // 9
		System.out.println(sum(3, 4, 7));
		
		int[] numArr = {3, 4, 7, 5};
		System.out.println(sum(numArr)); 
		
		int i = 3;
		int i1 = 4;
		int i2 = 7;
		System.out.println(sum(i, i1, i2));
	}
	
	public static int sum(int... varArr) {
		int sum = 0;
		for (int el : varArr) {
			sum += el;
		}
		return sum;
	}
	
//	public static int sum(int[] arr) {
//		int sum = 0;
//		for (int el : arr) {
//			sum += el;
//		}
//		return sum;
//	}
	
//	public static int sum(int num, int num1, int num2) {
//		return num + num1 + num2;
//	}
//	
//	public static int sum(int num, int num1) {
//		return num + num1;
//	}
}
