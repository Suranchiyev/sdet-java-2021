package day18;

public class OrderedStr {
	public static void main(String[] args) {
		String str = "iabcxz";
		
		// a - 97
		// x - 120
		// b - 98
		// c - 99
		
		// a(97) < b(98)
		// b(98) < c(99)
		// c(99) < x(120)
		for (int i = 0; i < str.length()-1; i++) {
			char letter = str.charAt(i);
			char nextLetter = str.charAt(i + 1);
			// System.out.println(letter + " : " + nextLetter);
			if (letter >= nextLetter) {
				System.out.println("Not ordered");
				break;
			}
		}
		
		// print ordered if str value is alphabetically ordered
		// otherwise print not ordered
		// assume that only letters are there
		
		
		char ch = 'A';
		String str1 = ch + "";
	 // "A"
		str1 = String.valueOf(ch);
		str1 = str1.toLowerCase();
		
		int num = 12;
		//     "12"
		String str2 = String.valueOf(num);
		
	}
}
