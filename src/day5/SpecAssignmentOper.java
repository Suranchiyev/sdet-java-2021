package day5;

public class SpecAssignmentOper {
	public static void main(String[] args) {
		int number = 100;

		//110  =  100   + 10
		number = number + 10; 
		System.out.println(number); // 110

		// 60  =  110   - 50
		number = number - 50;
		System.out.println(number); // 60

		//120  =   60   * 2
		number = number * 2;
		System.out.println(number); // 120

		number = number + 10;
		number += 10;

		number = number - 10;
		number -= 10;

		number = number * 2;
		number *= 2;

		int number2 = 200;
		number2 /= 2;
		System.out.println(number2); // 100

		number2 += 100;
		System.out.println(number2); // 200
		System.out.println(number2 + 100); // 300
		System.out.println(number2); // 200
	}
}