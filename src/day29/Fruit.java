package day29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fruit {
	public static void main(String[] args) {
		//    K   ,  V
		Map<String, Double> fruit = new HashMap<>();
		// [k = Orange, v = 1.05] [k = Mango, v = 0.50] [k = Apple, v = 0.76]
		
		fruit.put("Orange", 1.05);
		fruit.put("Mango", 0.50);
		fruit.put("Apple", 0.76);
		fruit.put("Lemon", 1.47);
		fruit.put("Banana", 1.39);
		System.out.println(fruit);
		// there is no indexes in the map
		Double applePrice = fruit.get("Apple");
		System.out.println("Apple price is " + applePrice);
		
		System.out.println(fruit.get("Mango")); // 0.50
		Double lemonPrice = fruit.get("abc");
		System.out.println(lemonPrice); // if key is not part of the map, it will return null 
		
		// Get sum of prices of Mango, Banana and Orange
		//                   0.5                    1.39                   1.05
		Double sumPrice = fruit.get("Mango") + fruit.get("Banana") + fruit.get("Orange");
		System.out.println("Price sum: " + sumPrice);
		
		// put(K, V) - will put element into map
		// get(K) - it will return V based on the key, if key is not in the map, it will return null
		// containsKey(K) - returns true if key in the map otherwise false
		
		boolean isThere = fruit.containsKey("Kiwi");
		System.out.println("Kiwi is in the map: " + isThere);
		
		String strKey = "Orange";
		if (fruit.containsKey(strKey)) {
			System.out.println("Price: " + fruit.get(strKey));
		} else {
			System.out.println("Key is not in the map: " + strKey);
		}
		
		// containsValue(V) true if value is there
		System.out.println(fruit.containsValue(0.50));
		System.out.println("-------");
		
		// remove(K); - will remove entity from the map (K , V)
		System.out.println(fruit);
		fruit.remove("Orange"); // if key is not there nothing will happen
		System.out.println(fruit);
		
		// HashMap impl of Map does not maintain insertion order
		
		// keySet() -> return all the keys of the as Set<K>
		System.out.println("--- KEYS ---");
		Set<String> keys = fruit.keySet();
		System.out.println(keys);
		
		// Mango=0.5
		fruit.put("Mango", 1.50);
		System.out.println(fruit);
	}
}


