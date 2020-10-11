package day9;

public class Restaurant {
	public static void main(String[] args) {
		
		Table table1 = new Table();
		System.out.println(table1);
		// @5e265ba4 this is address to our
		// object in memory
		
		table1.color = "black";
		table1.type = "4 people table";
		table1.height = 50;
		table1.width = 200;
		table1.isReserved = false;
				
		// Using method of object table1
		table1.displayDetails();
		System.out.println("===============");
		
		Table table2 = new Table();
		table2.color = "white";
		table2.type = "8 people table";
		table2.height = 50;
		table2.width = 400;
		table2.isReserved = true;
		table2.displayDetails();
	}
}
