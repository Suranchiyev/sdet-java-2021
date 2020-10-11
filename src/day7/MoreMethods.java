package day7;

public class MoreMethods {

	public static void main(String[] args) {
		int res = min(88, 78);
		System.out.println(res); // 78

		res = min(5, 7);
		System.out.println(res); // 5

		System.out.println(bigNum(1000)); // 1000
		System.out.println(bigNum(99)); // 0
		System.out.println(bigNum(9999)); // 9999
	}

//                              5           7
	public static int min(int numOne, int numTwo) {
		//    5   <    7 -> true
		// boolean b1 = numOne < numTwo;
		if (numOne < numTwo) {
			//       5
			return numOne;
		} else {
			return numTwo;
		}
	}

	public static int bigNum(int number) {
		if (number >= 1000) {
			return number;
		} else {
			return 0;
		}
	}

	public static void badNum(int num) {
		// if the method arg num is equal to 13
		// print "13 is bad number"
		// otherwise -> <num> is regular number
		if (num == 13) {
			System.out.println("13 is bad number");
		} else {
			System.out.println(num + " is regular number");
		}
	}

	public static void luckyNumbers(int num) {
		// 7
		// 99
		if (num == 7) {
			System.out.println("Lucky you!");
		} 

		if (num == 99) {
			System.out.println("Lucky you!");
		}
	}
}