package day20;

public class Fruit {
	public static void main(String[] args) {
		String[] fruit = new String[4];
		fruit[0] = "orange";
		fruit[1] = "kiwi";
		fruit[2] = "banana";
		fruit[3] = "apple";
		//     0        1        2         3
		// ["orange"]["kiwi"]["banana"]["apple"]
		
		String str = fruit[2];
		System.out.println(str); // banana
		
		fruit[1] = str;
		fruit[0] = fruit[0].toUpperCase();
		System.out.println("---");
		System.out.println(fruit[0]); // ORANGE
		System.out.println(fruit[1]);
		System.out.println(fruit[2]);
		System.out.println(fruit[3]); // apple
		
		String tmp = fruit[0];
		fruit[0] = fruit[3];
		fruit[3] = tmp;
		
		System.out.println("---");
		System.out.println(fruit[0]); // apple
		System.out.println(fruit[1]);
		System.out.println(fruit[2]);
		System.out.println(fruit[3]); // ORANGE
	}
}	
