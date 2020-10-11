package day5;

public class TypeCasting {
	public static void main(String[] args) {
		// byte -> short -> int -> long -> float -> double

		byte bNum = 50;
		int intNum = bNum; // auto casting

		short shNum = 299;
		long lNum = shNum; // auto casting

		long lNum2 = 100000;
		float fNum = lNum2; // auto casting
		double dNum = lNum2; // auto casting

		// explicit casting
		double dinnerBill = 99.99;
		int numberOfDollars = (int)dinnerBill;
		System.out.println(numberOfDollars); // 99, casting will truncate the value

		char ch = 'x';
		long chNum = ch;
		System.out.println(chNum); // number form ACII table for 'x'
		System.out.println((long)ch); // number form ACII table for 'x'


		// byte -> short -> int -> long -> float -> double
		long l = 500L;
		float f = 55.99F;
		short sh = 23;

		//             long    float
		long result = (long) (l + f + sh);
		System.out.println(result);

		float result1 = l + f + sh;
		System.out.println(result1);


		byte b = 5;
		short sh1 = 14;

		short sh2 = (short)(b + sh1);
		System.out.println(sh2);
	}
}