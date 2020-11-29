package day26;
import java.util.ArrayList;
public class Names {
	public static void main(String[] args) {
		// Array is collection of variables of same type
		// - fixed size
		// - primitives and objects can be array
		
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Bob";
		names[2] = "Alex";
		// names[3] = "Kuba";
		
		ArrayList<String> listName = new ArrayList<>();
		listName.add("John"); // 0
		listName.add("Bob"); // 1
		listName.add("Alex"); // 2
		listName.add("Kuba"); // 3
		listName.add("Bek"); // 4
		System.out.println(listName);
		
		String str = listName.get(0);
		System.out.println("First index: " + str);
		System.out.println("Second index: " + listName.get(1));
		
		//   0     1     2     3    4
		//[Smith, John, Bob, Alex, Kuba, Bek]
		listName.add(0, "Smith"); // add with specific index
		System.out.println(listName);
		
		listName.set(1, "Ilya"); // replace value of specific element by index
		System.out.println(listName);
		
		// ArrayList is collection of variables of the same type
		// - dynamic size
		// - ArrayList supports only objects
		
		// add(value) will add value to your list
		// add(index, value) add value to specific index
		// get(index) will read value based on index 
		// set(index, value) will replace existing element by index
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println(numbers);
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add("white");
		colors.add("blue");
		colors.add("red");
		System.out.println(colors);
		//     0     1     2
		// [white, blue, red]
		System.out.println("Index 2: " + colors.get(2));
		
		String color = colors.get(0);
		
	}
}



