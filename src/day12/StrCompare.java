package day12;

public class StrCompare {
	public static void main(String[] args) {
		// .compareTo(String); to check the lexicographic(alphabetic) order (ACII)
		String l = "c";
		String l2 = "a";
		
		//                "a".compareTo("c")
		System.out.println(l2.compareTo(l)); 
		// if negative number, "a" is before "c" in ACII table
		
		//                "c"          "a"
		System.out.println(l.compareTo(l2));
		// "c" is after "a"
		
		l = "a";
		l2 = "a";
		System.out.println(l.compareTo(l2)); // if both parts are same, we got 0
			
		String name1 = "Alex";
		String name2 = "Azamat";
		String name3 = "Beckham";
		String name4 = "John";
		
		// name1 > name2 > name3 > name4
		
		//               if negative number here, the order is correct
		boolean b = name1.compareTo(name2) <= 0;
		boolean b1 = name2.compareTo(name3) <= 0;
		boolean b2 = name3.compareTo(name4) <= 0;
		
		if (b && b1 && b2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
