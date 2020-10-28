package day20;

public class Cars {
	public static void main(String[] args) {
		String[] cars = new String[5];
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		int[] nums = new int[1000]; // [0] [0] [0] [0]
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		boolean[] arrB = new boolean[10];
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + " ");
		}
		System.out.println();
		
		String[] books = new String[3];
		books[0] = "OCA";
		books[1] = "OCP"; 
		books[2] = "Algorithms";
		
		System.out.println(books[0]); // OCA
		
		changeArr(books);		
		System.out.println(books[0]); // Design Patterns
		
		//books[3] = "";
	}
	
	public static void changeArr(String[] arr) {   
		// arr = books;
		arr[0] = "Design Patterns";
	}
}


