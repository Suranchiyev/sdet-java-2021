package day12;

public class ValidAmount {
	public static void main(String[] args) {
		System.out.println(isValidAmount("$200.01 USD")); // false
		System.out.println(isValidAmount("$1200.00 USD")); // true
		System.out.println(isValidAmount("$900.99 USD")); // false
		System.out.println(isValidAmount("$1000000.00 USD")); // true
	}
	
	public static boolean isValidAmount(String amount) {
		// if amount is greater than 1000(inclusive) is valid amount, and method should return true
		// otherwise return false
			
		amount = amount.replace("$", "").replace(" USD", "");
		//amount = amount.replace(" USD", "");
		
		// amount = amount.substring(1, amount.length() - 3);
		// amount = amount.substring(1, amount.indexOf(" "));
		
		double dAmount = Double.parseDouble(amount);
		if (dAmount >= 1000) {
			return true;
		} else {
			return false;
		}
	}
}
