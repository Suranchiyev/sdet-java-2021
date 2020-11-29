package day30;
import java.util.Map;
import java.util.HashMap;

public class MapReview {
	public static void main(String[] args) {
		// Map<K, V> is key value data structure
		// Keys are unique in the map
		// Values are not unique
		// map.put(K, V);
		// map.get(K); -> returns value
		// map.remove(K); will remove entity
		// map.containsKey(K); will return true if map contains that K
		// map.keySet(); return all keys of map as Set<K>
		
		// <K, V>
		Map<String, Double> students = new HashMap<>();
		students.put("John", 90.5);
		students.put("Smith", 65.5);
		students.put("Alex", 100.0);
		students.put("Misha", 95.5);
		System.out.println(students);
		System.out.println("Number of entities: " + students.size());
		
		String studentName = "Alex";
		Double score = students.get(studentName);
		System.out.println(studentName + "'s score: " + score);
		
		students.remove("John"); // remove by Key
		System.out.println(students);
		
		if (students.containsKey("Smith")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		// keySet() -> will return all keys from map as Set<K>
		// iterate over the map
		for (String key : students.keySet()) {
			// System.out.println(key + " : " + students.get(key));
			// if key is already exist put(K, V) will override it
			students.put(key, students.get(key) - 20);
		}
		System.out.println(students);
	}
}


