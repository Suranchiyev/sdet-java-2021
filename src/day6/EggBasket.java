package day6;

public class EggBasket {
	public static void main(String[] args) {
		int numberOfBaskets, eggsPerBasket, totalEggs;

		String numberOfBasketsStr = args[0];

		numberOfBaskets = Integer.parseInt(numberOfBasketsStr);
		eggsPerBasket = 6;

		totalEggs = numberOfBaskets * eggsPerBasket;
		System.out.println("If you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " basket, then");
		System.out.println("the total number of eggs is " + totalEggs);
	}
}