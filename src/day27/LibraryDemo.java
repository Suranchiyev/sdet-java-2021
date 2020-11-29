package day27;
import java.util.ArrayList;

public class LibraryDemo {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.name = "Gum SPring Library";
		lib.address = "24600 Millstream Dr";
		
		lib.addBook(new Book("7 Habits", "R. Covey", 350, Rating.Excellent));
		lib.addBook(new Book("OCA", "Boyrske", 400, Rating.Good));
		lib.addBook(new Book("OCP", "Boyrske", 900, Rating.Good));
		lib.addBook(new Book("Algorithms", "Boyrske", 900, Rating.Good));
		
		
		int nBook = lib.getNumberOfBooks();
		System.out.println("Books: " + nBook); // 3
		
		Book myBook = lib.getBookByTitle("OCP");
		System.out.println(myBook);
		
		System.out.println("Rating - Good:");
		ArrayList<Book> goodBooks = lib.getBookByRating(Rating.Good);
		
		for (Book book : goodBooks) {
			System.out.println(book);
		}
	}
}
