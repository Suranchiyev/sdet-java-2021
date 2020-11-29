package day38;

public class PersonDemo {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("John Doe");
		person.setAge(2);
		
		System.out.println("Here");
		System.out.println("--------------");
		
		System.out.println(makeUpperCase("apple"));
		System.out.println(makeUpperCase("ab"));
		// Break till 2:21 PM EST
	}
	
	public static String makeUpperCase(String str) {
		if (str.length() < 3) {
			 throw new RuntimeException("str length was less than 3");
			// throw new Exception("str length was less than 3");		
		}
		
		return str.toUpperCase();
	}
}
