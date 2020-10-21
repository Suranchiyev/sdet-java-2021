package day16;

public class ForLoop3 {
	// main -> Ctrl(Command) + space -> Enter(return)
	
	public static void main(String[] args) {
		// break
		// continue
		for (int i = 0; i < 5; i++) {		
			// 4  == 3
			if (i == 3) {			
				continue;
			}		
			System.out.print(i + " ");
		}
		System.out.println();
		String str = "J$o$h%*n$";
		// $ % *
		System.out.println(str);
		//              
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '$' || ch == '%' || ch == '*') {
				continue;
			}
				
			System.out.println(ch);
		}
		
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				break;
			}
			
			System.out.println(i);
		}
		
	}
}
