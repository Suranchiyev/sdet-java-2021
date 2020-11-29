package day31;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class WarmUp {
	public static void main(String[] args) {
		double[] numbers = {1.9, 2.3, 1.2, 5.1, 9.9, 4.4};
		
		Map<Integer, Double> map = new HashMap<>();
		map.put(1, 1.1);
		map.put(2, 0.1);
		map.put(3, 1.2);
		map.put(4, 0.2);
		map.put(5, 1.3);
		map.put(6, 1.9);
		map.put(7, 2.1);
		map.put(8, 2.3);
		map.put(9, 5.1);
		map.put(10, 9.9);
		map.put(11, 4.1);
		map.put(12, 4.2);
		map.put(13, 4.3);
		map.put(14, 5.2);
		
		// remove entities from the map which value is not in the numbers array
		// remove(K);
		
		List<Integer> keysToRemove = new ArrayList<>();
		for (Integer key : map.keySet()) {
			if (!contains(numbers, map.get(key))) {
				keysToRemove.add(key);
			}
		}
		
		
		for (Integer mapKeyToRemove : keysToRemove) {
			map.remove(mapKeyToRemove);
		}
		
		System.out.println(map);
	}
	
	public static boolean contains(double[] arr, double target) {
		for (double dNum : arr) {
			if (dNum == target) {
				return true;
			}
		}
		
		return false;
	}
	
}
