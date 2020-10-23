package day18;

public class Pyramid1 {
	public static void main(String[] args) {
		/*
		 *  #####
		 *  ####
		 *  ###
		 *  ##
		 *  #
		 */
		
		int num = 5;	
		outer: for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			
			System.out.println();
		}
		
		// outer: is label for my outer loop
		// I can use labels to break/continue the outer loop from inner loop
		// ex: break outer;
		
	}
}







