package day20;

public class WarmUp2 {
	// E - economy class
	// B - business class
	// F - First class
	enum FlightClass {E, B, F}
	
	public static void main(String[] args) {
		double price = getFlightPrice(FlightClass.E);
		System.out.println(price); // 499.9
		
		price = getFlightPrice(FlightClass.F);
		System.out.println(price); // 999.9
	}
	
	/* Return price based on this mapping:
	 * Economy class  - 499.9
	 * Business class - 699.9
	 * First class    - 999.9
	 */
	public static double getFlightPrice(FlightClass fClass) {
		// equals
		// ==
		switch (fClass) {
		case E:
			return 499.9;
		case B:
			return 699.9;
		case F:
			return 999.9;
		default:
			return -1;
		}
		
		// return -1;
	}
}






