package day26;
import java.util.ArrayList;

public class Fruits {
	public static void main(String[] args) {
		// Create an ArrayList<String> fruits
		// Add any 4 fruits(elements)
		// Print each value in new line
		
		// add(value) to add element
		// get(index) to get/read element
		// size() get size
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("orange");
		fruits.add("apple");
		
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		System.out.println("------------------");
		// [BANANA, KIWI, ORANGE, APPLE]
		System.out.println(fruits);
		
		// set(index, value) will replace existing element by index
		for (int i = 0; i < fruits.size(); i++) {		
			String el = fruits.get(i).toUpperCase();
			fruits.set(i, el);			
		}
		System.out.println(fruits);
		System.out.println("----------");
		
		//  0       1     2       3
		// [BANANA, KIWI, ORANGE, APPLE]
		//               4 - 1 
		for (int i = fruits.size() - 1; i >= 0; i--) {
			System.out.println(fruits.get(i));
		}
	}
}




