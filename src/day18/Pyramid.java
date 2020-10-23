package day18;

public class Pyramid {
	public static void main(String[] args) {		
		/**
		 * #
		 * ##
		 * ###
		 * ####
		 * ##### 
		 */
		
		int num = 5;
		String str = "#";
		
		for (int i = 0; i < num; i++) {
			System.out.println(str);
			str = str + "#";
		}
		System.out.println("--------------");
  
		for (int i = 0; i < num; i++) {	
			for (int j = 0; j <= i; j++) {			
				System.out.print("#");				
			}
			System.out.println();		
		}
	}
}











