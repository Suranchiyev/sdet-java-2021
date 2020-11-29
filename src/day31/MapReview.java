package day31;
import java.util.Map;
import java.util.HashMap;

public class MapReview {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 5);
		map.put(2, 5);
		map.put(2, 6);
		map.put(5, 6);
		map.put(7, 7);
		System.out.println(map);
		
		// can you get sum of the values from this map?
		
		int sum = 0;
		for (Integer key : map.keySet()) {
			sum += map.get(key);
		}
		System.out.println(sum);
	}
}
