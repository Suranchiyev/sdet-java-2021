package day19;

public class StringPool {
	public static void main(String[] args) {
		// ==
		// for primitives it will compare the value 
		// for references/object it will compare addresses if they are pointing to
		// the same object or not.
		
		String a = "apple";		
		String b = "apple";
	
		System.out.println(a == b); // true
		//  "APPLE"
		a = a.toUpperCase();
		
		System.out.println(a); // apple
		System.out.println(a == b);
		
		String str = new String("hello");
		String str2 = new String("hello");
		System.out.println(str == str2); // false. They are not pointing to the object
		
	}
}
