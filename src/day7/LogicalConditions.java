package day7;

public class LogicalConditions {
	public static void main(String[] args) {
		// && logical AND
		// || logical OR
		// !  logical NOT

		int number = 20;

		// check if number is between 10 and 50 exclusive
		//                       AND
		boolean b1 = number > 10 && number < 50;
		// when using logical AND the all conditions should be true

		// if the number is 66 or 99 or 7
		//                        OR              OR
		boolean b2 = number == 66 || number == 99 || number == 7;
		// when using logical OR if one condition is true everything becomes true

		// ! - logical NOT
		boolean b3 = !true;
		System.out.println(b3); // false

		boolean b4 = !(5 > 3); 
		System.out.println(b4); // false

		//              f    OR  t
		boolean a = (2 == 1) || (true && 4 >= 3); // true

		//             t AND  t 
		boolean b = !false && true; // true
		//                 true  AND     false
		boolean c = (20 % 2 == 0) && !(5 / 2 <= 2); 
		System.out.println(a); // true
		System.out.println(b); // true
		System.out.println(c); // false

		// false || true => true
		// false && true => false
		// !true         => false
		// !false        => true

		//        t        and   t  -> true
		// (true || false) && (true || false)

		//      t         t      or   f
		// true || false && true || false -> true
	}

	public static void luckyNumbers(int number) {
		// numbers: 7, 99, 107, 77 are lucky numbers
		// if the number is lucky print "Jackpot!"
		// otherwise print "Not today!"
		// Think about using || logical OR
		if (number == 7 || number == 99 || number == 107 || number == 77) {
			System.out.println("Jackpot!");
		} else {
			System.out.println("Not today!");
		}
	}
}