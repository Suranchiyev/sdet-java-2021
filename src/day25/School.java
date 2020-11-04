package day25;

public class School {
	public static void main(String[] args) {
		Person[] ppl = new Person[4];
		ppl[0] = new Person("John", "Doe", 24);
		ppl[1] = new Person("Bob", "Marley", 55);
		ppl[2] = new Person("Ilia", "Stepanov", 28);
		ppl[3] = new Person("Alex", "Smith", 36);
		
		// Iterate over the array and print out only first names
		for (int i = 0; i < ppl.length; i++) {
			System.out.println(ppl[i].firstName);
		}
		System.out.println("----------");
		// Print only last names
		for (Person person : ppl) {
			System.out.println(person.lastName);
		}
	}
}
