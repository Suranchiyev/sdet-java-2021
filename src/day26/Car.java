package day26;
import java.util.ArrayList;

public class Car {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>(); 	
		cars.add("bmw");
		cars.add("audi");
		cars.add("honda");
		cars.add("tesla");
		cars.add("ford");

		int size = cars.size(); // find out what the length of array list
		System.out.println("Size: " + size);
		System.out.println(cars);
		
		cars.remove(1); // remove by index
		System.out.println(cars);
		
		cars.remove("ford"); // remove by value
		System.out.println(cars);
		
		// cars.clear(); // will remove all values
		System.out.println(cars);
		System.out.println("Size after remove: " + cars.size());
		//   0     1     2
		// [bmw, honda, tesla]
		System.out.println(cars.get(0));
		System.out.println(cars.get(1));
		System.out.println(cars.get(2));
		System.out.println("----------");
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("----------");
		for (String car : cars) {
			System.out.println(car);
		}
	}
}





