package day12;

public class StringMethods {
	public static void main(String[] args) {
		// length       -> how long the string/ how many character in the string
		// toUpperCase  -> will convert(will return new string) to upper case 
		// toLowerCase  -> will convert(will return new string) to lower case
		// substring    -> we can get portion/part of the string using this method
		// indexOf      -> it will get specific index of string/char
		// charAt       -> we can use to get specific char from string based on index
		// replace      -> it will replace old values with new
		// trim         -> it will remove spaces around the string " app le " -> "app le"

		//            01234
		String str = "Ora cle ";
		int i = str.length();
		System.out.println(i);
		
		String strUpper = str.toUpperCase();
		System.out.println(str); // String is immutable - original string will never get changed.
		System.out.println(strUpper);
		
		String strLower = str.toLowerCase();
		System.out.println(strLower); // ora cle
		
		String first3 = str.substring(0, 3);
		System.out.println(first3); // Ora
		System.out.println(str); // Ora cle
		
		//     0123456789
		str = "Programmer";
		String lLetter = str.substring(4);
		System.out.println(lLetter); // rammer
		
		//  length - 4
		
		//     012345678910
		str = "JavaScript";      

		int l = str.length(); 
		                      //       10 - 1
		String lLetter2 = str.substring(l - 1);
		System.out.println(lLetter2); // a
		
		String java = str.substring(0, 4);
		System.out.println(java);
		
		System.out.println(getSecondPart("abcd"));
		System.out.println(getSecondPart("banana"));
		System.out.println(getSecondPart("12345678"));
		
		//     01234
		str = "booko";
		int index = str.indexOf("k");
		System.out.println(index);
		
		System.out.println(str.indexOf("b")); // 0
		System.out.println(str.indexOf("o")); // 1
		System.out.println(str.lastIndexOf("o"));// 4
		System.out.println("----------------");
		
		                //01234567....    16
		String message = " {Alex} Hello,!";
		
		int iOne = message.indexOf("{");
		int iTwo = message.indexOf("}");
		System.out.println("First: " + iOne);
		System.out.println("Second: " + iTwo);
		
		String key = message.substring(iOne + 1, iTwo);
		System.out.println(key);
		System.out.println("------------------");
		
		// charAt(index) it will return specific char based on argument
		//             01234
		String str2 = "hello";
		char ch = str2.charAt(4); 
		System.out.println(ch);
		
		//      01234
		str2 = "book";
		//    4
		int len2 = str2.length();
		//                         4 - 1 => 3 charAt(3)
		char lastCh = str2.charAt(len2 - 1);
		System.out.println(lastCh);
		System.out.println("------------");
		
		String str3 = "smart-water";
		String str4 = str3.replace("water", "apple");
		System.out.println(str3); // smart-water
		System.out.println(str4); // smart water
		
		System.out.println("----------");
		System.out.println(lengthNoSpace(" c a r")); // 3
		System.out.println(lengthNoSpace("car")); // 3
		System.out.println(lengthNoSpace("ap  ple  ")); // 5
		
		System.out.println("----------");
		String str5 = "  ca r ";
		String strTrim = str5.trim(); // trim will remove spaces around the string
		System.out.println(str5);
		System.out.println(strTrim);
	}
	
	public static int lengthNoSpace(String str) {
		str = str.replace(" ", "");
		return str.length();
	}

	//  0123456
	// "abcd"
	// "banana"
	// "12345678"
	public static String getSecondPart(String str) {
		// we assume that str argument will only have even(length) strings
		// return second part of the string 
		
		// str.substring(2); // abcd -> cd : 4 / 2 = 2
		// str.substring(3); // banana  : 6 / 2 = 3
		// str.substring(4);  // 12345678 : 8 / 2 =4
		
		int len = str.length();
		str = str.substring(len / 2);
		return str;
	}
	
}
