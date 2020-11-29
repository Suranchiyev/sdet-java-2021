package day28;

public class Item {
	public String name;
	public int amount;
	public double price;
	
	public Item(String name, int amount, double price) {
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", amount=" + amount + ", price=" + price + "]";
	}
}
