package day30;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterview {
	public static void main(String[] args) {
		// How to iterate over the map
		
		String str = "hello";
		
		// create a method that will accept String as argument
		// count letters and add right after this letter
		// countL(str) -> "h1e1l2o1"
		// countL("aabb")  -> "a2b2"
		// countL("apple") -> "a1p2l1e1"
		
		System.out.println(countL(str)); // h1e1l2o1
		System.out.println(countL("aabb")); // a2b2
		System.out.println(countL("apple")); // a1p2l1e1
	}
	
	public static String countL(String str) {
		Map<Character, Integer> lettersMap = new LinkedHashMap<>();
		
		for (char letter : str.toCharArray()) {
			if (lettersMap.containsKey(letter)) {
				lettersMap.put(letter, lettersMap.get(letter) + 1);
			} else {
				lettersMap.put(letter, 1);
			}
		}
		String res = "";     
		for (Character key : lettersMap.keySet()) {                      
			res += String.valueOf(key) + lettersMap.get(key);
		}
		return res;
	}
	
}
