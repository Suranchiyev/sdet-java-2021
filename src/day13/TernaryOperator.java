package day13;

public class TernaryOperator {
	public static void main(String[] args) {
		int y = 10;
		int x;
		
		// if y is greater than 5 assign x = y * 2
		// otherwise x = y * 3
		
//		if (y > 5) {
//			x = y * 2;
//		} else {
//			x = y * 3;
//		}
		
		//    C   ?   T   :   F
		x = y > 5 ? y * 2 : y * 3;
		System.out.println(x);
		
		String str = 7 > 8 ? "apple" : "orange";
		System.out.println(str); // orange
		
	    String str2 = 5 > 3 ? "1" : "3";
		
	    int num = (5 > 6) ? (4) : (6 > 5 ? 7 : 8);
	    System.out.println(num); // 7
	    
	}
}
