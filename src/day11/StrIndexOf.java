package day11;

public class StrIndexOf {
	public static void main(String[] args) {
		// indexOf(String)
		// indexOf(char)
		// they will get index of specific string/char

		//            0123456789
		String str = "appleplpas";
		int index = str.indexOf("e");
		System.out.println(index); // 4
		
		System.out.println(str.indexOf('a')); // 0
		System.out.println(str.indexOf("p")); // 1
		System.out.println(str.lastIndexOf("p"));// 7
		System.out.println(str.indexOf("lep")); // 3
		
		//     012
		str = "abc";
		System.out.println(str.indexOf("z"));
		
		System.out.println("---------------");
		
		//                         9            17
		String str1 = "hello world {Java is cool} asdf dsfssfasdf asdfds ";
		
		int indexBeg = str1.indexOf("{");
		int indexEnd = str1.indexOf("}");
		String specStr = str1.substring(indexBeg + 1, indexEnd);
		System.out.println(specStr);
		
		// System.out.println(str1.substring(str1.indexOf("{") + 1, str1.indexOf("}")));
	}
}
