package day37;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePractice {
	public static void main(String[] args) {
		// LocalDate -> works with dates only
		// LocalTime -> works with time only
		// DateTimeFormatter -> helper class to format both date and time
		
		LocalDateTime cDateTime = LocalDateTime.now();
		System.out.println(cDateTime);
		
		cDateTime = cDateTime.plusMonths(4);
		//cDateTime = cDateTime.plusSeconds(100);
		System.out.println(cDateTime);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, HH:mm");
		System.out.println(f.format(cDateTime));
		
		System.out.println("--------------");
		
		String winterOlmpicsStr = "2002-02-08";
		LocalDate winterODate = LocalDate.parse(winterOlmpicsStr);
		System.out.println(winterODate);
		
		String summerOStr = "06/19/1996";
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM/dd/uuuu"); 
		
		LocalDate summerODate = LocalDate.parse(summerOStr, f1);
		System.out.println(summerODate);
	}
}
