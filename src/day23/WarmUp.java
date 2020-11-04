package day23;

public class WarmUp {
	public static void main(String[] args) {
		String[] names = {"John", "Smith", "Bob", "Alex", "Uros"};
		boolean isNameThere = contains(names, "Uros");
		System.out.println(isNameThere); // true
		
		isNameThere = contains(names, "Kuba");
		System.out.println(isNameThere); // false
	}
	
	// return true if value is in strArr array
	// otherwise false
	public static boolean contains(String[] strArr, String value) {
		for (String element : strArr) {		
			if (element.equals(value)) {
				return true;
			}		
		}
		return false;
	}
}
