package day28;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ItemStock {
	private ArrayList<Item> itemsInStock = new ArrayList<>();
	
	public ItemStock() {
		loadItems();
	}
	
	public void printAllItems() {
		for (Item item : itemsInStock) {
			System.out.println(item);
		}
	}
	
	/**
	 * This method will load itmes from data.txt file
	 * to itemsInStock list
	 */
	public void loadItems() {
		ArrayList<String> lines = readData();
		for (int i = 1; i < lines.size(); i++) {
			String line = lines.get(i);
			
			String[] parts = line.split(",");
			
//			System.out.println("Name: " + parts[0]);
//			System.out.println("Amount: " + parts[1]);
//			System.out.println("Price: " + parts[2]);
//			System.out.println("-------");
			
			String name = parts[0].trim();
			int amount = Integer.parseInt(parts[1].trim());
			double price = Double.parseDouble(parts[2].trim());
			
			Item item = new Item(name, amount, price);
			itemsInStock.add(item);
		}
	}
	
	// 1. Item should be in the list
	// 2. Items amount should be 1 or greater
	public boolean isItemAvailable(String itemName) {
		for (Item item : itemsInStock) {
			if (item.name.equals(itemName) && item.amount >= 1) {
					return true;
			}
		}
		
		return false;
	}
	
	public Item getItemByName(String itemName) {
		// TODO return item by name from itemsInStock array list
		// 1. Iterate over the itemsInStock list
		// 2. If item is there return it 
		// 3. if item is not there return null
		
		for (Item item : itemsInStock) {
			if (item.name.equals(itemName)) {
				return item;
			}
		}
		
		return null;
	}
	
	// 1. Find item
	// 2. Decrease it's amount by 1
	public void sellItem(String itemName) {
		// "Towels"
		
		for (int i = 0; i < itemsInStock.size(); i++) {
			Item item = itemsInStock.get(i);
			if (item.name.equals(itemName)) {		
				item.amount = item.amount - 1;				
			}
		}
	}
	
	
	public ArrayList<String> readData() {
		ArrayList<String> lines = new ArrayList<>();
		try (BufferedReader bReader = new BufferedReader(new FileReader("src/day28/data.txt"))) {
			bReader.lines().forEach(line -> {
				lines.add(line);
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lines;
	}
}
