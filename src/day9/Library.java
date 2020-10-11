package day9;

public class Library {
	public static void main(String[] args) {
		// Create 2 objects from Book class
		// Assign values 
		// Print some values
		
		Book book = new Book();
		book.title = "OCA";
		book.author = "Jeanne Boyarsky";
		book.pages = 389;
		book.info();
		
		Book ocp = new Book();
		ocp.title = "OCP";
		ocp.author = "Jeanne Boyarsky";
		ocp.pages = 664;
		
		book.read(); // Reading.. OCA
		ocp.read(); // Reading.. OCP
		
	}
}
