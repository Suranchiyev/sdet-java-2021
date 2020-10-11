package day5;

public class IncrementDecrementOper {
	public static void main(String[] args) {
		int i = 10;
		i = i + 1;

		System.out.println(i); // 11

		i++; // post increment will increment value of variable by 1

		System.out.println(i); // 12
		System.out.println(i); // 12

		i++;
		System.out.println(i); // 13

		++i;
		System.out.println(i); // 14

		// in post increment it will increase in the next statement
		// in pre increment it will increase in the same statement

		System.out.println(i++); // 14
		System.out.println(i); // 15

		System.out.println(++i); // 16

		//        16 +  18  + 5 - 17 
		int num = i++ + ++i + 5 - --i;
		System.out.println(num); // 22

		i--;
		--i;


	}
}