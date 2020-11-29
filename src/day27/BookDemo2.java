package day27;

import java.util.ArrayList;

public class BookDemo2 {
	public static void main(String[] args) {
		Book b1 = new Book("7 Habits of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		Book b2 = new Book("7 Habits of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		// equals -> ==
		if (b1.equals(b2)) {
			System.out.println("Yes, they are equal");
		} else {
			System.out.println("No, they are not equal");
		}
		
		ArrayList<Book> l1 = new ArrayList<>();
		l1.add(b1);
		l1.add(b2);
		
		ArrayList<Book> l2 = new ArrayList<>();
		l2.add(b1);
		l2.add(b2);

		if (l1.equals(l2)) {
			System.out.println("Yes");
		}
	}
}
