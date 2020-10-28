package day20;

public class Rainbow {
	public static void main(String[] args) {
		//                  0       1        2         3          4       5       6
		String[] color = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
		
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i].toUpperCase());
		}
		
		System.out.println("-----");
		
		for (int i = color.length - 1; i >= 0; i--) {
			System.out.println(color[i]);
		}
		
		System.out.println("------");
		for (int i = 0; i < color.length; i++) {
			color[i] = color[i].toUpperCase();
		}
		
		System.out.println(color[0] + ", " + color[1]);
	}
}
