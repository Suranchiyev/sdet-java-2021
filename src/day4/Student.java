package day4;

public class Student {
	public static void main(String[] args) {
		String firstName = "Beknazar";
		String lastName = "Suranchiyev";
		String fullName = firstName + " " + lastName;

		System.out.println(fullName); // Beknazar Suranchiyev

		firstName = "Alex";
		lastName = "Rodriguez";
		fullName = firstName + " " + lastName;

		System.out.println(fullName); // Alex Rodriguez

		firstName = "Kuba";
		//           Kuba             Rodriguez 
		fullName = firstName + " " + lastName;

		lastName = "Zhaanbayev";

		System.out.println(fullName); // Kuba Rodriguez
	
		fullName = firstName + " " + lastName;

		System.out.println(fullName); // Kuba Zhaanbayev

		String str;
		String str1;
		String str2;

		str = "apple";
		str1 = "banana";
		str2 = "kiwi";

	}
}