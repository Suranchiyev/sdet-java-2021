package day11;

public class StrEquals {
	public static void main(String[] args) {
		// to compare two Strings we use .equals(String str) method
		// it will return boolean
		// Never use == operator to compare strings
		
		String box = "apple";
		String box1 = "apple";
		
		boolean eq = box.equals(box1);
		if (eq) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
		System.out.println(box1.equals(box));
		System.out.println(box1 == box); // it means they are pointing to same object
		
		System.out.println("-----------");
		String str = new String("apple");
		System.out.println(box1.equals(str)); // true
		System.out.println(box1 == str); // false
		System.out.println("-----------");
		
		String str1 = "orange";
		String str2 = "ORANGE";
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		System.out.println(str1.equals(str2)); //false
		
		str1 = "banana";
		str2 = "BananA";
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}	
