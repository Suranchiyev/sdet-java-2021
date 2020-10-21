package day17;

public class LoopsAssignment2 {
	public static void main(String[] args) {
		int res = getNumberOfVowelLetters("Apple");
		System.out.println(res); // 2
		
		System.out.println(removeDuplicates("hello")); // helo
//		System.out.println(removeDuplicates("banana")); // ban
//		System.out.println(removeDuplicates("aaaaa")); // a
//		System.out.println(removeDuplicates("apapaa")); // ap
	}
	
  	public static String transform(String str) {
  		if (str.length() % 2 == 1) {
  			return str.toLowerCase();
  		} else {
  			return str.toUpperCase();
  		}
    }
  	
  	// A, E, I, O, U and a, e, i, o, u
  	// return number of vowel letters in the method argument
  	// getNumberOfVowelLetters("Apple"); // 2
  	// getNumberOfVowelLetters("abc");   // 1
    // getNumberOfVowelLetters("John");  // 1
    // getNumberOfVowelLetters("hmmm");  // 0
  	public static int getNumberOfVowelLetters(String str) { 
  		str = str.toLowerCase();
  		int count = 0;
  		
  		for (int i = 0; i < str.length(); i++) {
  			char letter = str.charAt(i);
  			if (letter == 'a' || letter == 'e' || 
  				letter == 'i' || letter == 'o' || letter == 'u') {
  				count++;
  			}
  		}
  		
  		return count;
  	}
  	
  	// removeDuplicates("hello");     // helo
  	// removeDuplicates("apple");     // aple
  	// removeDuplicates("zzzzzzzzz"); // z
	// removeDuplicates("apapaa");    // ap
  	//                                        "hello"
  	public static String removeDuplicates(String str) {
  		String strNoDup = "";
 
  		for (int i = 0; i < str.length(); i++) {
  			String letter = String.valueOf(str.charAt(i));
  			
  			if (strNoDup.contains(letter)) {
  				strNoDup = strNoDup + letter;
  			} 
  		}
  		
  		return strNoDup;
  	}
}
