package day27;

public class ItemStock {
	public static void main(String[] args) {
		String str = new String("apple");
		int i = 9;
		
		Item item = new Item("apple", "fruit", 5, 1.5);
		System.out.println(item.name.toUpperCase());
		System.out.println(item.category);
		
		if (item.price > 1) {
			System.out.println("Good");
		}
		
		double tPrice = item.calculateTotalPrice();
		System.out.println("total price: " + tPrice);
		
		Item item2 = new Item("banana", "fruit", 2, 2);
		System.out.println(item2.calculateTotalPrice()); // 4
		
		
	}
}
