package day14;

public class GroceryStore {
	public static void main(String[] args) {
		/*
		 * water 	-> 2.99
		 * bear  	-> 7.90
		 * red bull -> 2.59
		 */
		String itemName = "water";
		switch (itemName) {
		case "water":
			System.out.println(2.99);	
			break;
		case "bear":
			System.out.println(7.90); 
			break;
		case "red bull":
			System.out.println(2.59);
			break;
		default:
			System.out.println("Invalid item name");
		}
	}
}
