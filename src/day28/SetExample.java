package day28;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(2);
		numbers.add(0);
		numbers.add(-4);
		System.out.println(numbers);
		
		// Set does not allow duplicates
		// HashSet implementation does not support insertion order
		
		// System.out.println(numbers.get(i)); there is no get method for Set
		for (Integer num : numbers) {
			System.out.println(num);
		}
		
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Alex");
		names.add("John");
		System.out.println(names); // John, Alex
		System.out.println("Size: " + names.size());
		
		names.remove("John");
		System.out.println(names);
		System.out.println("------------");
		
		Set<String> names2 = new LinkedHashSet<>();
		names2.add("John");
		names2.add("Alex");
		names2.add("John");
		names2.add("Bek");
		names2.add("Kuba");
		System.out.println(names2); // [John, Alex, Bek, Kuba]
		// If we want to have insertion order we can use set with LinkedHashSet
		
		System.out.println("------");
		Set<Integer> numbers2 = new LinkedHashSet<>();
		numbers2.add(3);
		numbers2.add(4);
		numbers2.add(3); // dup
		numbers2.add(2);
		numbers2.add(1);
		numbers2.add(2); // dup
		numbers2.add(0);
		numbers2.add(-4);
		System.out.println(numbers2); // LinkedHasSet will keep insertion order
		System.out.println("-------");
		
		Set<String> names3 = new TreeSet<>();
		names3.add("John");
		names3.add("Alex");
		names3.add("John");
		names3.add("Bek");
		names3.add("Kuba");
		names3.add("Azamat");
		System.out.println(names3); // TreeSet is sorted implementation of Set
	}
}
