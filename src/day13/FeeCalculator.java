package day13;

public class FeeCalculator {
	enum Country {USA, Canada, UK, Brazil}
	
	public static final double FEE_USA = 10.00; 
	
	public static void main(String[] args) {
		System.out.println(getFeeByCountry(Country.USA));
		
		double fee = getFeeByCountry(Country.Canada);
		
		// Break 10 min till 9:16 PM ESY
	}
	
	// USA, Canada, UK, Brazil
	public static double getFeeByCountry(Country country) {
		if (country.equals(Country.USA)) {
			return 10.00;
		} else if (country.equals(Country.Canada)) {
			return 12.00;
		} else if (country.equals(Country.UK)) {
			return 9.00;
		} else if (country.equals(Country.Brazil)) {
			return 8.00;
		} else {
			return 8.00;
		}
	}
}
