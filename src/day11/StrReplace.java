package day11;

public class StrReplace {
	public static void main(String[] args) {
		// .replace(oldStr, newStr); it will replace the oldStr with newStr
		
		String city = "Alma-Ata";
		System.out.println(city);
		
		city = city.replace("-", " ");
		System.out.println(city);
		
		String str = "Updates=are=available=for=your=software";
		System.out.println(str);
		str = str.replace("=", " ");
		System.out.println(str);
		
		String word = "Hello, World!";
		System.out.println(word);
		word = word.replace("World", "Class");
		System.out.println(word);
		
		String str2 = "Apple.Banana.Kiwi.Orange";
		
		str2 = str2.replace(".", " ");
		str2 = str2.toLowerCase();
		
		System.out.println(str2); // apple banana kiwi orange 
	}
}
