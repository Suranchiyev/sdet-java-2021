package day15;

public class WhileLoop {
	public static void main(String[] args) {
		int count = 1;
		
		//      11   <= 10 
		while (count <= 10) {
			// loop body
			System.out.println(count); // 1, 2
			count++;
		}
		
		System.out.println("Outside: " + count); // 11
		
		boolean b = true;
		while (b) {
			System.out.println("Second loop");
			 b = false;
		}
		
		System.out.println(b); 
	
	}
}
