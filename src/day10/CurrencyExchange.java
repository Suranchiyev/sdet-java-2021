package day10;

public class CurrencyExchange {
	public static final double TRANSACTION_FEE = 0.001;
	public static final double EURO_RATE = 0.85;
	public static final double RUBLE_RATE = 78.28;
	public static final double YUAN_RATE = 6.79;
	
	public static double dollarToEuro(double dollar) {
		double euro = dollar * EURO_RATE;
		double trFee = euro * TRANSACTION_FEE;
		return euro - trFee;
	}
	
	public static double dollarToRuble(double dollar) {
		double ruble = dollar * RUBLE_RATE;
		double trFee = ruble * TRANSACTION_FEE;
		return ruble - trFee;
	}
	
	public static double dollarToYuan(double dollar) {
		double yuan = dollar * YUAN_RATE;
		double trFee = yuan * TRANSACTION_FEE;
		return yuan - trFee;
	}
	
	
	public static void main(String[] args) {
		System.out.println(dollarToEuro(25));
		System.out.println(dollarToRuble(25));
		System.out.println(dollarToYuan(25));
	}
}
