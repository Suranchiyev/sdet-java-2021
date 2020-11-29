package day31;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReview {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>(); 
		// ArrayList can hold only objects
		
		colors.add("red");
		colors.add("black");
		colors.add("white");        //    0       1       2
		System.out.println(colors); // ["red", "black", "white"] 
		System.out.println(colors.get(2));
		
		colors.set(0, "green");
		System.out.println(colors);
		
		// if I want to sort my colors. How do I do?
		Collections.sort(colors);
		Collections.binarySearch(colors, "white");
		
		System.out.println(colors.size());
		
		// Collections is helper class for list (collections)
		// Arrays is helper class for array
		
		ArrayList<ArrayList<String>> listOfList = new ArrayList<>();
		
		ArrayList<String> l = new ArrayList<>();
		l.add("a");
		l.add("b");
		listOfList.add(l);
		
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("c");
		l2.add("d");
		listOfList.add(l2);
		
		System.out.println(listOfList); // [[a, b], [c, d]]
		
	}
}
