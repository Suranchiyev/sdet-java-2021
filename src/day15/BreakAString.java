package day15;

public class BreakAString {
	public static void main(String[] args) {
		//            01234
		String str = "hello";

		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(ch);
			i++;
		}
		
		//     0123
		str = "apple";
		System.out.println("-----------");
		
		i = str.length() - 1;
		while (i >= 0) {
			// 3, 4
			char ch = str.charAt(i);
			System.out.println(ch);
						
			//System.out.println(str.substring(i, i + 1)); 
			i--;
		}
	}
}
