package day37;

import java.time.LocalDate;

public class DatePractice {
	public static void main(String[] args) {
		
		// current date
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate birthDay = LocalDate.of(1995, 3, 26);
		System.out.println("Birthday: " + birthDay);	
		System.out.println("Day of Week: " + birthDay.getDayOfWeek());
		System.out.println("Is leap year: " + birthDay.isLeapYear());
		System.out.println("Era: " + birthDay.getEra());
		
		LocalDate afterThreeMonth = birthDay.plusMonths(3);
		System.out.println("After three month: " + afterThreeMonth);
		
		LocalDate plusTwoWeeks = afterThreeMonth.plusWeeks(2);
		System.out.println("After two weeks:" + plusTwoWeeks);
		
		// Break till 9:18 PM
	}
}
