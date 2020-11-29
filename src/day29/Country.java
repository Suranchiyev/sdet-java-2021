package day29;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Country {
	public static void main(String[] args) {
		Map<String, String> country = new HashMap<>();
		country.put("USA", "washinton");
		country.put("Canada", "ottawa");
		country.put("Brazil", "brasilia");
		
		// Iterate over the map and print each key and value
		// keySet() -> return keys of the map
		System.out.println(country);
		
		// [Canada, USA, Brazil]
		Set<String> keys = country.keySet();
		System.out.println(keys);
		
		//             : [Canada, USA, Brazil]
		for(String key : keys) {
			// key = USA              
			System.out.println(key + " : " + country.get(key));
		}
		System.out.println("----------");
		
		for (String key : keys) {
			String value = country.get(key);
			value = value.substring(0, 1).toUpperCase() + value.substring(1);
			country.put(key, value); // change the value of entity
		}
		System.out.println(country);
		System.out.println("----------------");
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three !!!");
		map.put(3, "Three");
		map.put(4, "Four!");
		map.put(4, "Four!!");
		map.put(4, "Four!!!");
		map.put(4, "Four!!!!");
		System.out.println(map.size()); // 4
		System.out.println(map);
		
		for (Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}
