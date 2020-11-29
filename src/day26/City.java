package day26;
import java.util.ArrayList;
import java.util.Collections;

public class City {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Aldie");
		cities.add("Chantilly");
		cities.add("Arlington");
		cities.add("Hyannis");
		cities.add("Karaganda");
		
		System.out.println(cities);
		// Collections is a helper class for ArrayList and other collections
		Collections.reverse(cities); 
		
		System.out.println(cities);
		
		for (String city : cities) {
			if (city.equals("Tysons")) {
				System.out.println("Yes!");
			}
		}
		
		System.out.println(cities.contains("Arlington"));
		System.out.println(cities.contains("Tysons"));
		//   0         1         2          3          4
		//[Karaganda, Hyannis, Arlington, Chantilly, Aldie]
		System.out.println(cities.indexOf("Karaganda")); // 0
		System.out.println(cities.indexOf("Aldie"));  // 4
		System.out.println(cities.indexOf("Tysons")); // -1 if element not in list
		
	}
}


