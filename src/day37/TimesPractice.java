package day37;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimesPractice {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		//now = now.plusHours(1);
		//now = now.minusMinutes(36);
		System.out.println(now);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println("Formatted time: " + formatter.format(now));
	}
}
