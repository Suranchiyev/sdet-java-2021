package day28;

public class ItemStockTest {
	public static void main(String[] args) {
		ItemStock iS = new ItemStock();
		//iS.printAllItems();
		
		boolean isAv = iS.isItemAvailable("Towels");
		System.out.println(isAv);
		
		Item oil = iS.getItemByName("Towels");
		System.out.println(oil);
		
		iS.sellItem("Towels");
		
		isAv = iS.isItemAvailable("Towels");
		System.out.println(isAv);
		
		Item towel = iS.getItemByName("Towels");
		System.out.println(towel);
	}
}
