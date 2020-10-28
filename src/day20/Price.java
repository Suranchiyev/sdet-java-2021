package day20;

public class Price {
	public static void main(String[] args) {
		double[] price = new double[3];
		price[0] = 14.99;
		price[1] = 9.99;
		price[2] = 1.50;
		
		// 1. find out the sum(total price) of all element
		double priceTotal = price[0] + price[1] + price[2];
		System.out.println("Total price: " + priceTotal);
		
		// 2. Average price
		double averagePrice = priceTotal / 3;
		System.out.println("Average price: " + averagePrice);
	}
}
