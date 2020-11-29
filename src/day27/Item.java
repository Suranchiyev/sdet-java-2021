package day27;

public class Item {
	public String name;
	public String category;
	public int amount;
	public double price;
	
	public Item(String name, String category, int amount, double price) {
		this.name = name;
		this.category = category;
		this.amount = amount;
		this.price = price;
	}
	
	public double calculateTotalPrice() {
		return price * amount;
	}	
}
