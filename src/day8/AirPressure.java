package day8;

public class AirPressure {
	public static void main(String[] args) {
		// Create a method to calculate air pressure message
		// if pressure is from 13.5 to 15.5 then it's "normal pressure"
		// if pressure is less than 13.5 then it's "low pressure"
		// if pressure is greater than 15.5 then it's "high pressure"
		
		airPressure(14.0);
		airPressure(13.5);
		airPressure(60.0);
	}
	
	public static void airPressure(double pressure) {
		if (pressure >= 13.5 && pressure <= 15.5) {
			System.out.println("normal pressure");
			
		} else if(pressure <= 13.5) {
			System.out.println("low pressure");
			
		} else {
			System.out.println("high pressure");
		}
	}
}
