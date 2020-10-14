package day13;

public class DayOfWeek {
	enum Day {Mon, Tue, Wed, Thur, Fri, Sat, Sun}
	
	// Enumerations (Enum) in Java
	// - An enum provides a way to restrict the values for a variable
	// - An enum is used as constants(String) in Java
	public static void main(String[] args) {
		myWeek(Day.Mon);
		myWeek(Day.Sun);
		myWeek(Day.Fri);
	}
	
	/**
	 * Based on day print this message:
	 * Mon - Home work day!
	 * Tue - Java day!
	 * Wed - Chill day!
	 * Thur - Java day!
	 * Fri - Coding day!
	 * Sat - Java epic day!
	 * Sun - Java epic day!
	 */
	public static void myWeek(Day day) {
		if (day.equals(Day.Mon)) {
			System.out.println("Home work day!");
		} else if (day.equals(Day.Tue) || day.equals(Day.Thur)) {
			System.out.println("Java day!");
		} else if (day.equals(Day.Wed)) {
			System.out.println("Chill day!");
		} else if (day.equals(Day.Fri)) {
			System.out.println("Coding day!");
		} else if (day.equals(Day.Sat) || day.equals(Day.Sun)) {
			System.out.println("Java epic day!");
		}
	} 
}
