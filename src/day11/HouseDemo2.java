package day11;

public class HouseDemo2 {
	public static void main(String[] args) {
		// == to compare references/objects
		
		
		House obj1 = new House();
		House obj2 = new House();
		House obj3 = obj1;
		
		System.out.println(obj1 == obj2); // false
		System.out.println(obj1 == obj3); // true
		System.out.println(obj2 == obj3); // false
		// == will check if two references are pointing to the same object
		
	}
}
