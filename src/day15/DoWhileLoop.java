package day15;

public class DoWhileLoop {
	public static void main(String[] args) {
		// while
		// do while
	
		int count = 5;
		do {
			System.out.println("Do while loop");
			count--;
			      //0  > 0
		} while (count > 0);
		
		// write the program that will print 0 .. 100 
		// in the same line with space separator
		// 0 1 2 3 4 5 6 7 8 .. 100
		// Use do while loop
		
		int i = 0;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= 100);
	}
}
