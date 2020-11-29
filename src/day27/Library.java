package day27;
import java.util.ArrayList;

public class Library {
	public String name;
	public String address;
	private ArrayList<Book> books;
	
	public void addBook(Book book) {
		if (books == null) {
			books = new ArrayList<>();
		}
		
		books.add(book);
	}
	
	public int getNumberOfBooks() {
		return books.size();	
	}
	
	public Book getBookByTitle(String title) {
		for (Book b : books) {
			if (b.title.equals(title)) {
				return b;
			}
		}	
		return null;
	}
	
	public ArrayList<Book> getBookByRating(Rating rating) {
		ArrayList<Book> res = new ArrayList<>();
		//                 [Book] [Book] [Book] [Book]
		for (Book book : books) {
			if (book.rating.equals(rating)) {
				res.add(book);
			}
		}
		return res;
	}
}
