package day37;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormaterPractice {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String formattedDate = f.format(today);
		System.out.println(formattedDate);
		
		// today = today.plusYears(1);
		f = DateTimeFormatter.ofPattern("MMM dd, YY");
		System.out.println(f.format(today));
	}
}
