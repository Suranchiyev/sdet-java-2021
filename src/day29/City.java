package day29;
import java.util.Map;
import java.util.HashMap;

public class City {
	public static void main(String[] args) {
		Map<String, Integer> cities = new HashMap<>();
		cities.put("Arlington", 229164);
		cities.put("Leesburg", 375629);
		cities.put("Manassas", 451721);
		cities.put("Richmond", 210309);
		cities.put("Alexandria", 147391);
		cities.put("Norfolk", 245782);
		
		// 1. TODO print each city in this format
		// city: Arlington, population: 229164
		// city: K, population: V
		for (String key : cities.keySet()) {
			System.out.println("city: " + key + ", population: " + cities.get(key));
		}
		System.out.println("---------");
		
		// 2. TODO write a code that will print total population of the cities
		//    in the cities map
		// 	  1. create int sum = 0;
		//    2. Iterate over the map and add each value to sum var
		//    3. Print sum variable
		
		int sumPopulation = 0;
		for (String key : cities.keySet()) {
			sumPopulation += cities.get(key);
		}
		System.out.println("Total population: " + sumPopulation);
		System.out.println("---------");
		
		// 3. TODO Print name of the city with biggest population
		int max = 0;
		String maxPopulationCity = "";
		
		for (String key : cities.keySet()) {
			if (max < cities.get(key)) {
				max = cities.get(key);
				maxPopulationCity = key;
			}
		}
		System.out.println("Biggest city: " + maxPopulationCity + ", population: " + max);
		System.out.println("-------------");
		
		System.out.println(cities);
		
		// 4. TODO increase each city population(value) by 100000
		//  [Manassas] [Leesburg] [Alexandria] [Arlington] [Richmond] [Norfolk]
		for (String key : cities.keySet()) {
			cities.put(key, cities.get(key) + 100000);
		}
		System.out.println(cities); 
	}
}
