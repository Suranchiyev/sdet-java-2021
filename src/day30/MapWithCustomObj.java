package day30;
import java.util.Map;
import java.util.HashMap;

public class MapWithCustomObj {
	public static void main(String[] args) {
		// Map<K, V>
		
		Map<Integer, Student> students = new HashMap<>();
		
		Student s = new Student("John", "Java", 50);
		// System.out.println(s);
		students.put(1, s);
		
		students.put(2, new Student("Smith", "Java", 95));
		students.put(3, new Student("Alex", "SQL", 78));
		students.put(4, new Student("Vijay", "API", 100));
		
		System.out.println(students);
		System.out.println("--------");
		
		int totalScore = 0;
		for (Integer key : students.keySet()) {
			Student student = students.get(key);
			totalScore += student.score;
		}
		System.out.println("Total score: " + totalScore);
		System.out.println("Average score: " + (totalScore / students.size()));
		
	}
}
