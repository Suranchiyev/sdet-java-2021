package day6;

public class AssignmentOperators {
	public static void main(String[] args) {
		int i = 10;
		i = i + 10;
		System.out.println(i); // 20

		i += 10;
		System.out.println(i); // 30

		i++;
		System.out.println(i); // 31

		System.out.println(i++); // 31

		System.out.println(++i); // 33
		System.out.println(i--); // 33
		System.out.println(i);   // 32

		int num = 100;
		num *= 5;
		System.out.println(num); // 500
	}
}