package day19;

public class ImmutableStr {
	public static void main(String[] args) {
		// String is immutable - we cannot change
		String str ="apple";
		str = str + ", orange";
		// Total 2 object of String class is created by above snippet 
		System.out.println(str);
		
		
		String str2 = "";
		for (int i = 0; i < 50; i++) {
			str2 = str2 + i;
		}
		// Total 51 objects of String class is created by above snippet(loop)
		System.out.println(str2);
		
		// String is immutable in order to change we need to reassign
	}
}
