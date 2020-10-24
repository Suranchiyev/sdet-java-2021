package day19;

public class SbMethods {
	public static void main(String[] args) {
		// charAt(), indexOf(), length(), substring()
		// These methods work exactly same as in the String class

		// 012345678
		StringBuilder day = new StringBuilder("Thursday");
		char ch = day.charAt(2);
		System.out.println(ch);

		int index = day.indexOf("d"); // 5
		System.out.println(index);

		System.out.println("Length: " + day.length());

		String strSub = day.substring(0, 4);
		System.out.println(day); // Thursday
		System.out.println(strSub); // Thur

		// append(); it will add value to existing StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("wooden spoon");
		System.out.println(sb);

		// method chain
		sb.append("display").append("settings").append("apple");
		// 0123456789
		System.out.println(sb); // wooden spoondisplaysettingsapple
		System.out.println("------------");

		// insert(index, value) method iserts String to StringBuilder by requested index
		sb.insert(6, " water");
		System.out.println(sb);

		// 0123456
		StringBuilder sb2 = new StringBuilder("animals");
		sb2.insert(7, "-");
		// "animals-"
		System.out.println(sb2);
		// -animals-
		sb2.insert(0, "-");
		System.out.println(sb2);
		// 									   0123456
		StringBuilder sb3 = new StringBuilder("Java language");
		System.out.println(sb3);
		sb3.insert(4, " is");
		System.out.println(sb3); // Java is language
		
		System.out.println("-------------");
		// delete(int start, int end) and deleteCharAt(int index)
		// delete() it will remove characters based on indexes
		//                                    012345
		StringBuilder b4 = new StringBuilder("abcdef");
		b4.delete(1, 3);        // 0123
		System.out.println(b4); // adef
		
		b4.delete(1, 3);
		System.out.println(b4); // af
		
		//                                    0123456789
		StringBuilder b5 = new StringBuilder("Java is cool programming language");
		b5.delete(4, 7);
		System.out.println(b5);
		
		// b5.delete(1, b5.indexOf("e"));
		b5.delete(1, b5.length() - 1);
		System.out.println(b5); // Je
		
		//deleteCharAt(int index) //          0123
		StringBuilder b6 = new StringBuilder("abcd");
		b6.deleteCharAt(1);
		System.out.println(b6);
		
		StringBuilder b7 = new StringBuilder("hello world!");
		b7.reverse();
		System.out.println(b7); // !dlrow olleh
		
		// StringBuilder to String
		StringBuilder b8 = new StringBuilder("John Doe");
		String name = b8.toString();
		System.out.println(name);
		
		// String to StringBuilder
		String name2 = "Alex";
		StringBuilder nameB = new StringBuilder(name2);
		System.out.println(nameB); // Alex
	}
}






