package day14;

public class Rating {
	enum MovieRating {EXCELLENT, AVERAGE, BAD}
	
	public static void main(String[] args) {
		String message = getRatingMessage(MovieRating.EXCELLENT);
		System.out.println(message);
		
		message = getRatingMessage(MovieRating.BAD);
		System.out.println(message);
	}
	
	// if rating EXCELLENT -> return "You must see this movie!"
	// if rating AVERAGE   -> return "This is Ok, but not great."
	// if rating BAD       -> return "Skip it."
	public static String getRatingMessage(MovieRating rating) {
		switch (rating) {
		case EXCELLENT:
			return "You must see this movie";
		case AVERAGE:
			return "This is OK, but not great.";
		case BAD:
			return "Skip it.";
		default:
			return "invalid rating";
		}
	}
}
