package day27;
import java.util.ArrayList;

public class BookDemo {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		// Book b1 = new Book("7 Habits of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		// System.out.println(b1);
		// bookList.add(b1);
		
		bookList.add(new Book("7 Habits of Highly Effective People", "R. Covey", 350, Rating.Excellent));
		bookList.add(new Book("The 10X Rule", "G. Cardone", 250, Rating.Good));
		bookList.add(new Book("Educated", "T. Westover", 350, Rating.Good));
		
		for (Book book : bookList) {
			System.out.println(book);
		}
		System.out.println("----------");
		
		ArrayList<Book> bookList2 = new ArrayList<>();
		bookList2.add(new Book("7 Habits of Highly Effective People", "R. Covey", 350, Rating.Excellent));
		bookList2.add(new Book("The 10X Rule", "G. Cardone", 250, Rating.Good));
		bookList2.add(new Book("Educated", "T. Westover", 350, Rating.Good));
		
		for (Book book : bookList2) {
			System.out.println(book);
		}
		System.out.println("----------");
			
		if (bookList.equals(bookList2)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
//		if (listEquals(bookList, bookList2)) {
//			System.out.println("Yes, they are equal!");
//		} else {
//			System.out.println("No, thet are not equal!");
//		}
			
	}
	
	public static boolean listEquals(ArrayList<Book> list, ArrayList<Book> list2) {
		if (list.size() != list2.size()) {
			return false;
		}
		
		for (int i = 0; i < list.size(); i++) {
			Book book1 = list.get(i);
			Book book2 = list2.get(i);
			if (!bookEquals(book1, book2)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean bookEquals(Book b, Book b1) {
		boolean isTitleEq = b.title.equals(b1.title);
		boolean isAuthorEq = b.author.equals(b1.author);
		boolean isPagesEq = b.pages == b1.pages;
		boolean isRatingEq = b.rating == b1.rating;
		
		return isTitleEq && isAuthorEq && isPagesEq && isRatingEq;
	}
}
